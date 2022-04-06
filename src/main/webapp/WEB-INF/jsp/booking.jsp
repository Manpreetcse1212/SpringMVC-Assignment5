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
	<h1>Hotel Reservation System</h1>

	<form:form method="post" action="savebooking">
		CheckinDate:<form:input path="CheckinDate" placeholder="YYYY/MM/dd" />
		<br />
		CheckOUTDate:<form:input path="CheckoutDate" placeholder="YYYY/MM/dd" />
		<br />
		Status:<form:select path="Status">
			<form:option value="false">booked</form:option>
			<form:option value="true">free</form:option>
		</form:select>
		<br />
		No. oF Guests:<form:input path="NumberofGuests" />
		<br />
		Room Number:<form:input path="RoomNumber" />
		<br />
		<input type="submit" value="Reserve">

	</form:form>
	

	</body>
</html>