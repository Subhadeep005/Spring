<%@ page isELIgnored="false"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <c:url value="/resources" var="resourcesUrl"></c:url>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link rel= "stylesheet" href="${resourcesUrl}/css/bootstrap.min.css" />
<script type="text/javascript" src="${resourcesUrl}/js/bootstrap.min.js" ></script>
<script type="text/javascript" src="${resourcesUrl}/js/jquery-3.2.1.js" ></script>
</head>
<body>
	<div class="jumbotron text-center">
			<h1 style="color: #F00">Spring MVC Resources Mapping</h1>
			<p>In This application We have discussed Spring MVC Resource Mapping</p>
	</div>
	
	<div class="container">
			<div class="row">
				<div class="col-sm-4">
						<img class="img-thumbnail img-responsive" src="${resourcesUrl}/images/1.ico" />
				</div>
				<div class="col-sm-4">
						<img class="img-thumbnail img-responsive" src="${resourcesUrl}/images/2.ico" />
				</div>
				<div class="col-sm-4">
						<img class="img-thumbnail img-responsive" src="${resourcesUrl}/images/3.ico" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-sm-4">
						<img class="img-thumbnail img-responsive" src="${resourcesUrl}/images/4.ico" />
				</div>
				<div class="col-sm-4">
						<img class="img-thumbnail img-responsive" src="${resourcesUrl}/images/5.ico" />
				</div>
				<div class="col-sm-4">
						<img class="img-thumbnail img-responsive" src="${resourcesUrl}/images/6.ico" />
				</div>
			</div>
			
	</div>
	<h1>Hello</h1>
	<img alt="" src="resources/images/1.ico">
</body>
</html>