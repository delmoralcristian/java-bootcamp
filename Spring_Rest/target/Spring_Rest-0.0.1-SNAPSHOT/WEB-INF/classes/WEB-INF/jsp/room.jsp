<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Management</title>
</head>
<body>
<h1>Rooms Data</h1>
<form:form action="room.do" method="POST" commandName="room">
	<table>
		<tr>
			<td>Room ID</td>
			<td><form:input path="id_room" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Capacity</td>
			<td><form:input path="capacity" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="add" />
				<input type="submit" name="action" value="edit" />
				<input type="submit" name="action" value="delete" />
				<input type="submit" name="action" value="search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>Room ID</th>
	<th>Name</th>
	<th>Capacity</th>
	<c:forEach items="${roomList}" var="room">
		<tr>
			<td>${room.id_room}</td>
			<td>${room.name}</td>
			<td>${room.capacity}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>