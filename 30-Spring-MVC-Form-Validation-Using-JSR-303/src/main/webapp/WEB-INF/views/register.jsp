<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <c:url value="/resources" var="resourcesUrl"></c:url>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CodingRAJA Home</title>
<link rel= "stylesheet" href="${resourcesUrl}/css/bootstrap.css" />
<link rel= "stylesheet" href="${resourcesUrl}/css/bootstrap.min.css" />
<link rel= "stylesheet" href="${resourcesUrl}/css/style.css" />
<script type="text/javascript" src="${resourcesUrl}/js/bootstrap.min.js" ></script>
<script type="text/javascript" src="${resourcesUrl}/js/jquery-3.2.1.js" ></script>
</head>
<body>
	<div class="jumbotron text-center">
			<h1>Customer Registration Page</h1>
			</div>
			<div class="container">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
						<c:url value="/customer/register" var="registerUrl"></c:url>
								<form:form modelAttribute="customerDto" cssClass="form-group" action="${registerUrl }">
									<div Class="form-group">
										<label for="firstName">
										First Name : &nbsp;
										<form:errors path="firstName" cssClass="errors" />
										</label>
										<form:input path="firstName" Class="form-control" placeholder="First Name"/>
									</div>
										<div Class="form-group">
										<label for="lasstName">
										Last Name : &nbsp;
										<form:errors path="lastName" cssClass="errors" />
										</label>
										<form:input path="lastName" Class="form-control" placeholder="Last Name"/>
									</div>
								<div Class="form-group">
										<label for="email">
										Email : &nbsp;
										<form:errors path="email" cssClass="errors" />
										</label>
										<form:input path="email" Class="form-control" placeholder="Email"/>
									</div>
						<div Class="form-group">
										<label for="mobile">
										Mobile : &nbsp;
										<form:errors path="mobile" cssClass="errors" />
										</label>
										<form:input path="mobile" Class="form-control" placeholder="Mobile"/>
									</div>
						<div Class="form-group">
										<label for="password">
										Password : &nbsp;
										<form:errors path="password" cssClass="errors" />
										</label>
										<form:input path="password" Class="form-control" placeholder="Password"/>
									</div>
						<div Class="form-group">
										<label for="confirmPassword">
										 Confirm Password : &nbsp;
										<form:errors path="confirmPassword" cssClass="errors" />
										</label>
										<form:input path="confirmPassword" Class="form-control" placeholder="Confirm Password"/>
									</div>
								<input class= "btn btn-danger" type="submit" value="Register"/>
		</form:form>
						</div>
						<div class="col-md-2"></div>
					</div>
			</div>

</body>
</html>