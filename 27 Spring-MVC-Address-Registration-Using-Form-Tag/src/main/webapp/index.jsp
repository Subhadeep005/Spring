<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<body>
<h2>Customer Model</h2>
		<c:url value="/address" var="addPage" />
		<a href="${addPage }">Input Address</a>
</body>
</html>
