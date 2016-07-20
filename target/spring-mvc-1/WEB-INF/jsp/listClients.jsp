<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
<link rel="stylesheet" href="<spring:theme code='css'/>">
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#clientsTable').dataTable();
		})
	</script>
	<h1>
		<spring:message code="listOfClients" />
	</h1>
	<table id="clientsTable">
		<thead>
			<tr>
				<td><spring:message code="id" /></td>
				<td><spring:message code="name" /></td>
				<td><spring:message code="url" /></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="client" items="${listClientsModel.clients}">
				<tr>
					<td>${client.id}</td>
					<td>${client.name}</td>
					<td><a href="<c:url value='${client.viewUrl}' />"><spring:message
								code="show" /></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="<c:url value='${listClientsModel.newClientUrl}'/>"><spring:message code="createNewClient" /></a>
</body>
</html>