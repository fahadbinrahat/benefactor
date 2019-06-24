<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>

<head>
<title>beneFactor | Assessment</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
<link rel="stylesheet" href="dist/css/skins/skin-blue.min.css">
<link href="bower_components/commbank-bootstrap/dist/css/commbank-typeform.css" rel="stylesheet">
        
<link href="typeform.css" rel="stylesheet">
</head>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <!--[endif]-->

<!--
  BODY TAG OPTIONS:
  =================
  Apply one or more of the following classes to get the
  desired effect
  |---------------------------------------------------------|
  | SKINS         | skin-blue                               |
  |               | skin-black                              |
  |               | skin-purple                             |
  |               | skin-yellow                             |
  |               | skin-red                                |
  |               | skin-green                              |
  |---------------------------------------------------------|
  |LAYOUT OPTIONS | fixed                                   |
  |               | layout-boxed                            |
  |               | layout-top-nav                          |
  |               | sidebar-collapse                        |
  |               | sidebar-mini                            |
  |---------------------------------------------------------|
  -->
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<!-- Main Header -->
		<header class="main-header">

			<!-- Logo -->
			<a href="dashboard.jsp" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>Admin</b>LTE</span>
			</a>

			<!-- Header Navbar -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- Messages: style can be found in dropdown.less-->
						<li class="dropdown messages-menu">
							<!-- Menu toggle button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-envelope-o"></i> <span
								class="label label-success">4</span>
						</a>
							<ul class="dropdown-menu">
								<li class="header">You have 4 messages</li>
								<li>
									<!-- inner menu: contains the messages -->
									<ul class="menu">
										<li>
											<!-- start message --> <a href="#">
												<div class="pull-left">
													<!-- User Image -->
													<img src="dist/img/user2-160x160.jpg" class="img-circle"
														alt="User Image">
												</div> <!-- Message title and timestamp -->
												<h4>
													Support Team <small><i class="fa fa-clock-o"></i> 5
														mins</small>
												</h4> <!-- The message -->
												<p>Why not buy a new awesome theme?</p>
										</a>
										</li>
										<!-- end message -->
									</ul> <!-- /.menu -->
								</li>
								<li class="footer"><a href="#">See All Messages</a></li>
							</ul>
						</li>
						<!-- /.messages-menu -->

						<!-- Notifications Menu -->
						<li class="dropdown notifications-menu">
							<!-- Menu toggle button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-bell-o"></i> <span
								class="label label-warning">10</span>
						</a>
							<ul class="dropdown-menu">
								<li class="header">You have 10 notifications</li>
								<li>
									<!-- Inner Menu: contains the notifications -->
									<ul class="menu">
										<li>
											<!-- start notification --> <a href="#"> <i
												class="fa fa-users text-aqua"></i> 5 new members joined
												today
										</a>
										</li>
										<!-- end notification -->
									</ul>
								</li>
								<li class="footer"><a href="#">View all</a></li>
							</ul>
						</li>
						<!-- Tasks Menu -->
						<li class="dropdown tasks-menu">
							<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-flag-o"></i> <span
								class="label label-danger">9</span>
						</a>
							<ul class="dropdown-menu">
								<li class="header">You have 9 tasks</li>
								<li>
									<!-- Inner menu: contains the tasks -->
									<ul class="menu">
										<li>
											<!-- Task item --> <a href="#"> <!-- Task title and progress text -->
												<h3>
													Design some buttons <small class="pull-right">20%</small>
												</h3> <!-- The progress bar -->
												<div class="progress xs">
													<!-- Change the css width attribute to simulate progress -->
													<div class="progress-bar progress-bar-aqua"
														style="width: 20%" role="progressbar" aria-valuenow="20"
														aria-valuemin="0" aria-valuemax="100">
														<span class="sr-only">20% Complete</span>
													</div>
												</div>
										</a>
										</li>
										<!-- end task item -->
									</ul>
								</li>
								<li class="footer"><a href="#">View all tasks</a></li>
							</ul>
						</li>
						<!-- User Account Menu -->
						<li class="dropdown user user-menu">
							<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <!-- The user image in the navbar-->
								<img src="dist/img/user2-160x160.jpg" class="user-image"
								alt="User Image"> <!-- hidden-xs hides the username on small devices so only the image appears. -->
								<span class="hidden-xs">Alexander Pierce</span>
						</a>
							<ul class="dropdown-menu">
								<!-- The user image in the menu -->
								<li class="user-header"><img
									src="dist/img/user2-160x160.jpg" class="img-circle"
									alt="User Image">
									<p>
										Alexander Pierce - Web Developer <small>Member since
											Nov. 2012</small>
									</p></li>
								<!-- Menu Body -->
								<li class="user-body">
									<div class="col-xs-4 text-center">
										<a href="#">Followers</a>
									</div>
									<div class="col-xs-4 text-center">
										<a href="#">Sales</a>
									</div>
									<div class="col-xs-4 text-center">
										<a href="#">Friends</a>
									</div>
								</li>
								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="pull-left">
										<a href="#" class="btn btn-default btn-flat">Profile</a>
									</div>
									<div class="pull-right">
										<s:form action="doLogout.action" method="post">

											<s:submit method="execute" key="label.logout"
												class="btn btn-default btn-flat" />
										</s:form>
									</div>
								</li>
							</ul>
						</li>
						<!-- Control Sidebar Toggle Button -->
						<li><a href="#" data-toggle="control-sidebar"><i
								class="fa fa-gears"></i></a></li>
					</ul>
				</div>
			</nav>
		</header>
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">

			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">

				<!-- Sidebar user panel (optional) -->
				<div class="user-panel">
					<div class="pull-left image">
						<img src="dist/img/user2-160x160.jpg" class="img-circle"
							alt="User Image">
					</div>
					<div class="pull-left info">
						<p>Alexander Pierce</p>
						<!-- Status -->
						<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
					</div>
				</div>

				<!-- search form (Optional) -->
				<form action="#" method="get" class="sidebar-form">
					<div class="input-group">
						<input type="text" name="q" placeholder="Search..."> <span
							class="input-group-btn">
							<button type="submit" name="search" id="search-btn"
								class="btn btn-flat">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</form>
				<!-- /.search form -->

				<!-- Sidebar Menu -->
				<ul class="sidebar-menu">
					<li class="header">HEADER</li>
					<!-- Optionally, you can add icons to the links -->
					<li class="active"><a href="#"><i class="fa fa-link"></i>
							<span>Link</span></a></li>
					<li><a href="#"><i class="fa fa-link"></i> <span>Another
								Link</span></a></li>
					<li class="treeview"><a href="#"><i class="fa fa-link"></i>
							<span>Multilevel</span> <i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="#">Link in level 2</a></li>
							<li><a href="#">Link in level 2</a></li>
						</ul></li>
				</ul>
				<!-- /.sidebar-menu -->
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Hardship Strategy Dashboard <small>Please use feautes below</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
					<li class="active">Here</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<!-- Your Page Content Here -->
				<form name="customerProfileForm" class="typeform" role="form"
						novalidate data-ng-controller="CustomerViewModel as vm"
						data-cba-wizard="vm.options"
						data-cba-wizard-on-submit="vm.submit(isValid)">



						<div id="aboutYou" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about yourself..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Title</label> <select id="title"
											name="title" class="form-control span-6"
											data-ng-model="vm.model.title" required>
											<option value="">Select</option>
											<option value="Mr">Mr</option>
											<option value="Mrs">Mrs</option>
										</select>
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="firstName">First name</label> <input
											id="firstName" name="firstName" class="form-control span-6"
											required data-ng-model="vm.model.firstName" type="text" />
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="middleName">Middle name</label> <input
											id="middleName" name="middleName" class="form-control span-6"
											data-ng-model="vm.model.middleName" type="text" />
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="lastName">Last name</label> <input id="lastName"
											name="lastName" class="form-control span-6" required
											data-ng-model="vm.model.lastName" type="text" />
									</div>
								</div>
								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Gender</label> <select id="title"
											name="gender" class="form-control span-6"
											data-ng-model="vm.model.gender" required>
											<option value="">Select</option>
											<option value="Male">Male</option>
											<option value="Female">Female</option>
										</select>
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Marital Status</label> <select id="title"
											name="maritalStatus" class="form-control span-6"
											data-ng-model="vm.CustomerViewModel.maritalStatus"
											ng-change="vm.displayHidePartnerIncome()" required>
											<option value="">Select</option>
											<option value="Single">Single</option>
											<option value="Married">Married</option>
											<option value="Divorced">Divorced</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>


								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnAboutYouProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourContact" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about contact details..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="address">Address</label> <input id="address"
											name="address" class="form-control span-6" required
											data-ng-model="vm.model.address" type="text" />
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="telephone">Telephone</label> <input id="telephone"
											name="telephone" class="form-control span-6"
											data-ng-model="vm.model.telephone" type="text" />
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="mobile">Mobile</label> <input id="mobile"
											name="mobile" class="form-control span-6" required
											data-ng-model="vm.model.mobile" type="text" />
									</div>
								</div>
								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourContactProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourIDDocument" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about identification details..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="driverLicense">Driver License number</label> <input
											id="driverLicense" name="driverLicense"
											class="form-control span-6" required
											data-ng-model="vm.model.driverLicense" type="text" />
									</div>

								</div>
								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourIDDocumentProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourDependants" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about dependants details..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have any dependants?</label> <select
											id="haveDependants" name="haveDependants"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.haveDependants"
											ng-change="vm.displayHideDependant()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayNumOfDependants">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayNumOfDependants">
										<label for="numOfDependants">Number of Dependants</label> <input
											id="numOfDependants" name="numOfDependants"
											class="form-control span-6" required
											data-ng-model="vm.model.numOfDependants" type="text" />
									</div>

								</div>
								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourDependantsProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourEmployment" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about employment details..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Are you currently employed?</label> <select
											id="isEmployed" name="isEmployed" class="form-control span-6"
											ng-model="vm.CustomerViewModel.isEmployed"
											ng-change="vm.displayHideEmployment()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayEmployment">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayEmployment">
										<label for="employerName">Employer name</label> <input
											id="employerName" name="employerName"
											class="form-control span-6"
											data-ng-model="vm.model.employerName" type="text" />
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayEmployment">
										<label for="employerType">Employer type</label> <input
											id="employerType" name="employerType"
											class="form-control span-6"
											data-ng-model="vm.model.employerType" type="text" />
									</div>

								</div>
								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourEmploymentProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about salary income ..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">



									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayEmployment">
										<label for="salaryIncome">Salary income</label> <input
											id="salaryIncome" name="salaryIncome"
											class="form-control span-6"
											data-ng-model="vm.model.salaryIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayEmployment">
										<label for="title">Frequency</label> <select
											id="salaryIncomeFrequency" name="salaryIncomeFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.salaryIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayPartnerIncome">
										<label for="partnerIncome">Partner's income</label> <input
											id="partnerIncome" name="salaryIncome"
											class="form-control span-6"
											data-ng-model="vm.model.partnerIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayPartnerIncome">
										<label for="title">Frequency</label> <select
											id="partnerIncomeFrequency" name="partnerIncomeFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.partnerIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourEmploymentProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourSavingsIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about savings income..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you earn income from your
											savings?</label> <select id="hasSavingsIncome"
											name="hasSavingsIncome" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasSavingsIncome"
											ng-change="vm.displayHideSavingsIncome()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displaySavingsIncome">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displaySavingsIncome">
										<label for="svingsIncome">Savings income</label> <input
											id="savingsIncome" name="savingsIncome"
											class="form-control span-6"
											data-ng-model="vm.model.savingsIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displaySavingsIncome">
										<label for="title">Frequency</label> <select
											id="savingsIncomeFrequency" name="savingsIncomeFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.savingsIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourSavingsIncomeProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourDividentsIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about dividents income..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you earn income from your
											dividents?</label> <select id="hasDividentsIncome"
											name="hasDividentsIncome" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasDividentsIncome"
											ng-change="vm.displayHideDividentsIncome()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayDividentsIncome">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayDividentsIncome">
										<label for="dividentsIncome">Dividents income</label> <input
											id="dividentsIncome" name="dividentsIncome"
											class="form-control span-6"
											data-ng-model="vm.model.dividentsIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayDividentsIncome">
										<label for="title">Frequency</label> <select
											id="dividentsIncomeFrequency" name="dividentsIncomeFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.dividentsIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourDividentsIncomeProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourCommissionsIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about commissions income..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you earn income from any
											commissions?</label> <select id="hasCommissionsIncome"
											name="hasCommissionsIncome" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCommissionsIncome"
											ng-change="vm.displayHideCommissionsIncome()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCommissionsIncome">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCommissionsIncome">
										<label for="commissionsIncome">Commissions income</label> <input
											id="commissionsIncome" name="commissionsIncome"
											class="form-control span-6"
											data-ng-model="vm.model.commissionsIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCommissionsIncome">
										<label for="title">Frequency</label> <select
											id="commissionsIncomeFrequency"
											name="commissionsIncomeFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.commissionsIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourComissionsIncomeProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourRoyaltiesIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about royalties income..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you earn income from any
											royalties?</label> <select id="hasRoyaltiesIncome"
											name="hasRoyaltiesIncome" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasRoyaltiesIncome"
											ng-change="vm.displayHideRoyaltiesIncome()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayRoyaltiesIncome">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayRoyaltiesIncome">
										<label for="royaltiesIncome">Royalties income</label> <input
											id="royaltiesIncome" name="royaltiesIncome"
											class="form-control span-6"
											data-ng-model="vm.model.royaltiesIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayRoyaltiesIncome">
										<label for="title">Frequency</label> <select
											id="royaltiesIncomeFrequency" name="royaltiesIncomeFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.royaltiesIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourRoyaltiesIncomeProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourCenterlinkIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about centerlink income..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have any income from
											centerlink?</label> <select id="hasCenterlinkIncome"
											name="hasCenterlinkIncome" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCenterlinkIncome"
											ng-change="vm.displayHideCenterlinkIncome()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCenterlinkIncome">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCenterlinkIncome">
										<label for="centerlinkIncome">Centerlink income</label> <input
											id="centerlinkIncome" name="centerlinkIncome"
											class="form-control span-6"
											data-ng-model="vm.model.centerlinkIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCenterlinkIncome">
										<label for="title">Frequency</label> <select
											id="centerlinkIncomeFrequency"
											name="centerlinkIncomeFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.centerlinkIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourCenterlinkIncomeProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourRentalIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about rental income..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have any income from
											centerlink?</label> <select id="hasRentalIncome"
											name="hasRentalIncome" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasRentalIncome"
											ng-change="vm.displayHideRentalIncome()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayRentalIncome">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayRentalIncome">
										<label for="rentalIncome">Rental income</label> <input
											id="rentalIncome" name="rentalIncome"
											class="form-control span-6"
											data-ng-model="vm.model.rentalIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayRentalIncome">
										<label for="title">Frequency</label> <select
											id="rentalIncomeFrequency" name="rentalIncomeFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.rentalIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourRentalIncomeProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourOtherIncome" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about any other income..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have any other income?</label> <select
											id="hasOtherIncome" name="hasOtherIncome"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasOtherIncome"
											ng-change="vm.displayHideOtherIncome()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayOtherIncome">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayOtherIncome">
										<label for="otherIncome">Other income</label> <input
											id="otherIncome" name="otherIncome"
											class="form-control span-6"
											data-ng-model="vm.model.otherIncome" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayOtherIncome">
										<label for="title">Frequency</label> <select
											id="otherIncomeFrequency" name="otherIncomeFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.otherIncomeFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourOtherIncomeProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourMortgageExpense" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your mortgage expense..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have mortgage?</label> <select
											id="hasMortgageExpense" name="hasMortgageExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasMortgageExpense"
											ng-change="vm.displayHideMortgageExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayMortgageExpense">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayMortgageExpense">
										<label for="mortgageExpense">Mortgage expense</label> <input
											id="mortgageExpense" name="mortgageExpense"
											class="form-control span-6"
											data-ng-model="vm.model.mortgageExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayMortgageExpense">
										<label for="title">Frequency</label> <select
											id="mortgageExpenseFrequency" name="mortgageExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.mortgageExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourMortgageExpenseProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourCarLoanExpense" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your car loan expense..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a car loan?</label> <select
											id="hasCarLoanExpense" name="hasCarLoanExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCarLoanExpense"
											ng-change="vm.displayHideCarLoanExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCarLoanExpense">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCarLoanExpense">
										<label for="carLoanExpense">Car loan expense</label> <input
											id="carLoanExpense" name="carLoanExpense"
											class="form-control span-6"
											data-ng-model="vm.model.carLoanExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCarLoanExpense">
										<label for="title">Frequency</label> <select
											id="carLoanExpenseFrequency" name="carLoanExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.carLoanExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourCarLoanExpenseProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourCreditCardExpense" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your credit card expense..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">



									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a credit card?</label> <select
											id="hasCreditCardExpense" name="hasCreditCardExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCreditCardExpense"
											ng-change="vm.displayHideCreditCardExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>

								<div class="row" ng-show="vm.displayCreditCardExpense">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCreditCardExpense">
										<label for="creditCardExpense">Cred card expense</label> <input
											id="creditCardExpense" name="creditCardExpense"
											class="form-control span-6"
											data-ng-model="vm.model.creditCardExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCreditCardExpense">
										<label for="title">Frequency</label> <select
											id="creditCardExpenseFrequency"
											name="creditCardExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.creditCardExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourCreditCardExpenseProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourFeeHelpLoanExpense" class="blade"
							data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your Fee Help loan expense..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a Fee Help loan ?</label> <select
											id="hasFeeHelpLoanExpense" name="hasFeeHelpLoanExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasFeeHelpLoanExpense"
											ng-change="vm.displayHideFeeHelpLoanExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayFeeHelpLoanExpense">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayFeeHelpLoanExpense">
										<label for="feeHelpLoanExpense">Fee Help loan expense</label>
										<input id="feeHelpLoanExpense" name="feeHelpLoanExpense"
											class="form-control span-6"
											data-ng-model="vm.model.feeHelpLoanExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayFeeHelpLoanExpense">
										<label for="title">Frequency</label> <select
											id="feeHelpLoanExpenseFrequency"
											name="feeHelpLoanExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.feeHelpLoanExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourFeeHelpLoanExpenseProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourOtherDebtExpense" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your other debt expense..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have any other debt ?</label> <select
											id="hasOtherDebtExpense" name="hasOtherDebtExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasOtherDebtExpense"
											ng-change="vm.displayHideOtherDebtExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayOtherDebtExpense">


									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayOtherDebtExpense">
										<label for="otherDebtExpense">Other debt expense</label> <input
											id="otherDebtExpense" name="otherDebtExpense"
											class="form-control span-6"
											data-ng-model="vm.model.otherDebtExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayOtherDebtExpense">
										<label for="title">Frequency</label> <select
											id="otherDebtExpenseFrequency"
											name="otherDebtExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.otherDebtExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourOtherDebtExpenseProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourRentExpense" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your rent expense..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have any rent expense ?</label> <select
											id="hasRentExpense" name="hasRentExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasRentExpense"
											ng-change="vm.displayHideRentExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayRentExpense">



									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayRentExpense">
										<label for="rentExpense">Rent expense</label> <input
											id="rentExpense" name="rentExpense"
											class="form-control span-6"
											data-ng-model="vm.model.rentExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayRentExpense">
										<label for="title">Frequency</label> <select
											id="rentExpenseFrequency" name="rentExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.rentExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>

								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourRentExpenseProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourStandardExpenses" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your basic expenses..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="basicLivingExpense">Basic living expense</label> <input
											id="basicLivingExpense" name="basicLivingExpensepense"
											class="form-control span-6"
											data-ng-model="vm.model.basicLivingExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="basicLivingExpenseFrequency"
											name="basicLivingExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.basicLivingExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="telephoneBillExpense">Telephone bill
											expense</label> <input id="telephoneBillExpense"
											name="telephoneBillExpense" class="form-control span-6"
											data-ng-model="vm.model.telephoneBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="telephoneBillExpenseFrequency"
											name="telephoneBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.telephoneBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

								</div>
								<div class="row">

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="mobileBillExpense">Mobile phone expense</label> <input
											id="mobileBillExpense" name="mobileBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.mobileBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="mobileBillExpenseFrequency"
											name="mobileBillExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.mobileBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="internetBillExpense">Internet expense</label> <input
											id="internetBillExpense" name="internetBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.internetBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="internetBillExpenseFrequency"
											name="internetBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.internetBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

								</div>

								<div class="row">

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="payTVBillExpense">Pay TV expense</label> <input
											id="payTVBillExpense" name="payTVBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.payTVBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="payTVBillExpenseFrequency"
											name="payTVBillExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.payTVBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="electricityBillExpense">Electricity
											expense</label> <input id="electricityBillExpense"
											name="electricityBillExpense" class="form-control span-6"
											data-ng-model="vm.model.electricityBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="electricityBillExpenseFrequency"
											name="electricityBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.electricityBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

								</div>

								<div class="row">

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="gasBillExpense">Gas expense</label> <input
											id="gasBillExpense" name="gasBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.gasBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="gasBillExpenseFrequency" name="gasBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.gasBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="waterBillExpense">Water expense</label> <input
											id="electricityBillExpense" name="waterBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.waterBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="waterBillExpenseFrequency"
											name="waterBillExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.waterBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

								</div>

								<div class="row">

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="strataBillExpense">STRATA expense</label> <input
											id="strataBillExpense" name="strataBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.strataBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="strataBillExpenseFrequency"
											name="strataBillExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.strataBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

									<div class="form-group col-xs-12 col-sm-12 col-md-3">
										<label for="councilRatesExpense">Council rates expense</label>
										<input id="councilRatesExpense" name="councilRatesExpense"
											class="form-control span-6"
											data-ng-model="vm.model.councilRatesExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Frequency</label> <select
											id="councilRatesExpenseFrequency"
											name="councilRatesExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.councilRatesExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

								</div>


								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourBasicExpensesProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourTransportationExpenses" class="blade"
							data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your transportation expenses..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you ever use public transport
											(train, bus, ferry etc.) ?</label> <select
											id="hasPublicTransportExpense"
											name="hasPublicTransportExpense" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasPublicTransportExpense"
											ng-change="vm.displayHidePublicTransportExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayPublicTransportExpense">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayPublicTransportExpense">
										<label for="publicTransportExpense">Fare expense</label> <input
											id="publicTransportExpense" name="publicTransportExpense"
											class="form-control span-6"
											data-ng-model="vm.model.publicTransportExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayPublicTransportExpense">
										<label for="title">Frequency</label> <select
											id="publicTransportExpenseFrequency"
											name="publicTransportExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.publicTransportExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you drive/own a car ?</label> <select
											id="hasCarExpense" name="hasCarExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCarExpense"
											ng-change="vm.displayHideCarExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>

								</div>
								<div class="row" ng-show="vm.displayCarExpense">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCarExpense">
										<label for="carFuelExpense">Car fuel expense</label> <input
											id="carFuelExpense" name="carFuelExpense"
											class="form-control span-6"
											data-ng-model="vm.model.carFuelExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCarExpense">
										<label for="title">Frequency</label> <select
											id="carFuelExpenseFrequency" name="carFuelExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.carFuelExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCarExpense">
										<label for="carServicingExpense">Car service expense</label> <input
											id="carServicingExpense" name="carServicingExpense"
											class="form-control span-6"
											data-ng-model="vm.model.carServicingExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCarExpense">
										<label for="title">Frequency</label> <select
											id="carServicingExpenseFrequency"
											name="carServicingExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.carServicingExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCarExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCarExpense">
										<label for="carRegoExpense">Car rego expense</label> <input
											id="carRegoExpense" name="carRegoExpense"
											class="form-control span-6"
											data-ng-model="vm.model.carRegoExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCarExpense">
										<label for="title">Frequency</label> <select
											id="carRegoExpenseFrequency" name="carRegoExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.carRegoExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCarExpense">
										<label for="carInsuranceExpense">Car insurance expense</label>
										<input id="carInsuranceExpense" name="carInsuranceExpense"
											class="form-control span-6"
											data-ng-model="vm.model.carInsuranceExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCarExpense">
										<label for="title">Frequency</label> <select
											id="carInsuranceExpenseFrequency"
											name="carInsuranceExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.carInsuranceExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>


								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button"
											id="btnyourTransportationExpensesProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>


						<div id="yourOtherExpenses" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your other expenses..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have home insurance ?</label> <select
											id="hasHomeInsuranceExpense" name="hasHomeInsuranceExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasHomeInsuranceExpense"
											ng-change="vm.displayHideHomeInsuranceExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayHomeInsuranceExpense">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayHomeInsuranceExpense">
										<label for="homeInsuranceExpense">Home insurance
											expense</label> <input id="homeInsuranceExpense"
											name="homeInsuranceExpense" class="form-control span-6"
											data-ng-model="vm.model.homeInsuranceExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayHomeInsuranceExpense">
										<label for="title">Frequency</label> <select
											id="homeInsuranceExpenseFrequency"
											name="homeInsuranceExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.homeInsuranceExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>


								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have health insurance ?</label> <select
											id="hasHealthInsuranceExpense"
											name="hasHealthInsuranceExpense" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasHealthInsuranceExpense"
											ng-change="vm.displayHideHealthInsuranceExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>

								</div>
								<div class="row" ng-show="vm.displayHealthInsuranceExpense">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayHealthInsuranceExpense">
										<label for="healthInsuranceExpense">Health insurance
											expense</label> <input id="healthInsuranceExpense"
											name="healthInsuranceExpense" class="form-control span-6"
											data-ng-model="vm.model.healthInsuranceExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayHealthInsuranceExpense">
										<label for="title">Frequency</label> <select
											id="healthInsuranceExpenseFrequency"
											name="healthInsuranceExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.healthInsuranceExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>

								</div>
								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have gym membership ?</label> <select
											id="hasGymMembershipExpense" name="hasGymMembershipExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasGymMembershipExpense"
											ng-change="vm.displayHideGymMembershipExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayGymMembershipExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayGymMembershipExpense">
										<label for="gymMembershipExpense">Gym membership
											expense</label> <input id="gymMembershipExpense"
											name="gymMembershipExpense" class="form-control span-6"
											data-ng-model="vm.model.gymMembershipExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayGymMembershipExpense">
										<label for="title">Frequency</label> <select
											id="gymMembershipExpenseFrequency"
											name="gymMembershipExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.gymMembershipExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have pets ?</label> <select
											id="hasPetsExpense" name="hasPetsExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasPetsExpense"
											ng-change="vm.displayHidePetsExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayPetsExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayPetsExpense">
										<label for="petsExpense">Pets expense</label> <input
											id="petsExpense" name="petsExpense"
											class="form-control span-6"
											data-ng-model="vm.model.petsExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayPetsExpense">
										<label for="title">Frequency</label> <select
											id="petsExpenseFrequency" name="petsExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.petsExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you go to resturants ?</label> <select
											id="hasResturantBillExpense" name="hasResturantBillExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasResturantBillExpense"
											ng-change="vm.displayHideResturantBillExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayResturantBillExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayResturantBillExpense">
										<label for="resturantBillExpense">Resturant bill
											expense</label> <input id="resturantBillExpense"
											name="resturantBillExpense" class="form-control span-6"
											data-ng-model="vm.model.resturantBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayResturantBillExpense">
										<label for="title">Frequency</label> <select
											id="resturantBillExpenseFrequency"
											name="resturantBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.resturantBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you go to cinema ?</label> <select
											id="hasCinemaMovieExpense" name="hasCinemaMovieExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCinemaMovieExpense"
											ng-change="vm.displayHideCinemaMovieExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCinemaMovieExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCinemaMovieExpense">
										<label for="cinemaMovieExpense">Cinema movie expense</label> <input
											id="cinemaMovieExpense" name="cinemaMovieExpense"
											class="form-control span-6"
											data-ng-model="vm.model.cinemaMovieExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCinemaMovieExpense">
										<label for="title">Frequency</label> <select
											id="cinemaMovieExpenseFrequency"
											name="cinemaMovieExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.cinemaMovieExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you smoke ?</label> <select
											id="hasSmokingBillExpense" name="hasSmokingBillExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasSmokingBillExpense"
											ng-change="vm.displayHideSmokingBillExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displaySmokingBillExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displaySmokingBillExpense">
										<label for="smokingBillExpense">Smoking bill expense</label> <input
											id="smokingBillExpense" name="smokingBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.smokingBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displaySmokingBillExpense">
										<label for="title">Frequency</label> <select
											id="cinemaMovieExpenseFrequency"
											name="cinemaMovieExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.cinemaMovieExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you drink alcohol ?</label> <select
											id="hasAlcoholBillExpense" name="hasAlcoholBillExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasAlcoholBillExpense"
											ng-change="vm.displayHideAlcoholBillExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayAlcoholBillExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayAlcoholBillExpense">
										<label for="alcoholBillExpense">Alcohol expense</label> <input
											id="alcoholBillExpense" name="alcoholBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.alcoholBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayAlcoholBillExpense">
										<label for="title">Frequency</label> <select
											id="alcoholBillExpenseFrequency"
											name="alcoholBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.alcoholBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you gamble ?</label> <select
											id="hasGamblingBillExpense" name="hasGamblingBillExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasGamblingBillExpense"
											ng-change="vm.displayHideGamblingBillExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayGamblingBillExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayGamblingBillExpense">
										<label for="gamblingBillExpense">Gambling expense</label> <input
											id="gamblingBillExpense" name="gamblingBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.gamblingBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayGamblingBillExpense">
										<label for="title">Frequency</label> <select
											id="gamblingBillExpenseFrequency"
											name="gamblingBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.gamblingBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you give family gifts ?</label> <select
											id="hasFamilyGiftsBillExpense"
											name="hasFamilyGiftsBillExpense" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasFamilyGiftsBillExpense"
											ng-change="vm.displayHideFamilyGiftsBillExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayFamilyGiftsBillExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayFamilyGiftsBillExpense">
										<label for="familyGiftsBillExpense">Family gifts
											expense</label> <input id="familyGiftsBillExpense"
											name="familyGiftsBillExpense" class="form-control span-6"
											data-ng-model="vm.model.familyGiftsBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayFamilyGiftsBillExpense">
										<label for="title">Frequency</label> <select
											id="familyGiftsBillExpenseFrequency"
											name="familyGiftsBillExpenseFrequency"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.familyGiftsBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you study ?</label> <select
											id="hasStudyBillExpense" name="hasStudyBillExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasStudyBillExpense"
											ng-change="vm.displayHideStudyBillExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayStudyBillExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayStudyBillExpense">
										<label for="studyBillExpense">Study expense</label> <input
											id="studyBillExpense" name="studyBillExpense"
											class="form-control span-6"
											data-ng-model="vm.model.studyBillExpense" type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayStudyBillExpense">
										<label for="title">Frequency</label> <select
											id="studyBillExpenseFrequency"
											name="studyBillExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.studyBillExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have Payday loan ?</label> <select
											id="hasPayDayLoanExpense" name="hasPayDayLoanExpense"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasPayDayLoanExpense"
											ng-change="vm.displayHidePayDayLoanExpense()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayPayDayLoanExpense">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayPayDayLoanExpense">
										<label for="payDayLoanExpenseFrequency">Payday loan
											expense</label> <input id="payDayLoanExpenseFrequency"
											name="payDayLoanExpenseFrequency" class="form-control span-6"
											data-ng-model="vm.model.payDayLoanExpenseFrequency"
											type="text" />
									</div>
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayPayDayLoanExpense">
										<label for="title">Frequency</label> <select
											id="payDayLoanExpenseFrequency"
											name="payDayLoanExpenseFrequency" class="form-control span-6"
											ng-model="vm.CustomerViewModel.payDayLoanExpenseFrequency">
											<option value="">Select</option>
											<option value="01">Hourly</option>
											<option value="02">Daily</option>
											<option value="03">Fortnightly</option>
											<option value="04">Monthly</option>
											<option value="05">Quarterly</option>
											<option value="06">Bi-Annualy</option>
											<option value="07">Annualy</option>
										</select>
									</div>
								</div>



								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button"
											id="btnyourTransportationExpensesProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>


						<div id="yourAssets" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your assets..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you own a house ?</label> <select
											id="hasHomeAsset" name="hasHomeAsset"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasHomeAsset"
											ng-change="vm.displayHideHomeAsset()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayHomeAsset">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayHomeAsset">
										<label for="homeAsset">House price</label> <input
											id="homeAsset" name="homeAsset" class="form-control span-6"
											data-ng-model="vm.model.homeAsset" type="text" />
									</div>


								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you own a vehicle ?</label> <select
											id="hasVehicleAsset" name="hasVehicleAsset"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasVehicleAsset"
											ng-change="vm.displayHideVehicleAsset()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>

								</div>
								<div class="row" ng-show="vm.displayVehicleAsset">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayVehicleAsset">
										<label for="vehicleAsset">Vehicle price</label> <input
											id="vehicleAsset" name="vehicleAsset"
											class="form-control span-6"
											data-ng-model="vm.model.vehicleAsset" type="text" />
									</div>


								</div>
								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a boat ?</label> <select
											id="hasBoatAsset" name="hasBoatAsset"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasBoatAsset"
											ng-change="vm.displayHideBoatAsset()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayBoatAsset">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayBoatAsset">
										<label for="boatAsset">Boat price</label> <input
											id="boatAsset" name="boatAsset" class="form-control span-6"
											data-ng-model="vm.model.boatAsset" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have superannuation ?</label> <select
											id="hasSuperannuationAsset" name="hasSuperannuationAsset"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasSuperannuationAsset"
											ng-change="vm.displayHideSuperannuationAsset()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displaySuperannuationAsset">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displaySuperannuationAsset">
										<label for="superannuationAsset">Superannuation
											balance</label> <input id="superannuationAsset"
											name="superannuationAsset" class="form-control span-6"
											data-ng-model="vm.model.superannuationAsset" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have stocks ?</label> <select
											id="hasStocksAsset" name="hasStocksAsset"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasStocksAsset"
											ng-change="vm.displayHideStocksAsset()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayStocksAsset">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayStocksAsset">
										<label for="stocksAsset">Stocks balance</label> <input
											id="stocksAsset" name="stocksAsset"
											class="form-control span-6"
											data-ng-model="vm.model.stocksAsset" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have investment property ?</label> <select
											id="hasInvestmentPropertyAsset"
											name="hasInvestmentPropertyAsset" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasInvestmentPropertyAsset"
											ng-change="vm.displayHideInvestmentPropertyAsset()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayInvestmentPropertyAsset">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayInvestmentPropertyAsset">
										<label for="investmentPropertyAsset">Investment
											property price</label> <input id="investmentPropertyAsset"
											name="investmentPropertyAsset" class="form-control span-6"
											data-ng-model="vm.model.investmentPropertyAsset" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have term deposits ?</label> <select
											id="hasTermDepositAsset" name="hasTermDepositAsset"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasTermDepositAsset"
											ng-change="vm.displayHideTermDepositAsset()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayTermDepositAsset">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayTermDepositAsset">
										<label for="termDepositAsset">Term deposit balance</label> <input
											id="termDepositAsset" name="termDepositAsset"
											class="form-control span-6"
											data-ng-model="vm.model.termDepositAsset" type="text" />
									</div>

								</div>


								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourAssetsProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>

						<div id="yourLiabilities" class="blade" data-cba-wizard-step>
							<div class="container">
								<div class="row">
									<div class="col-sm-12">
										<h2>Tell us about your liabilities..</h2>

										<p>Please enter all information</p>
									</div>
								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a mortgage?</label> <select
											id="hasHouseMortgageLiability"
											name="hasHouseMortgageLiability" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasHouseMortgageLiability"
											ng-change="vm.displayHideHouseMortgageLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayHouseMortgageLiability">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayHouseMortgageLiability">
										<label for="houseMortgageLiability">Mortgage
											outstanding</label> <input id="houseMortgageLiability"
											name="houseMortgageLiability" class="form-control span-6"
											data-ng-model="vm.model.houseMortgageLiability" type="text" />
									</div>


								</div>
								<div class="row">

									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a car loan ?</label> <select
											id="hasCarLoanLiability" name="hasCarLoanLiability"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCarLoanLiability"
											ng-change="vm.displayHideCarLoanLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>

								</div>
								<div class="row" ng-show="vm.displayCarLoanLiability">
									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCarLoanLiability">
										<label for="carLoanLiability">Car loan outstanding</label> <input
											id="carLoanLiability" name="carLoanLiability"
											class="form-control span-6"
											data-ng-model="vm.model.carLoanLiability" type="text" />
									</div>


								</div>
								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a personal loan ?</label> <select
											id="hasPersonalLoanLiability" name="hasPersonalLoanLiability"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasPersonalLoanLiability"
											ng-change="vm.displayHidePersonalLoanLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayPersonalLoanLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayPersonalLoanLiability">
										<label for="personalLoanLiability">Personal loan
											outstanding</label> <input id="personalLoanLiability"
											name="personalLoanLiability" class="form-control span-6"
											data-ng-model="vm.model.personalLoanLiability" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have store accounts
											liability ?</label> <select id="hasStoreAccountsLiability"
											name="hasStoreAccountsLiability" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasStoreAccountsLiability"
											ng-change="vm.displayHideStoreAccountsLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayStoreAccountsLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayStoreAccountsLiability">
										<label for="storeAccountsLiability">Store account
											outstanding</label> <input id="storeAccountsLiability"
											name="storeAccountsLiability" class="form-control span-6"
											data-ng-model="vm.model.storeAccountsLiability" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a credit card ?</label> <select
											id="hasCreditCardOneLiability"
											name="hasreditCardOneLiability" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCreditCardOneLiability"
											ng-change="vm.displayHideCreditCardOneLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCreditCardOneLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCreditCardOneLiability">
										<label for="creditCardOneLiability">Credit card
											balance</label> <input id="creditCardOneLiability"
											name="creditCardOneLiability" class="form-control span-6"
											data-ng-model="vm.model.creditCardOneLiability" type="text" />
									</div>

								</div>
								<div class="row" ng-show="vm.displayCreditCardOneLiability">
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCreditCardOneLiability">
										<label for="title">Do you have another credit card ?</label> <select
											id="hasCreditCardTwoLiability"
											name="hasreditCardTwoLiability" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCreditCardTwoLiability"
											ng-change="vm.displayHideCreditCardTwoLiability()">
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCreditCardTwoLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCreditCardTwoLiability">
										<label for="creditCardTwoLiability">Credit card
											balance</label> <input id="creditCardTwoLiability"
											name="creditCardTwoLiability" class="form-control span-6"
											data-ng-model="vm.model.creditCardTwoLiability" type="text" />
									</div>

								</div>
								<div class="row" ng-show="vm.displayCreditCardTwoLiability">
									<div class="form-group col-xs-6 col-sm-6 col-md-2"
										ng-show="vm.displayCreditCardTwoLiability">
										<label for="title">Do you have another credit card ?</label> <select
											id="hasCreditCardThreeLiability"
											name="hasreditCardThreeLiability" class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasCreditCardThreeLiability"
											ng-change="vm.displayHideCreditCardThreeLiability()">
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayCreditCardThreeLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayCreditCardThreeLiability">
										<label for="creditCardThreeLiability">Credit card
											balance</label> <input id="creditCardThreeLiability"
											name="creditCardTwoLiability" class="form-control span-6"
											data-ng-model="vm.model.creditCardThreeLiability" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have a student loan ?</label> <select
											id="hasStudyLoanLiability" name="hasStudyLoanLiability"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasStudyLoanLiability"
											ng-change="vm.displayHideStudyLoanLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayStudyLoanLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayStudyLoanLiability">
										<label for="studyLoanLiability">Student loan
											outstanding</label> <input id="studyLoanLiability"
											name="studyLoanLiability" class="form-control span-6"
											data-ng-model="vm.model.studyLoanLiability" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have ATO payables/debt ?</label> <select
											id="hasAtoDebtLiability" name="hasAtoDebtLiability"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasAtoDebtLiability"
											ng-change="vm.displayHideAtoDebtLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayAtoDebtLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayAtoDebtLiability">
										<label for="atoDebtLiability">ATO outstanding</label> <input
											id="atoDebtLiability" name="atoDebtLiability"
											class="form-control span-6"
											data-ng-model="vm.model.atoDebtLiability" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have family debt ?</label> <select
											id="hasFamilyDebtLiability" name="hasFamilyDebtLiability"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasFamilyDebtLiability"
											ng-change="vm.displayHideFamilyDebtLiability()" required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayFamilyDebtLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayFamilyDebtLiability">
										<label for="familyDebtLiability">Family debt
											outstanding</label> <input id="familyDebtLiability"
											name="familyDebtLiability" class="form-control span-6"
											data-ng-model="vm.model.familyDebtLiability" type="text" />
									</div>

								</div>

								<div class="row">
									<div class="form-group col-xs-6 col-sm-6 col-md-2">
										<label for="title">Do you have investment property ?</label> <select
											id="hasInvestmentPropertyLiability"
											name="hasInvestmentPropertyLiability"
											class="form-control span-6"
											ng-model="vm.CustomerViewModel.hasInvestmentPropertyLiability"
											ng-change="vm.displayHideInvestmentPropertyLiability()"
											required>
											<option value="">Select</option>
											<option value="Yes">Yes</option>
											<option value="No">No</option>
										</select>
									</div>
								</div>
								<div class="row" ng-show="vm.displayInvestmentPropertyLiability">

									<div class="form-group col-xs-12 col-sm-12 col-md-3"
										ng-show="vm.displayInvestmentPropertyLiability">
										<label for="investmentPropertyLiability">Investment
											property outstanding</label> <input id="investmentPropertyLiability"
											name="investmentPropertyLiability"
											class="form-control span-6"
											data-ng-model="vm.model.investmentPropertyLiability"
											type="text" />
									</div>

								</div>







								<p>
									<span>To read the privacy policy</span> <a target="_blank">click
										here</a>
								</p>

								<div class="row">

									<div class="col-md-12">
										<button type="button" id="btnYourLiabilitiesProceed"
											class="btn btn-primary" data-cba-wizard-button>
											<span>Ok</span> <i class="icon icon-chevron-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>











					</form>
				

			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Main Footer -->
		<footer class="main-footer">
			<!-- To the right -->
			<div class="pull-right hidden-xs">Anything you want</div>
			<!-- Default to the left -->
			<strong>Copyright &copy; 2015 <a href="#">Company</a>.
			</strong> All rights reserved.
		</footer>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Create the tabs -->
			<ul class="nav nav-tabs nav-justified control-sidebar-tabs">
				<li class="active"><a href="#control-sidebar-home-tab"
					data-toggle="tab"><i class="fa fa-home"></i></a></li>
				<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i
						class="fa fa-gears"></i></a></li>
			</ul>
			<!-- Tab panes -->
			<div class="tab-content">
				<!-- Home tab content -->
				<div class="tab-pane active" id="control-sidebar-home-tab">
					<h3 class="control-sidebar-heading">Recent Activity</h3>
					<ul class="control-sidebar-menu">
						<li><a href="javascript::;"> <i
								class="menu-icon fa fa-birthday-cake bg-red"></i>
								<div class="menu-info">
									<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>
									<p>Will be 23 on April 24th</p>
								</div>
						</a></li>
					</ul>
					<!-- /.control-sidebar-menu -->

					<h3 class="control-sidebar-heading">Tasks Progress</h3>
					<ul class="control-sidebar-menu">
						<li><a href="javascript::;">
								<h4 class="control-sidebar-subheading">
									Custom Template Design <span
										class="label label-danger pull-right">70%</span>
								</h4>
								<div class="progress progress-xxs">
									<div class="progress-bar progress-bar-danger"
										style="width: 70%"></div>
								</div>
						</a></li>
					</ul>
					<!-- /.control-sidebar-menu -->

				</div>
				<!-- /.tab-pane -->
				<!-- Stats tab content -->
				<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab
					Content</div>
				<!-- /.tab-pane -->
				<!-- Settings tab content -->
				<div class="tab-pane" id="control-sidebar-settings-tab">
					<form method="post">
						<h3 class="control-sidebar-heading">General Settings</h3>
						<div class="form-group">
							<label class="control-sidebar-subheading"> Report panel
								usage <input type="checkbox" class="pull-right" checked>
							</label>
							<p>Some information about this general settings option</p>
						</div>
						<!-- /.form-group -->
					</form>
				</div>
				<!-- /.tab-pane -->
			</div>
		</aside>
		<!-- /.control-sidebar -->
		<!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
		<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->

	<!-- REQUIRED JS SCRIPTS -->

	<!-- jQuery 2.1.4 
	<script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>-->
	<!-- Bootstrap 3.3.5 -->

<script src="bower_components/jquery/jquery.js"></script>
<script src="bower_components/angular/angular.js"></script>


	<!-- Optionally, you can add Slimscroll and FastClick plugins.
         Both of these plugins are recommended to enhance the
         user experience. Slimscroll is required when using the
         fixed layout. -->









	<script src="dist/cbaWizard.js"></script>
	<script src="typeform.js"></script>

	

</body>
</html>
