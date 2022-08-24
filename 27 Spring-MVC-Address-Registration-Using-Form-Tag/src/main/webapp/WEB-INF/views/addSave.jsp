<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address</title>
</head>
<body>
<h1>Customer Address</h1>
<h3>Address ID : ${address.id }</h3>
<h3>House No : ${address.houseNo }</h3>
<h3>Street : ${address.street}</h3>
<h3>City : ${address.city }</h3>
<h3>State : ${address.state }</h3>
<h3>Zipcode : ${address.zipcode }</h3>
</body>
</html>