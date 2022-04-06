<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
	<%@include file="/WEB-INF/css/loginstyle.css"%>
</style>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Reservation System</title>

</head>
<body>
	<h1>Hotel Reservation System</h1>
	<c:out value="${list }"></c:out>
	<h2>Booking Details</h2>
	<table border="2" width="70%" cellpadding="2" align="center">
		<tr>
			<th>Reservation Number:</th>
			<th>Customer ID:</th>
			<th>Check IN Date:</th>
			<th>Check OUT Date:</th>
			<th>Status:</th>
			<th>Number of guests:</th>
			<th>Reservation Date:</th>
			<th>Room No.</th>
			<th>Edit</th>
		</tr>

		<c:forEach items="${bookings}" var="res">
			<tr>
				<td>${res.reservationNumber}</td>
				<td>${res.customerId}</td>
				<td>${res.checkinDate}</td>
				<td>${res.checkoutDate}</td>
				<td>${res.status}</td>
				<td>${res.numberofGuests}</td>
				<td>${res.reservationDate}</td>
				<td>${res.roomNumber}</td>
				<td><c:if test="${sessionScope.type ne 'visitor'}">
						<a href="editbooking/${res.reservationNumber}">Edit
							Reservation</a>
					</c:if></td>
			</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>