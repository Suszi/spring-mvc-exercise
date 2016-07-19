<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New client</title>
<script type="text/javascript" charset="utf8"
	src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<link rel="stylesheet" href="<spring:theme code='css'/>">
</head>
<body>
	<h1>
		<spring:message code="newClient" />
	</h1>
	<form:form commandName="newClientRequestModel" action="newClientPost">
		<div>
			<label for="name"><spring:message code="name" /></label>
			<form:input path="name" type="text" id="name" placeholder="Name" />
			<form:errors path="name" />
		</div>
		<button type="submit">
			<spring:message code="submit" />
		</button>
	</form:form>
</body>
</html>