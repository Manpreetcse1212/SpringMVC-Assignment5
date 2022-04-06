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
	<h2>Extra Services</h2>
	<form method="post" action="services">
		Reservation Number:<input type="text" name="reservationnumber"><br />
		<br /> Service availed:<input type="radio" name="tp" value="Wifi" checked><label
			for="wifi"></label> <input type="radio" name="tp1"
			value="pick and drop"><label for="pick and drop"></label><br />
		<br /> <input type="submit" value="Enter">

	</form>
</body>
</html>