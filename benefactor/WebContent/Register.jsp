<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	 <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	
	<title>beneFactor - Register...</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <link href="css/bootstrap.css" rel="stylesheet" />
    <link href="css/landing-page.css" rel="stylesheet"/>
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>

<body class="landing-page">

<nav class="navbar navbar-transparent navbar-top" role="navigation">
    <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button id="menu-toggle" type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar bar1"></span>
        <span class="icon-bar bar2"></span>
        <span class="icon-bar bar3"></span>
      </button>
      <a href="http://codedesign.elkind.net/">
                   <div class="logo-container">
                        <div class="logo">
                            <!-- you logo img -->
                        </div>
                        <div class="brand">
                         beneFactor
                        </div>
                    </div>
              </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="example" >
      <ul class="nav navbar-nav navbar-right">

              <li>
                  <a href="#">
                      Home
                  </a>
              </li>
              <li>
                  <a href="#">
                      Company
                  </a>
              </li>
              <li>
                  <a href="#">
                      Portfolio
                  </a>
              </li>
              <li>
                  <a href="#">
                      Blog
                  </a>
              </li>

            <li>
                <a href="#"> 
                    <i class="fa fa-facebook-square"></i>
                </a>
            </li>
             <li>
                <a href="#"> 
                    <i class="fa fa-twitter"></i>
                </a>
            </li>
              <li>
                <a href="#"> 
                    <i class="fa fa-pinterest"></i>
                </a>
            </li>
       </ul>
    </div><!-- /.navbar-collapse -->
  </div>
</nav>

    <div class="parallax filter-gradient blue" data-color="blue">
        <div class="parallax-background">
            <img src="img/landing-page-1/bg.jpg">
        </div>
        <div class= "container"> 
            <div class="row">
                <div class="col-sm-5 hidden-xs">
                    <div class="parallax-image">
                        <img src="img/landing-page-1/iphone.png"/>
                    </div>
                </div>
                <div class="col-sm-6 col-xs-offset-1">
                    <div class="description">
                        <h2>Let's ease off your hardships</h2>
                        <br>
                        <h5>It is never too late to take care of your financial well being. If you are having any difficulty paying your bills or want to be prepared for any unforseen problems, then this is the place you have to be!</h5>
                    </div>
                    <div class="buttons">
                        <a href="http://codedesign.elkind.net/themes/bootstrap-theme-basic-app/">
                            <button class="btn btn-neutral btn-lg">
                                <i class="fa fa-lg fa-apple"></i> App Store
                            </button>
                        </a>
                        <a href="http://codedesign.elkind.net/themes/bootstrap-theme-basic-app/">
                            <button class="btn btn-simple btn-neutral">
                                <i class="fa fa-lg fa-android"></i>
                            </button>
                        </a>
                        <a href="http://codedesign.elkind.net/themes/bootstrap-theme-basic-app/">
                            <button class="btn btn-simple btn-neutral">
                                <i class="fa fa-lg fa-windows"></i>
                            </button>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="section section-gray section-clients">
        <div class="container">
    <h1 class="well">Registration Form</h1>
	<div class="col-lg-12 well">
	<div class="row">
				<s:actionerror theme="bootstrap"/>
					<s:form action="doRegister.action" method="post" theme="bootstrap" cssClass="form-horizontal">
					<div class="col-sm-12">
					<div class="row">
							<div class="col-sm-6 form-group">
								<!-- <label>User Name</label>-->
								<s:textfield class="form-control" name="userName" key="label.username"/>
								<!-- <input type="text" placeholder="Enter Username Here.." class="form-control">-->
							</div>
							<div class="col-sm-6 form-group">
								<!-- <label>Password</label>-->
								<s:password class="form-control" name="password" key="label.password"/>
								<!-- <input type="text" placeholder="Enter Password Here.." class="form-control"> -->
							</div>
						</div>				
						<div class="row">
							<div class="col-sm-6 form-group">
								<!-- <label>First Name</label>-->
								<s:textfield class="form-control" name="firstName" key="label.firstname"/>
								<!-- <input type="text" placeholder="Enter First Name Here.." class="form-control">-->
							</div>
							<div class="col-sm-6 form-group">
								<!-- <label>Last Name</label>-->
								<s:textfield class="form-control" name="lastName" key="label.lastname"/>
								<!-- <input type="text" placeholder="Enter Last Name Here.." class="form-control"> -->
							</div>
						</div>	
						<div class="row">				
						<div class="col-sm-12 form-group">
							<!-- <label>Address</label> -->
							<s:textfield class="form-control" name="address" key="label.address"/>
							<!-- <textarea placeholder="Enter Address Here.." rows="3" class="form-control"></textarea> -->
						</div>	
						</div>
						<div class="row">
							<div class="col-sm-4 form-group">
								<!-- <label>City</label>-->
								<s:textfield class="form-control" name="city" key="label.city"/>
								<!-- <input type="text" placeholder="Enter City Name Here.." class="form-control">-->
							</div>	
							<div class="col-sm-4 form-group">
								<!-- <label>State</label>-->
								<s:textfield class="form-control" name="state" key="label.state"/>
								<!-- <input type="text" placeholder="Enter State Name Here.." class="form-control">-->
							</div>	
							<div class="col-sm-4 form-group">
								<!--<label>Zip</label>-->
								<s:textfield class="form-control" name="zip" key="label.zip"/>
								<!-- <input type="text" placeholder="Enter Zip Code Here.." class="form-control">-->
							</div>		
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
								<!-- <label>Title</label>-->
								<s:textfield class="form-control" name="title" key="label.title"/>
								<!-- <input type="text" placeholder="Enter Designation Here.." class="form-control">-->
							</div>		
							<div class="col-sm-6 form-group">
								<!-- <label>Company</label>-->
								<s:textfield class="form-control" name="company" key="label.company"/>
								<!-- <input type="text" placeholder="Enter Company Name Here.." class="form-control">-->
							</div>	
						</div>						
					<div class="form-group">
						<!-- <label>Phone Number</label>-->
						<s:textfield class="form-control" name="phoneNumber" key="label.phonenumber"/>
						<!-- <input type="text" placeholder="Enter Phone Number Here.." class="form-control">-->
					</div>		
					<div class="form-group">
						<!-- <label>Email Address</label>-->
						<s:textfield class="form-control" name="emailAddress" key="label.emailaddress"/>
						<!-- <input type="text" placeholder="Enter Email Address Here.." class="form-control">-->
					</div>	
					<div class="form-group">
						<!-- <label>Website</label>-->
						<s:textfield class="form-control" name="website" key="label.website"/>
						<!-- <input type="text" placeholder="Enter Website Name Here.." class="form-control">-->
					</div>
					<s:submit method="execute" key="label.register" class="btn btn-lg btn-info" />
									
					</div>
				</s:form> 
				</div>
	</div>
	</div>
    </div>
    
    
    
   

    



      

<div class="section section-contact">
    <div class="container text-center">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>Contact beneFactor Team</h2>
                <p>Feel free to email us to provide some feedback on our application or websites, or to just say hello!</p>
                <ul class="list-inline banner-social-buttons">
                    
                    <li>
                        <a href="https://twitter.com/fahadbinrahat" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                    </li>
                    <li>
                        <a href="https://www.facebook.com/jfahadbinrahat" class="btn btn-default btn-lg"><i class="fa fa-facebook fa-fw"></i> <span class="network-name">Facebook</span></a>
                    </li>
                    <li>
                        <a href="mailto:fahadbinrahat@hotmail.com" class="btn btn-default btn-lg"><i class="fa fa-envelope fa-fw"></i> <span class="network-name">GMAIL</span></a>
                    </li>
                    <li>
                        <a href="https://plus.google.com/fahadbinrahat/" class="btn btn-default btn-lg"><i class="fa fa-google-plus fa-fw"></i> <span class="network-name">Google+</span></a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
    
    <footer class="footer">
            <div class="container">
                <nav class="pull-left copyright">
                    &copy; 2015 <a href="http://codedesign.elkind.net/">DigiMash</a>
                </nav>
                <div class="social-area pull-right">
                        <a href="https://twitter.com/fahadbinrahat" class="btn btn-social btn-simple"><i class="fa fa-twitter fa-fw"></i> <span class="network-name"></span></a>
                        <a href="https://www.facebook.com/fahadbinrahat" class="btn btn-social btn-simple"><i class="fa fa-facebook fa-fw"></i> <span class="network-name"></span></a>
                        <a href="mailto:fahadbinrahat@hotmail.com" class="btn btn-social btn-simple"><i class="fa fa-envelope fa-fw"></i> <span class="network-name"></span></a>
                        <a href="https://plus.google.com/+fahadbinrahat/" class="btn btn-social btn-simple"><i class="fa fa-google-plus fa-fw"></i> <span class="network-name"></span></a>
                </div>
            </div>

<div class="fixed-plugin">
    <div class="dropdown open">
      <a href="#" data-toggle="dropdown"> 
        <i class="fa fa-cog fa-spin fa-2x"> </i>
      </a>
      <ul class="dropdown-menu">
        <h6 class="text-center">Choose Style</h6>
            <li>
                <a href="javascript:void(0)" class="selector" data-color="gray" data-button="default">
                    <div style="border-radius:50%; background: #777; width:50px; height: 50px; margin: 5px auto;;"></div>
                </a>
            </li>
            <li class="active">
                <a href="javascript:void(0)" class="selector" data-color="blue" data-button="info">
                    <div style="border-radius:50%; background: #2ca8ff; width:50px; height: 50px;margin: 5px  auto;"></div>
                 </a>
            </li>
            <li>
                <a href="javascript:void(0)" class="selector" data-color="green" data-button="success">
                    <div style="border-radius:50%; background: #3ABE41; width:50px; height: 50px;margin: 5px  auto;"></div>
                </a>
            </li>
             <li>
                <a href="javascript:void(0)" class="selector" data-color="orange" data-button="warning">
                    <div style="border-radius:50%; background: #FFA17F; width:50px; height: 50px;margin: 5px  auto;"></div>
                </a>
            </li>
              <li>
                <a href="javascript:void(0)" class="selector" data-color="red" data-button="danger">
                    <div style="border-radius:50%; background: #cc0000; width:50px; height: 50px;margin: 5px  auto;"></div>
                </a>
            </li>
        <li>
            <a href="http://codedesign.elkind.net/themes/bootstrap-theme-basic-app/" target="_blank" class="btn btn-default btn-fill">DOWNLOAD</a>
        </li>
      </ul>
    </div>
 </div>

        </footer>

</body>
    <script src="js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>

	<script src="js/bootstrap.js" type="text/javascript"></script>

    <script type="text/javascript">
        var big_image;
        $().ready(function(){

            responsive = $(window).width();
            
            if (responsive >= 768){
                big_image = $('.parallax-background').find('img');
                console.log(big_image);
                $(window).on('scroll',function(){           
                    parallax();
                });
            }

            $('.selector').click(function() {
                SelectColor(this);
            });              
        });

        function SelectColor(btn) {
            oldColor = $('.filter-gradient').attr('data-color');
            newColor = $(btn).attr('data-color');

            oldButton = $('#Demo').attr('data-button');
            newButton = $(btn).attr('data-button');
           
            $('.filter-gradient').removeClass(oldColor).addClass(newColor).attr('data-color',newColor);

            $('#Demo').removeClass("btn-"+oldButton).addClass("btn-"+newButton).attr('data-button',newButton);

            $('.carousel-indicators').removeClass("carousel-indicators-"+oldColor).addClass("carousel-indicators-"+newColor);

            $('.card').removeClass("card-"+oldColor).addClass("card-"+newColor);
            
            $('.selector').parent().removeClass('active');
            $(btn).parent().addClass('active');
        }
        
       var parallax = function() {
            var current_scroll = $(this).scrollTop();
            
            oVal = ($(window).scrollTop() / 3); 
            big_image.css('top',oVal);
        };
    </script>
	<script src="js/SmoothScroll.js"></script>

<!--
Google Analitics
Demo Purpose Only
Change UA-XXXXXXX-X to be your site's ID
 -->
<script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-1057679-2', 'auto');
    ga('send', 'pageview');

</script>

</html>

