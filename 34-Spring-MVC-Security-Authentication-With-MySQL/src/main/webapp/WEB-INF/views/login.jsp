<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Here</h1>

<c:if test="${param.error ne null }">
	<p style="color: #F00;">Invalid Username or Password !</p>
</c:if>
<c:if test="${param.logout ne null }">
	<p style="color: green;">You have been logout Successfully !</p>
</c:if>

<c:url value="/login" var="loginUrl"></c:url>
	<form action="${loginUrl}" method="post">
	<table>
		<tr><td>Username :</td> 
		<td><input type="text" name="username" /></td></tr>
		<tr><td>Password : </td>
		<td><input type="password" name="password" /></td></tr>
		
		<tr>
			<td> <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }" /> </td>
			<td colspan="2"><input type="submit" value="Login"></td>
		</tr>
		</table>
	</form>
</body>
</html>