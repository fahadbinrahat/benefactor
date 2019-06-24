'use strict';

angular.module('sample.typeform', ['cba.wizard'])
    .controller('CustomerViewModel', function (DefaultWorkflowProvider, TypeformTransitionProvider) {

        // NOTE: These do not need to be specified as they are the default providers.
        this.options = {
            transitionProvider: new TypeformTransitionProvider(),
            workflowProvider: new DefaultWorkflowProvider({
                goToErrorOnSubmit: true,
                skipValidStepsAfterSubmit: false
            })
        };

        this.submit = function (isValid) {

            if (!isValid) {
                console.log('the form is invalid, redirecting you to the errors');
                return;
            }

            alert('submit successful');
        };
    });
