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
			<div class="container text-center">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
						<c:url value="/customer/register" var="registerUrl"></c:url>
								<form:form modelAttribute="customerDto" cssClass="form-group" action="${registerUrl }">
				<table>
						<tr>
								<td>First Name :</td>
								<td><form:input path="firstName"/></td>
								<td><form:errors path="firstName" cssClass="errors" /></td>
						</tr>
						<tr>
								<td>Last Name :</td>
								<td><form:input path="lastName"/></td>
								<td><form:errors path="lastName" cssClass="errors"/></td>
						</tr>
						<tr>
								<td>Email :</td>
								<td><form:input path="email"/></td>
								<td><form:errors path="email" cssClass="errors" /></td>
						</tr>
						<tr>
								<td>Mobile :</td>
								<td><form:input path="mobile"/></td>
								<td><form:errors path="mobile" cssClass="errors" /></td>
						</tr>
						<tr>
								<td>Password :</td>
								<td><form:input path="password"/></td>
								<td><form:errors path="password" cssClass="errors" /></td>
						</tr>
						<tr>
								<td>Confirm Password :</td>
								<td><form:input path="confirmPassword"/></td>
								<td><form:errors path="confirmPassword" cssClass="errors" /></td>
						</tr>
						<tr>
								<td colspan="2"> <input class= "btn btn-danger" type="submit" value="Register"/></td>
						</tr>
				</table>
		</form:form>
						</div>
						<div class="col-md-2"></div>
					</div>
			</div>

</body>
</html>