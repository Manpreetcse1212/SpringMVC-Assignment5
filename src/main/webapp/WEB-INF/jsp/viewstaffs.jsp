<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Details</title>
<style>
<%@include file="/WEB-INF/css/loginstyle.css"%></style>
</head>
<body>
<h1>Staff Details</h1>
	<table align="center">
		<c:forEach items="${staffs}" var="staff">
			<tr>
				<td>${staff.username}</td>
				<td>${staff.password}</td>
				<td>${staff.usertype}</td>
				<td><a href="editStaffShow/${staff.username}">Edit</a></td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>