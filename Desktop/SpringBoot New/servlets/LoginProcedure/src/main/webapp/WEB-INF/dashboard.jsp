<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false" %>
 
 <h1>welcome Dashboard</h1>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">

<meta charset="utf-8"><meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="../images/favicon.ico" type="image/ico">
<title>
	Master Page
</title>
<link href="../Content/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="../Content/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="../Content/css/custom.min.css" rel="stylesheet" type="text/css">
<style type="text/css">
        .colorBlue1
        {
            background: #003366;
        }
        .colorBlue2
        {
            background: #0064c8;
        }
        .colorBlue3
        {
            background: #52a9ff;
        }
        .colorWhite
        {
            color: #E7E7E7;
        }
        .nav.navbar-nav > li > a
        {
            color: #E7E7E7 !important;
        }
        .nav.navbar-nav > li > a:Hover
        {
            color: #E7E7E7 !important;
        }
        .nav.side-menu>li.active, .nav.side-menu>li.current-page
        {
            border-right: 5px solid #003366 !important;
        }
    </style>
</head>
<body class="nav-sm">
<form method="post" action="../HTML/Dashboard.html" id="form1">
<div class="aspNetHidden">
<input type="hidden" name="ToolkitScriptManager1_HiddenField" id="ToolkitScriptManager1_HiddenField" value="">
<input type="hidden" name="__EVENTTARGET" id="__EVENTTARGET" value="">
<input type="hidden" name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUKMTY1NDU2MTA1Mg9kFgJmDw8WBB4JcGFnZUluZGV4AgEeDVZhbGlkYXRpb25LZXllZBYCAgMPZBYGAgMPDxYCHgRUZXh0BRFNdWZhZGRhbCBOdWxsd2FsYWRkAgUPDxYCHwIFK1lvdXIgTGFzdCBMb2dpbiB0aW1lIDogMjEtQXVnLTIwMTggMTE6MDk6NTFkZAIHDw8WAh8CBQpNTkMwMDA4MzM2ZGRkW9jxIzA7hSn6rAOV/lDe9Sz+pBRNZKUvqtUOjCRbMK0=">
</div>
<script type="text/javascript">
//<![CDATA[
    var theForm = document.forms['form1'];
    if (!theForm) {
        theForm = document.form1;
    }
    function __doPostBack(eventTarget, eventArgument) {
        if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
            theForm.__EVENTTARGET.value = eventTarget;
            theForm.__EVENTARGUMENT.value = eventArgument;
            theForm.submit();
        }
    }
//]]>
</script>


<script type="text/javascript">
//<![CDATA[
    //if (typeof (Sys) === 'undefined') throw new Error('ASP.NET Ajax client-side framework failed to load.');
//]]>
</script>

<div class="aspNetHidden">
<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="B543B226">
</div>
<script type="text/javascript">
//<![CDATA[
//        Sys.WebForms.PageRequestManager._initialize('ctl00$ToolkitScriptManager1', 'form1', [], [], [], 90, 'ctl00');
//]]>
</script>
<div class="container body">
<div class="colorBlue1 main_container">
<div class="colorBlue1 col-md-3 left_col">
<div class="colorBlue1 left_col scroll-view">
<div class="navbar nav_title colorBlue1" style="border: 0;">
<a href="Dashboard.html" class="site_title" style="border-bottom: 1px solid #000f1e;">
<img class="img img-circle" src="../Content/images/logo/AppIcon.png" height="50px" width="50px">
</a>
</div>
<div class="clearfix">
</div>

<br>

<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
<div class="menu_section active">
<ul class="nav side-menu" style="">
<li class=""><a><i class="fa fa-home"></i>Master Management <span class="fa fa-chevron-down">
</span></a>
<ul class="nav child_menu" style="display: none;">
<li class="current-page"><a href="../HTML/TopicMaster.html#">Topic Master</a></li>
<li class="current-page"><a href="../HTML/SinkMaster.html#">Sink Master</a></li>
<li class="current-page"><a href="../HTML/LookupMaster.html#">LookUp Master</a></li>
</ul>
</li>
<li class=""><a><i class="fa fa-edit"></i>Configuration Mgmt <span class="fa fa-chevron-down">
</span></a>
<ul class="nav child_menu" style="display: none; margin-top: 16px;">
<li class="current-page"><a href="../HTML/RuleConfig.html">Rule Configuration</a></li>
<li class="current-page"><a href="../HTML/ActionConfig.html">Action configuration</a></li>
</ul>
</li>
<li class=""><a><i class="fa fa-desktop"></i>User Master <span class="fa fa-chevron-down"></span>
</a>
<ul class="nav child_menu" style="display: none;">
<li class="current-page"><a href="#">User Master</a></li>
<li class="current-page"><a href="#">Role Master</a></li>
</ul>
</li>
<li class=""><a><i class="fa fa-table"></i>Auth Master <span class="fa fa-chevron-down"></span>
</a>
<ul class="nav child_menu" style="display: none;">
<li class="current-page"><a href="#">Topic Auth</a></li>
<li class="current-page"><a href="#">Sink Auth</a></li>
<li class="current-page"><a href="#">LookUp Auth</a></li>
<li class="current-page"><a href="#">Rule Auth</a></li>
<li class="current-page"><a href="#">Action Auth</a></li>
<li class="current-page"><a href="#">User Auth</a></li>
<li class="current-page"><a href="#">Role Auth</a></li>
</ul>
</li>
</ul>
</div>
</div>



</div>
</div>

<br>
<br>
<div class="top_nav navbar-fixed-top">
<div class="nav_menu colorBlue1">
<nav>
<div class="nav toggle">
<a id="menu_toggle" class="colorWhite"><i class="fa fa-bars" style="background:#003366;"></i></a>
</div>
<ul class="nav navbar-nav navbar-right">
<li class="">
<a href="javascript:;" class="user-profile dropdown-toggle" style="background:#003366;" data-toggle="dropdown" aria-expanded="false">
<img src="../Images/img.jpg" alt=""><span id="lblusername">Prashanth Bharathala</span>&nbsp;
<span class=" fa fa-angle-down"></span>
</a>
<ul class="dropdown-menu dropdown-usermenu pull-right">
<li><a href="#" style="cursor:default;"> <span id="lblLastLogin">Your Last Login time : ${lastlogin}</span></a></li>
<li><a href="#" style="cursor:default;"> <span id="lblUserID">${adid }</span></a></li>
<li><a href="../LogOut.aspx"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
</ul>
</li>
<li role="presentation" class="dropdown">
<a href="javascript:;" class="dropdown-toggle info-number" style="background:#003366;" data-toggle="dropdown" aria-expanded="false">
<i class="fa fa-envelope-o"></i>
<span class="badge bg-green">6</span>
</a>
<ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
<li>
<a>
<span class="image"><img src="../Images/img.jpg" alt="Profile Image"></span>
<span>
<span>Prashanth Bharathala</span>
<span class="time">3 mins ago</span>
</span>
<span class="message">
Film festivals used to be do-or-die moments for movie makers. They were where...
</span>
</a>
</li>
<li>
<a>
<span class="image"><img src="../Images/img.jpg" alt="Profile Image"></span>
<span>
<span>Prashanth Bharathala</span>
<span class="time">3 mins ago</span>
</span>
<span class="message">
Film festivals used to be do-or-die moments for movie makers. They were where...
</span>
</a>
</li>
<li>
<a>
<span class="image"><img src="../Images/img.jpg" alt="Profile Image"></span>
<span>
<span>Prashanth Bharathala</span>
<span class="time">3 mins ago</span>
</span>
<span class="message">
Film festivals used to be do-or-die moments for movie makers. They were where...
</span>
</a>
</li>
<li>
<a>
<span class="image"><img src="../Images/img.jpg" alt="Profile Image"></span>
<span>
<span>Prashanth Bharathala</span>
<span class="time">3 mins ago</span>
</span>
<span class="message">
Film festivals used to be do-or-die moments for movie makers. They were where...
</span>
</a>
</li>
<li>
<div class="text-center">
<a>
<strong>See All Alerts</strong>
<i class="fa fa-angle-right"></i>
</a>
</div>
</li>
</ul>
</li>
</ul>
</nav>
</div>
</div>


<div class="right_col" role="main" style="min-height: 337px;">

<div class="row">
<div class="x_panel" style="background-color: #fff;">
<div class="x_title">
<h5 style="font-weight: bold;">
Dashboard</h5>
<div class="clearfix">
</div>
</div>
<div class="x_content">
<div class="">
<div class="row top_tiles">
<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12 colorWhite" style="background: #8A2BE2;
                            border-right: 4px solid #fff">
<div class="tile-stats" style="background: #8A2BE2; border: 0 none;">
<div class="icon">
<i class="fa"></i>
</div>
<div class="count">
179</div>
<h4 style="color: #E7E7E7 !important;">
Total Topics</h4>
</div>
</div>
<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12 colorWhite" style="background: #00CED1;
                            border-right: 4px solid #fff">
<div class="tile-stats" style="background: #00CED1; border: 0 none;">
<div class="icon">
<i class="fa"></i>
</div>
<div class="count">
50</div>
<h4 style="color: #E7E7E7 !important;">
Total Rules</h4>
</div>
</div>
<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12 colorWhite" style="background: #20B2AA;
                            border-right: 4px solid #fff">
<div class="tile-stats" style="background: #20B2AA; border: 0 none;">
<div class="icon">
<i class="fa"></i>
</div>
<div class="count">
70</div>
<h4 style="color: #E7E7E7 !important;">
Total Action</h4>
</div>
</div>
<div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12 colorWhite" style="background: #00BFFF;">
<div class="tile-stats" style="background: #00BFFF; border: 0 none;">
<div class="icon">
<i class="fa"></i>
</div>
<div class="count">
5</div>
<h4 style="color: #E7E7E7 !important;">
Authorisation Pending</h4>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>



</div>
</div>
<script src="../Content/js/jquery.min.js" type="text/javascript"></script>
<script src="../Content/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../Content/js/bootstrap-progressbar.js" type="text/javascript"></script>
<script src="../Content/js/bootstrap-progressbar.min.js" type="text/javascript"></script>
<script src="../Content/js/custom.min.js" type="text/javascript"></script>
<script type="text/javascript">
//<![CDATA[
    //(function () { var fn = function () { $get("ToolkitScriptManager1_HiddenField").value = ''; Sys.Application.remove_init(fn); }; Sys.Application.add_init(fn); })();//]]>
</script>
</form>
</body> --%>
<!-- </html> -->