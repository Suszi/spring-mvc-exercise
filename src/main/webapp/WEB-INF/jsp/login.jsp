<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form role="form" action="<c:url value='/j_spring_security_check'/>"
		method="post">
		<div class="form-group">
			<input type="text" name="j_username"
				placeholder=<spring:message code="username" /> autocomplete="off"
				required pattern=".{3,16}" />
		</div>
		<div class="form-group">
			<input type="password" name="j_password"
				placeholder=<spring:message code="password"/> autocomplete="off"
				required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" />
		</div>
		<button type="submit" class="btn btn-default">
			<spring:message code="submit" />
		</button>
	</form>
</body>
</html>