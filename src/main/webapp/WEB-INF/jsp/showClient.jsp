<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
</head>
<body>
	<table>
		<tr>
			<th>Id:</th>
			<td>${showClientModel.id}</td>
		</tr>
		<tr>
			<th>Client name:</th>
			<td>${showClientModel.name}</td>
		</tr>
	</table>
	<a href="<c:url value='${showClientModel.backUrl}'/>">Back</a>
</body>
</html>