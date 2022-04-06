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
	<form method="post" action="savebooking">
		Guest Name:<input type="text" name="guestname"><br /> <br />
		<label for="story">Description:</label>
		<textarea id="description" name="desc" rows="2" cols="50">
</textarea>
		<br /> <br /> <label for="start">Booking Date:</label> <input
			type="date" id="start" name="start"><br /> <br /> Duration:<input
			type="text" name="duration"><br /> <br /> Room Type:<input
			type="radio" name="tp" value="regular" checked><label
			for="regular"></label> <input type="radio" name="tp1" value="premium"><label
			for="premium"></label><br /> <br /> Room No:<input type="text"
			name="roomnumber"><br /> <br /> Total No of Guests:<input
			type="text" name="totalguest"><br /> <br /> <input
			type="submit" value="Enter">

	</form>
</body>
</html>