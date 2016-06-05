<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%--  <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title><tiles:getAsString name="title"/></title>

    <!-- Bootstrap -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
  <link href="resources/css/animate.min.css" rel="stylesheet"> 
  <link href="resources/css/font-awesome.min.css" rel="stylesheet">
  <link href="resources/css/lightbox.css" rel="stylesheet">
  <link href="resources/css/main.css" rel="stylesheet">
  <link id="css-preset" href="resources/css/presets/preset1.css" rel="stylesheet">
  <link href="resources/css/responsive.css" rel="stylesheet">
	
	<script type="text/javascript" src="resources/js/jquery.js"></script>
  <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"></script>
  <script type="text/javascript" src="resources/js/jquery.inview.min.js"></script>
  <script type="text/javascript" src="resources/js/wow.min.js"></script>
  <script type="text/javascript" src="resources/js/mousescroll.js"></script>
  <script type="text/javascript" src="resources/js/smoothscroll.js"></script>
  <script type="text/javascript" src="resources/js/jquery.countTo.js"></script>
  <script type="text/javascript" src="resources/js/lightbox.min.js"></script>
  <script type="text/javascript" src="resources/js/main.js"></script>
	
  <!--   <style type="text/css">
        a.bg-primary{padding:15px 10px;}
        a.bg-primary:hover,a.bg-primary:focus{color:white;}
        .tagline{margin-bottom:100px;}
    </style> -->    
  </head>
  <body >
    <div class="container-fluid">
        <%-- <div class="row">
            <div class="col-md-12" id="header">
                <tiles:insertAttribute name="header" />
            </div>
        </div> --%>
       
        <%--  <div class="row" style="margin-top: 3%">
            <div class="col-md-12" id="menu">
                <tiles:insertAttribute name="menu" />
            </div>
        </div> --%>
        
        <div class="row " style="margin-top: 0%">
            <div class="col-md-12" id="body" >
                <tiles:insertAttribute name="body" />
            </div>
        </div>
       
          <%--   <div class="row">
            <div class="col-md-12" id="footer">
                <tiles:insertAttribute name="footer" />
            </div>
        </div> --%>

  </div>
  </body>
</html>