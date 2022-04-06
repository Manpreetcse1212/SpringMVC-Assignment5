<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<h2>Hotel Details</h2>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Hotel Name:</th>
			<th>Zipcode:</th>
			<th>City:</th>
			<th>Phone Number:</th>
		</tr>
		<c:forEach var="book" items="${list}">
			<tr>
				<td>${hotel.HotelName}</td>
				<td>${hotel.Zipcode}</td>
				<td>${hotel.City}</td>
				<td>${hotel.PhoneNumber}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>