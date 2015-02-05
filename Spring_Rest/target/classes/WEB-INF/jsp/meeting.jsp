<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meeting Management</title>
</head>
<body>
<h1>Meetings Data</h1>
<form:form action="meeting.do" method="POST" commandName="meeting">
	<table>
		<tr>
			<td>Meeting ID</td>
			<td><form:input path="id_meeting" /></td>
		</tr>
		<tr>
			<td>Room ID</td>
			<td><form:input path="id_room" /></td>
		</tr>
		<tr>
			<td>Start Time</td>
			<td><form:input path="start_time" /></td>
		</tr>
		<tr>
			<td>End Time</td>
			<td><form:input path="end_time" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>Meeting ID</th>
	<th>Room ID</th>
	<th>Start Time</th>
	<th>End Time</th>
	<c:forEach items="${meetingList}" var="meeting">
		<tr>
			<td>${meeting.id_meeting}</td>
			<td>${meeting.id_room}</td>
			<td>${meeting.start_time}</td>
			<td>${meeting.end_time}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>