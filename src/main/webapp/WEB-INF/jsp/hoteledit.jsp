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
	<form method="post" action="savebooking">
		Hotel Name:<input type="text" name="hotelname"><br /> <br /> 
			Zipcode:<input
			type="text" name="zipcode"><br/><br/>
			City:<input
			type="text" name="city"><br /> <br />
			Phone Number:<input
			type="text" name="phonenumber">
			<input
			type="submit" value="Enter">

	</form>
</body>
</html>