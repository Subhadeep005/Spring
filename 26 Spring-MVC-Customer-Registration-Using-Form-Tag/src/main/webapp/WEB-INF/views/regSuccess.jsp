<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
<h1>Registration Successful</h1>
<h3>ID : ${customer.id }</h3>
<h3>First Name : ${customer.firstName }</h3>
<h3>Last Name : ${customer.lastName }</h3>
<h3>Email : ${customer.email }</h3>
<h3>Mobile : ${customer.mobile }</h3>
</body>
</html>