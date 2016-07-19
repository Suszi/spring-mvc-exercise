<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Clients</title>
<link rel="stylesheet"
	href="//cdn.datatables.net/1.10.0/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8"
	src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="//cdn.datatables.net/1.10.0/js/jquery.dataTables.js"></script>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#clientsTable').dataTable();
		})
	</script>
	<h1>List of clients</h1>
	<table id="clientsTable">
		<thead>
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>URL</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="client" items="${listClientsModel.clients}">
				<tr>
					<td>${client.id}</td>
					<td>${client.name}</td>
					<td><a href="<c:url value='${client.viewUrl}' />">Show</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='${listClientsModel.newClientUrl}'/>">Create
		new client</a>
</body>
</html>