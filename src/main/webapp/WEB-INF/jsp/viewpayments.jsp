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
	<h2>Payment Summary</h2>
	<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Customer Id</th>
		<th>Room Charges</th>
		<th>Misc Charges</th>
		<th>Payment Date</th>
	</tr>
	<c:forEach var="book" items="${list}">
		<tr>
			<td>${billing.CustomerId}</td>
			<td>${billing.RoomCharges}</td>
			<td>${billing.MiscCharges}</td>
			<td>${billing.PaymentDate}</td>
		</tr>
	</c:forEach>
</table>
<br />

</body>
</html>
