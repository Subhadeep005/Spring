<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Welcome to Spring Security Configuration</h2>
	<a href="<c:url value="/admin"></c:url>">Admin</a><br>
	<a href="<c:url value="/user"></c:url>">User</a>
</body>
</html>