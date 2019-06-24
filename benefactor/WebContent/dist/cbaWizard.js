'use strict';

angular.module('cba.wizard', []);

'use strict';

/**
 * @name cbaWizard
 * @description The cbaWizard creates a wizard-like form with state transitions from step to step.
 * It is written to be generic and should handle multiple UI/UX designs/workflows.
 */
angular.module('cba.wizard')
    .controller('CbaWizardController', [

        '$scope', '$element', 'TypeformTransitionProvider', 'DefaultWorkflowProvider', '$timeout', '$q',
        function ($scope, $element, TypeformTransitionProvider, DefaultWorkflowProvider, $timeout, $q) {

            var steps = {}, self = this, transitionProvider,
                workflowProvider, currentStepId,
                events = {
                    onStepAdded: [],
                    onStepRemoved: [],
                    onStepLeave: [],
                    onStepEnter: [],
                    onStart: [],
                    onSubmit: []
                },
                options = {
                    disableWhenInactive: false
                };

            function runEventPipeline(funcs, args) {
                angular.forEach(funcs, function (func) {
                    func(args);
                });
            }

            /**
             * Initialize the wizard with options
             * @param initOptions {*} the options for the wizard
             * @param attrs {*} angularjs attributes
             * @returns {*}
             */
            this.init = function (initOptions, attrs) {

                function attachEvents(initOptions, attrs) {

                    function uiBoundEvent(expression, args) {
                        $scope.$eval(expression, args);
                    }

                    angular.forEach(events, function (eventsArray, eventName) {
                        if (angular.isFunction(workflowProvider[eventName])) {
                            eventsArray.push(angular.bind(workflowProvider, workflowProvider[eventName]));
                        }
                        if (angular.isFunction(transitionProvider[eventName])) {
                            eventsArray.push(angular.bind(transitionProvider, transitionProvider[eventName]));
                        }

                        // controller overrides
                        var camelCaseEvent = eventName[0].toUpperCase() + eventName.substring(1);
                        if (angular.isFunction(initOptions[eventName])) {
                            eventsArray.push(initOptions[eventName]);
                        }
                        else if (attrs['cbaWizard' + camelCaseEvent]) {
                            eventsArray.push(angular.bind(self, uiBoundEvent, attrs['cbaWizard' + camelCaseEvent]));
                        }
                    });
                }

                function setProvidersAndOptions(initOptions) {
                    options = angular.extend(options, initOptions);
                    transitionProvider = initOptions.transitionProvider || new TypeformTransitionProvider();
                    workflowProvider = initOptions.workflowProvider || new DefaultWorkflowProvider();

                    workflowProvider.init(self, $element);
                    transitionProvider.init(self, $element);

                    options.progress = options.progress || attrs.cbaWizardProgress;
                    if (options.progress) {
                        $scope[options.progress] = 0;
                    }
                }

                setProvidersAndOptions(initOptions, attrs);
                attachEvents(initOptions, attrs);

                return this;
            };

            /**
             * Get wizard options.
             * @returns {Object} Wizard options.
             */
            this.getOptions = function () {
                return options;
            };

            /**
             * Start the wizard
             * @returns {*}
             */
            this.start = function () {
                runEventPipeline(events.onStart);

                var stepId = workflowProvider.getFirstStep();
                if (stepId && steps[stepId]) {
                    steps[stepId].controller.setActive(true);
                    currentStepId = stepId;
                }

                return this;
            };

            /**
             * Updates validity of all steps and updates the progress calculation
             * @returns {*}
             */
            this.updateProgress = function () {
                if (workflowProvider) {
                    $scope[options.progress] = workflowProvider.getProgress(currentStepId);
                }
                return this;
            };

            /**
             * Adds a step to the wizard
             * @param step {*}
             * @returns {*}
             */
            this.registerStep = function (step) {

                if (steps[step.id]) {
                    return this;
                }

                steps[step.id] = step;
                this.updateProgress();
                runEventPipeline(events.onStepAdded, { step: step.id, steps: steps });
                return this;
            };

            /**
             * Removes a step from the wizard
             * @param stepId {string} the name of the state
             * @returns {*}
             */
            this.removeStep = function (stepId) {
                delete steps[stepId];
                this.updateProgress();
                // angular won't remove the dom element until all events handled.
                $timeout(function () {
                    runEventPipeline(events.onStepRemoved, { step: stepId, steps: steps });
                });
                return this;
            };

            /**
             * Moves the wizard forward a step
             * @returns {*}
             */
            this.next = function () {
                var self = this;

                // ensure next digest - allow reordering of wizard steps (change in workflow) on the same click event
                // as the next button
                $timeout(function () {
                    var next = workflowProvider.getNextStep(currentStepId);
                    if (next) {
                        self.setActiveStep(next, {
                                event: 'next',
                                requiresFocus: true
                            }
                        );
                    }
                });
                return this;
            };

            /**
             * Moves the wizard backwards a step
             * @returns {*}
             */
            this.previous = function () {
                var self = this;

                // ensure next digest - allow reordering of wizard steps (change in workflow) on the same click event
                // as the next button
                $timeout(function () {
                    var previous = workflowProvider.getPreviousStep(currentStepId);
                    if (previous) {
                        self.setActiveStep(previous, {
                                event: 'previous',
                                requiresFocus: true
                            }
                        );
                    }
                });
                return this;
            };

            this.scrollToCurrentStep = function (event) {
                transitionProvider
                    .performTransition(currentStepId, currentStepId, steps, event);
            };

            /**
             * Sets the current step of the wizard to be the one specified
             * @param stepId {string} step identifier
             * @param event {*} event obj specifying the calling event
             * @returns {*}
             */
            this.setActiveStep = function (stepId, event) {
                var self = this,
                    force = event && event.force;

                if (!steps[stepId] || (steps[stepId].controller.isActive() && !force)) {
                    return $q.when(true);
                }

				runEventPipeline(events.onStepLeave, { step: currentStepId, event: event });
				// if a step has been deleted, e.g. due to ng-if condition, there is nothing to set
				if (steps[currentStepId]) {
					steps[currentStepId].controller.setActive(false);
				}

                if (!transitionProvider || !angular.isFunction(transitionProvider.performTransition)) {
                    throw new Error('There is no transition manager set up to perform wizard step transitions');
                }

                return transitionProvider
                    .performTransition(currentStepId, stepId, steps, event)
                    .then(function () {
                        runEventPipeline(events.onStepEnter, { step: stepId, event: event });
                        steps[stepId].controller.setActive(true, event);
                        currentStepId = stepId;
                        self.updateProgress();
                    });
            };

            /**
             * Completes the wizard, will show errors if validation errors exist
             * otherwise will call options.onSubmit()
             */
            this.submit = function () {
                var formCtrl = $element.controller('form');

                // force validation of all steps
                angular.forEach(steps, function (item) {
                    item.controller.validate();
                });

                this.updateProgress();
                runEventPipeline(events.onSubmit, { isValid: formCtrl.$valid });
            };
        }])

    .directive('cbaWizard', [ 'lazyContentHelper', function (lazyContentHelper) {

        return {
            require: ['cbaWizard', 'form'],
            controllerAs: 'wizardCtrl',
            controller: 'CbaWizardController',
            link: {
                pre: function (scope, element, attrs, ctrl) {

                    var options = attrs.cbaWizard ? scope.$eval(attrs.cbaWizard) : {},
                        wizardCtrl = ctrl[0];

                    wizardCtrl.init(options, attrs);
                },
                post: function (scope, element, attrs, ctrl) {

                    var wizardCtrl = ctrl[0];

                    lazyContentHelper
                        .awaitContentLoaded(scope)
                        .then(function () {
                            wizardCtrl.start();
                        });

                    element
                        .on('focus.wizard.cba', '.wizard-step-inactive', function () {
                            wizardCtrl.setActiveStep($(this).attr('id'), {
                                event: 'focus',
                                requiresFocus: false
                            });
                            scope.$apply();
                        })
                        .on('$destroy', function () {
                            element.off('focus.wizard.cba', '.wizard-step-inactive');
                        });
                }
            }
        };
    }]);



'use strict';

/**
 * @name cbaWizardButton
 * @description Will validate the page before proceeding to either the next page, or completion of the wizard.
 */
angular.module('cba.wizard')
    .directive('cbaWizardButton', function () {
        return {
            require: ['^cbaWizardStep', '^cbaWizard'],
            link: function (scope, element, attrs, controllers) {

                var stepCtrl = controllers[0],
                    wizardCtrl = controllers[1],
                    input = element.is('label') ? $('#' + element.attr('for')) : element;

                function onClick(evt) {
                    scope.$apply(function () {
                        var type = attrs.type ? attrs.type.toLowerCase() : '';
                        var isValid = stepCtrl.next();

                        if (!isValid) {
                            stepCtrl.focusFirstError();
                        } else if (type === 'submit') {
                            wizardCtrl.submit();
                        }
                    });

                    // Want to stop "submit" from submitting form, but allow "checkbox" and "radio" to update form values.

                    if (!input.is('[type="checkbox"],[type="radio"]')) {
                        evt.preventDefault();
                    }
                }

                element
                    .on('click', onClick)
                    .on('$destroy', function () {
                        element.off('click', onClick);
                    });
            }
        };
    });

'use strict';

/**
 * @name cbaWizardStep
 * @description The cbaWizardStep directive treats a dom element as an isolated section.
 * This step validates separately to the rest of the form and must pass validation
 * before proceeding to the next step in the wizard.
 */
angular.module('cba.wizard')
    .controller('CbaWizardStepController', ['$scope', '$attrs', '$element', function ($scope, $attrs, $element) {

        var formCtrl, wizardCtrl, options;

        /**
         * Initializes the controller with options provided by the linking function
         * @param formController
         * @param wizardController
         * @param initOptions
         */
        this.init = function (formController, wizardController) {
            formCtrl = formController;
            wizardCtrl = wizardController;
            options = wizardCtrl.getOptions();

            return this;
        };

        /**
         * Returns validity of the step
         * @returns {boolean} is valid or not
         */
        this.isValid = function () {
            return formCtrl.$valid;
        };

        /**
         * Returns active state of the step
         * @returns {boolean} is active or not
         */
        this.isActive = function () {
            return $scope.isStepActive;
        };

        /**
         * Sets this step as a active / inactive step in the wizard workflow
         * @param isActive {boolean} the active state
         */
        this.setActive = function (isActive) {

            // transition events
            if ($scope.isStepActive && !isActive && $attrs.stepLeave) {
                $scope.$eval($attrs.stepLeave);
            } else if (!$scope.isStepActive && isActive && $attrs.stepEnter) {
                $scope.$eval($attrs.stepEnter);
            }

            $scope.isStepActive = isActive;

            // If element is a fieldset, tie its disabled state to step's
            // active state.
            if (options.disableWhenInactive && $element.prop('tagName').search(/fieldset/i) === 0) {
                $element.prop('disabled', !isActive);
            }

            return this;
        };

        /**
         * Returns the progress weighting for this step. Default is a weighting of 10
         * @returns {*|number} weighting
         */
        this.getProgressWeighting = function () {
            return $attrs.progressWeight ? Number($attrs.progressWeight) : 10;
        };

        /**
         * Attempts to go next by validating the step and if valid will continue the wizard
         * @returns {boolean} valid state
         */
        this.next = function () {

            var isValid = this.validate();
            if (isValid) {
                wizardCtrl.next();
            }

            return isValid;
        };

        /**
         * Forces a form to be dirty and returns validity
         * @returns {boolean} isValid
         */
        this.validate = function () {

            // set dirty
            formCtrl.$setDirty();
            angular.forEach(formCtrl, function (item, name) {
                if (name.substring(0, 1) !== '$') {
                    var ngModel = formCtrl[name];
                    if (!ngModel.$dirty && ngModel.$setViewValue) {
                        ngModel.$setViewValue(ngModel.$viewValue);
                    }
                }
            });

            return formCtrl.$valid;
        };

        /**
         * Focuses on the input/select with the first error in a wizard step
         */
        this.focusFirstError = function () {
            if (formCtrl.$invalid) {
                // find first input that is visible and invalid and focus it
                $element.find('.ng-invalid:input:visible:first').focus();
            }
        };
    }])
    .directive('cbaWizardStep', function () {

        var templates =
        {
            overlay: '<div class="wizard-overlay">',
            activeClasses: 'data-ng-class="{\'wizard-step-active\': isStepActive, \'wizard-step-inactive\': !isStepActive}" '
        };

        return {
            require: ['cbaWizardStep', '^cbaWizard', 'form'],
            controller: 'CbaWizardStepController',
            controllerAs: 'wizardStepCtrl',
            transclude: true,
            scope: true,
            replace: true,

            // add ng-form directive and extra markup to the step
            template: function (element, attrs) {
                var tag = element[0].nodeName,
                    extraAttrs = !attrs.ngForm ? 'data-ng-form' : '';

                return '<' + tag + ' ' + templates.activeClasses + extraAttrs + '></' + tag + '>';
            },
            link: function (scope, element, attrs, controllers, transcludeFn) {

                var stepCtrl = controllers[0],
                    wizardCtrl = controllers[1],
                    ngFormCtrl = controllers[2];

                if (!attrs.id || attrs.id === '') {
                    throw new Error('Wizard step must have an id set eg) id="step1"');
                }

                // need control over the transcluded scope - keeping it hierarchical
                transcludeFn(scope, function (clone) {
                    element.append(clone);
                });

                // add the ng-form controller to the scope so that it can be used in wizard step for validation,
                // consumer can setValidity, etc..
                scope.form = ngFormCtrl;

                stepCtrl
                    .init(ngFormCtrl, wizardCtrl)
                    .setActive(false);

                wizardCtrl.registerStep({
                    id: attrs.id,
                    controller: stepCtrl,
                    element: element
                });

                function onKeydown(evt) {
                    if (evt.keyCode === 13) {
                        var target = $(evt.target);
                        if (!target.is('a') && !target.is('[data-cba-wizard-ignore-enter]') && target.parents('[data-cba-wizard-ignore-enter]').length === 0) { // A link should be clicked, rather than submitting form.
                            // If enter on field with wizard button then click wizard button. If enter on wizard button or custom wizard button then handle normally.
                            var wizardButtonSelector = '[data-cba-wizard-button], [cba-wizard-button], [data-cba-wizard-button-with-click], [cba-wizard-button-with-click]';
                            if (!target.is(wizardButtonSelector) && target.parents(wizardButtonSelector).length === 0) {
                                $('[data-cba-wizard-button], [cba-wizard-button]', element).click();
                                evt.preventDefault();
                            }
                        }
                    }
                }

                element
                    .addClass('wizard-step wizard-step-inactive')
                    .append(templates.overlay)
                    .on('keydown', onKeydown)
                    .on('$destroy', function () {
                        if (wizardCtrl) {
                            wizardCtrl.removeStep(attrs.id);
                            element.off('keydown', onKeydown);
                        }
                    });
            }
        };
    });

'use strict';

/**
 * @name DefaultWorkflowProvider
 * @description
 * The DefaultWorkflowProvider will instruct the cbaWizard to use the order of the DOM to state order of wizard steps.
 * This can be replaced with a custom implementation to add business decisions as to the workflow of the wizard.
 */
angular.module('cba.wizard')
    .factory('DefaultWorkflowProvider', ['$timeout', function ($timeout) {

        /**
         * @description
         * Return current progress based on total number of valid steps.
         * @returns {Number} progress percentage out of 100
         */
        function getProgressBasedOnValidSteps(steps) {
            var totalProgress = 0,
                completedProgress = 0;

            // count completed steps
            angular.forEach(steps, function (step) {
                var weight = step.controller.getProgressWeighting();
                totalProgress += weight;
                if (step.controller.isValid()) {
                    completedProgress += weight;
                }
            });

            return Math.floor((completedProgress / totalProgress) * 100);
        }

        /**
         * @description
         * Return current progress based on current step.
         * @returns {Number} progress percentage out of 100
         */
        function getProgressBasedOnView(steps, currentStepId) {
            var totalSteps = 0;
            var currentStep = 0;

            angular.forEach(steps, function (step, stepId) {
                if (currentStepId === stepId) {
                    currentStep = totalSteps;
                }
                totalSteps += step.controller.getProgressWeighting();
            });

            return Math.floor((currentStep / totalSteps) * 100);
        }

        function DefaultWorkflowProvider(options) {
            var self = this,
                defaultOptions = {
                    goToErrorOnSubmit: true,
                    stepSelector: '[data-cba-wizard-step], [cba-wizard-step]',
                    skipValidStepsAfterSubmit: true,
                    progressShowsValidSteps: true
                };

            this.options = angular.extend(defaultOptions, options);
            this.hasBeenSubmitted = false;

            // ======= private ======== //

            function updateStepClasses() {

                var visibleCount = 1;
                angular.forEach(self.DOMCache, function (element) {

                    var $element = angular.element(element);
                    if (!$element.is(':visible')) {
                        return;
                    }

                    var even = visibleCount++ % 2 === 0;
                    $element
                        .toggleClass('odd', !even)
                        .toggleClass('even', even);
                });
            }

            function onStepChange(args) {
                self.DOMCache = self.element.find(self.options.stepSelector);
                self.wizardSteps = args.steps;
                updateStepClasses();
            }

            // ======= privileged ======//
            this.onStepAdded = function (args) {
                onStepChange(args);
            };

            this.onStepRemoved = function (args) {
                onStepChange(args);
            };
        }

        DefaultWorkflowProvider.prototype.init = function (wizardCtrl, element) {
            this.element = element;
            this.wizardCtrl = wizardCtrl;
            this.wizardSteps = [];
            this.DOMCache = [];
        };

        DefaultWorkflowProvider.prototype.getProgress = function (currentStepId) {
            return this.options.progressShowsValidSteps ?
                getProgressBasedOnValidSteps(this.wizardSteps) :
                getProgressBasedOnView(this.wizardSteps, currentStepId);
        };

        DefaultWorkflowProvider.prototype.getFirstStep = function () {

            var dom = !this.options.firstElement ?
                this.element.find(this.options.stepSelector) :
                this.element.find(this.options.firstElement).parents(this.options.stepSelector);

            if (dom.length === 0) {
                return null;
            }
            return dom.first().attr('id');
        };

        DefaultWorkflowProvider.prototype.getNextStep = function (currentStepId) {
            var stepId = null,
                item, i,
                currentIndex = null;

            var dom = this.element.find(this.options.stepSelector);

            for (i = 0; i < dom.length; i++) {
                item = dom[i];

                if (item.id === currentStepId) {
                    currentIndex = i;
                } else if (currentIndex !== null) {
                    stepId = item.id;

                    // in case the next step is valid and we want to submit the form straight away
                    if (this.wizardSteps[stepId].controller.isValid() && this.options.submitIfNextStepIsValid) {
                        this.wizardCtrl.submit();
                        return null;
                    }

                    // we want to skip valid steps if the submit button has been pressed
                    if (!this.wizardSteps[stepId].controller.isValid() || !(this.options.skipValidStepsAfterSubmit && this.hasBeenSubmitted)) {
                        return stepId;
                    }
                }
            }

            return stepId;
        };

        DefaultWorkflowProvider.prototype.getPreviousStep = function (currentStepId) {
            var item,
                i = 0,
                previousIndex = 0;

            var dom = this.element.find(this.options.stepSelector);

            for (; i < dom.length; i++) {
                item = dom[i];
                previousIndex = i - 1;

                if (item.id === currentStepId) {
                    return previousIndex >= 0 ? dom[previousIndex].id : null;
                }
            }

            return null;
        };

        DefaultWorkflowProvider.prototype.onStart = function() {
            if (!this.options.firstElement) {
                return;
            }

            var self = this;
            $timeout(function() {
                self.element.find(self.options.firstElement).focus();
            });
        };

        DefaultWorkflowProvider.prototype.onSubmit = function (args) {

            var invalidStepId = null,
                self = this;

            self.hasBeenSubmitted = true;
            if (!args.isValid && this.options.goToErrorOnSubmit) {

                // get first invalid step
                this.DOMCache.each(function () {
                    if (!self.wizardSteps[this.id].controller.isValid()) {
                        invalidStepId = this.id;
                        return false;
                    }
                });

                if (invalidStepId === null) {
                    invalidStepId = this.DOMCache[this.DOMCache.length - 1].id;
                }

                // set invalid step active
                return self.wizardCtrl.setActiveStep(invalidStepId, {
                    event: 'invalid',
                    requiresFocus: true
                });
            }
        };

        return DefaultWorkflowProvider;
    }]);

'use strict';

/**
 * lazyContentHelper service
 * @description This service will ensure that all ngIncludes below the scope have loaded before the promise is resolved.
 * Useful for waiting for all child scope content to load.
 */
angular.module('cba.wizard')
    .factory('lazyContentHelper', ['$q', '$timeout', function ($q, $timeout) {

        /**
         * Awaits for all content (ngIncludes) below the scope to have loaded before running the callback
         * @param scope the top level scope
         * @returns {Promise}
         */
        function awaitContentLoaded(scope) {

            var awaitingIncludes = 0,
                isStarted = false,
                defer = $q.defer(),
                startPromise;

            // NOTE: afaik there is no nice way in angular to ensure all the inner content has loaded (ngInclude),
            function checkCanStart() {

                if (isStarted) {
                    return;
                }

                $timeout.cancel(startPromise);
                startPromise = $timeout(function () {
                    // it's the next digest, more includes could be called
                    if (awaitingIncludes <= 0) {
                        isStarted = true;
                        defer.resolve();
                    }
                });
            }

            function decrementWait() {
                if (--awaitingIncludes <= 0) {
                    checkCanStart();
                }
            }

            function setWait() {
                awaitingIncludes++;
            }

            scope.$on('$includeContentRequested', setWait);
            scope.$on('$includeContentLoaded', decrementWait);
            scope.$on('$includeContentError', decrementWait);
            $timeout(checkCanStart);

            return defer.promise;
        }

        return {
            awaitContentLoaded: awaitContentLoaded
        };
    }]);
'use strict';

/**
 * @name TypeformTransitionProvider
 * @description The transition provider handles step changes in the cbaWizard, and has the opportunity to
 * invoke step changes from external influences such as the scroll bar.
 */
angular.module('cba.wizard')
    .factory('TypeformTransitionProvider', ['$window', '$timeout', '$q', function (window, $timeout, $q) {

        var SCROLL_EVENT = { event: 'scroll', requiresFocus: true },
            $window = angular.element(window);

        // Certain browsers do not respect box-sizing: border-box when min-height is used
        // so apply a class that detects this
        var isPaddingAddedToBorderBox = (function () {
            var testElement = $('<div>Test</div>'),
                elemHeight;
            testElement.css({
                minHeight: 100,
                paddingTop: 10,
                paddingBottom: 10,
                position: 'absolute',
                top: -2000
            });
            $('body').append(testElement);
            elemHeight = testElement[0].scrollHeight;
            testElement.remove();
            return elemHeight === 120;
        })();

        var typeform = function TypeformTransitionProvider(options) {

            var defaultOptions = {
                    resizeSteps: true,
                    focusFirstError: true,
                    scrollSpeed: 400,
                    bottomGutter: 0,
                    topGutter: 30,
                    bp2Min: 600,
                    minPadding: 40,
                    scrollThrottleMs: 200,
                    stepSelector: '[data-cba-wizard-step], [cba-wizard-step]',
                    viewport: null, /* defaulted in init */
                    scrollContainer: null, /* will be added during init */
                    bp2ViewportFraction: 0.6, // target fraction of the viewport for bp2 and above
                    idleClass: 'typeform-transition-idle',
                    animatingClass: 'typeform-transition-animating'
                },
                self = this;

            // ================ private methods ================ //

            function initialize() {
                self.DOMCache = [];
                self.timer = null;
                self.isAnimating = false;

                // copy options and override defaults
                self.options = angular.copy(defaultOptions);
                angular.extend(self.options, options);

                // scrollContainer and viewport can be passed in as jQuery fn's. Otherwise defaulted here.
                self.isDocumentLevelContainer = self.options.scrollContainer === null;
                self.options.scrollContainer = self.options.scrollContainer || $('html, body');
                self.options.viewport = self.options.viewport || $window;

                // set the scroll handler element (window for html,body else it's the scroll container element)
                self.scrollHandlerElement = self.isDocumentLevelContainer ? $window : self.options.scrollContainer;

                // add functions expected by wizard plugin model
                self.onStepAdded = addWizardStep;
                self.onStepRemoved = updateDOMWizardSteps;
                self.onStart = updateDOMWizardSteps;
                self.destroy = destroy;
                self.forceResize = resizeSteps;

                self.options.scrollContainer.removeClass(self.options.animatingClass);
                self.options.scrollContainer.addClass(self.options.idleClass);
            }

            function addEventListeners() {
                self.scrollHandlerElement.bind('scroll wheel', onScroll);
                if (self.options.resizeSteps) {
                    // If resize event happens after a focus assume resize was caused by onscreen keyboard and don't actually resize document.
                    var focussingTimeout;
                    $('body').on('focus touchstart', ':input', function () {
                        if (focussingTimeout) {
                            clearTimeout(focussingTimeout);
                        }
                        focussingTimeout = setTimeout(function () {
                            focussingTimeout = null;
                        }, 1000);
                    });
                    // Window resize handler.
                    $window.bind('resize orientationchange', function () {
                        if (!focussingTimeout) {
                            resizeStepsIfNotBp1();
                        }
                    });
                }
            }

            function addWizardStep(args) {
                updateDOMWizardSteps();
                resizeStep(args.steps[args.step].element);
            }

            function updateDOMWizardSteps() {
                self.DOMCache = self.element.find(self.options.stepSelector);
            }

            function onScroll(e) {

                if (e.type === 'wheel') {
                    self.options.scrollContainer.finish();
                }

                if (self.timer) {
                    $timeout.cancel(self.timer);
                    self.timer = null;
                }

                /*jshint validthis:true */
                var $self = $(this);
                self.timer = $timeout(function () {
                    updateStepFromScrollPosition($self.scrollTop());
                    $timeout.cancel(self.timer);
                    self.timer = null;
                }, self.options.scrollThrottleMs);
            }

            function resizeStepsIfNotBp1() {
                if (!isBp1()) {
                    resizeSteps();
                }
            }

            function isBp1() {
                return self.options.viewport.width() < self.options.bp2Min;
            }

            function resizeStep(element) {
				// This $timeout ensures that the resizing occurs only after ng-binds are done.
                $timeout(function() {
					// bp1 covers the whole screen; bp2 and above only a certain fraction
					var viewportFraction = (isBp1() ? 1.0 : self.options.bp2ViewportFraction);

					var section = angular.element(element);
					if (section.hasClass('no-resize') || !section.is(':visible')) {
						return;
					}

					var contentHeight = section.height(), // the height of the actual content within the section, not including any padding we may have added
						targetHeight = self.options.viewport.height() * viewportFraction,
						padding = (targetHeight - contentHeight) / 2, // calculate average padding required to achieve our target height
						paddingTop = padding,
						paddingBottom = padding,
						minHeight = isPaddingAddedToBorderBox ? targetHeight - 2 * padding : targetHeight;

					// apply minimum
					paddingTop = Math.max(self.options.minPadding, paddingTop);
					paddingBottom = Math.max(self.options.minPadding, paddingBottom);

					section.css({
						paddingTop: paddingTop + 'px',
						paddingBottom: paddingBottom + 'px',
						minHeight: minHeight
					});
				});
			}

            function resizeSteps() {
                angular.forEach(self.DOMCache, resizeStep);
            }

            function updateStepFromScrollPosition(scrollTop) {

                var maxScroll = self.options.scrollContainer[0].scrollHeight || $(document).height() - $(window).height(),
                    centrePosition = (self.options.viewport.height() * 0.5) + scrollTop,
                    controller = self.wizardController;

                function isFirstStep() {
                    return maxScroll - scrollTop <= self.options.bottomGutter;
                }

                function isLastStep() {
                    return scrollTop - self.options.topGutter <= 0;
                }

                function stepIsCenterOfView(element) {
                    var top = self.isDocumentLevelContainer ? element.position().top : element.position().top + scrollTop;
                    return top < centrePosition && (top + element.outerHeight()) > centrePosition;
                }

                if (self.isAnimating) {
                    return;
                }

                // we allow gutters for the top and bottom panels. This is to ensure that the panels don't need to be
                // 60% of the viewport size. This allows for footers and smaller heading panels as common in cba typeform.

                if (isFirstStep()) {
                    controller.setActiveStep(self.DOMCache[self.DOMCache.length - 1], SCROLL_EVENT);
                } else if (isLastStep()) {
                    controller.setActiveStep(self.DOMCache[0].id, SCROLL_EVENT);
                } else {
                    $.each(self.DOMCache, function () {
                        if (stepIsCenterOfView($(this))) {
                            controller.setActiveStep(this.id, SCROLL_EVENT);
                            return false; // break
                        }
                    });
                }
            }

            function destroy() {
                self.scrollHandlerElement.off('scroll', onScroll);
            }

            // ================= init ==================== //
            initialize();
            addEventListeners();
        };
        typeform.fn = typeform.prototype;

        typeform.fn.init = function (wizardCtrl, element) {
            this.wizardController = wizardCtrl;
            this.element = element;
        };

        typeform.fn.performTransition = function (currentId, nextId, steps, event) {

            var self = this,
                deferred = $q.defer(),
                next = steps[nextId];

            function setIsAnimating(isAnimating) {
                self.isAnimating = isAnimating;

                if (isAnimating) {
                    self.options.scrollContainer.removeClass(self.options.idleClass);
                    self.options.scrollContainer.addClass(self.options.animatingClass);
                } else {
                    self.options.scrollContainer.removeClass(self.options.animatingClass);
                    self.options.scrollContainer.addClass(self.options.idleClass);
                }
            }

            function onComplete() {
                if (event.requiresFocus && !('ontouchstart' in document.documentElement)) {
                    // focus the first error or first element if no errors.
                    if (!next.controller.isValid() && self.options.focusFirstError) {
                        next.controller.focusFirstError();
                    } else if (next.element.attr('focus') !== 'false') {
                        next.element.find(':input:visible:enabled:first').focus();
                    }
                }

                setIsAnimating(false);
                deferred.resolve();
            }

            function calculateOffset(viewportHeight, stepHeight) {
                if (stepHeight > viewportHeight) {
                    return 0;
                }

                return (viewportHeight - stepHeight) / 2;
            }

            if (this.isAnimating) {
                return $q.when(true);
            }

            setIsAnimating(true);
            var offset = calculateOffset(self.options.viewport.height(), next.element.outerHeight());
            var scrollTop = next.element.position().top + self.options.scrollContainer.scrollTop() - offset;
            if (self.isDocumentLevelContainer) {
                scrollTop = next.element.offset().top - offset;
            }

            if (event.align === 'bottom') {
                this.options.scrollContainer.animate({ scrollTop: scrollTop + self.options.viewport.height() }, this.options.scrollSpeed, onComplete);
            } else {
                this.options.scrollContainer.animate({ scrollTop: scrollTop }, this.options.scrollSpeed, onComplete);
            }
            return deferred.promise;
        };

        return typeform;
    }]
);
