<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New client</title>
<script type="text/javascript" charset="utf8" src="//code.jquery.com/jquery-1.10.2.min.js"></script>
</head>
<body>
	<h1>New client</h1>
	<form:form commandName="newClientRequestModel" action="newClientPost">
		<div>
			<label for="name">Name</label>
			<form:input path="name" type="text" id="name" placeholder="Name" />
			<form:errors path="name" />
		</div>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>