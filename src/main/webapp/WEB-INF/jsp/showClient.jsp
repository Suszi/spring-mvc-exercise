<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show client</title>
<script type="text/javascript" charset="utf8"
	src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<style>
th, td {
	text-align: left;
}
</style>
<link rel="stylesheet" href="<spring:theme code='css'/>">
</head>
<body>
	<table>
		<tr>
			<th><spring:message code="id" />:</th>
			<td>${showClientModel.id}</td>
		</tr>
		<tr>
			<th><spring:message code="clientName" />:</th>
			<td>${showClientModel.name}</td>
		</tr>
		<tr>
			<td><img src="<c:url value='${showClientModel.pictureUrl}'/>" /></td>
		</tr>
	</table>
	<a href="<c:url value='${showClientModel.backUrl}'/>"><spring:message
			code="back" /></a>
</body>
</html>