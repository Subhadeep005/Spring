<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>
<body>
	<h1>Title: ${title}</h1>
	<h1>Message: ${message}</h1>
	<h1>Welcome: ${pageContext.request.userPrincipal.name} </h1>
	
	<c:url value="/j_spring_security_logout" var="logoutUrl"></c:url>
	<form action="${logoutUrl}" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }" />
		<input type="submit" value="Logout">
	</form>
</body>
</html>