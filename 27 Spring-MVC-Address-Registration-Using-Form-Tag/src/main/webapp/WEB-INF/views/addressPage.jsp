<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Input</title>
</head>
<body>
		<h1>Address Page</h1>
		
		<form:form modelAttribute="addressDto">
				<table>
						<tr>
								<td>House No :</td>
								<td><form:input path="houseNo"/></td>
						</tr>
						<tr>
								<td>Street :</td>
								<td><form:input path="street"/></td>
						</tr>
						<tr>
								<td>City :</td>
								<td><form:input path="city"/></td>
						</tr>
						<tr>
								<td>State :</td>
								<td><form:input path="state"/></td>
						</tr>
						<tr>
								<td>Zipcode :</td>
								<td><form:input path="zipcode"/></td>
						</tr>
						<tr>
								<td><input type="submit" value="Save"/></td>
						</tr>
				</table>
		</form:form>
</body>
</html>