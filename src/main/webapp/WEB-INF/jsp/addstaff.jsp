<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Reservation System</title>
<style>
<%@include file="/WEB-INF/css/loginstyle.css"%></style>
</head>
<body>
	<h1>Add Staff</h1>
	<h1>Staff Register Here</h1>
	<form:form method="POST" modelAttribute="login" action="saveStaff">
		<table>
			<tr>
				<td>Username:</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="password" /></td>
			</tr>
			<form:hidden path="usertype" value="staff" />
			<tr>
				<td></td>
				<td><input type="submit" value="Create" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>