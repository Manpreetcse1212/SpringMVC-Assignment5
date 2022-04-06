<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
<%@include file="/WEB-INF/css/loginstyle.css"%></style>
<h1>Visitor Register Here</h1>
<form:form method="POST" modelAttribute="login" action="saveUser">
	<form:hidden path="usertype" value="visitor"/>
	<table align="center">
		<tr>
			<td>Username:</td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Create" /></td>
		</tr>
	</table>
</form:form>

<h1>Login</h1>
<form:form method="POST" modelAttribute="login" action="loginUser">
	<table align="center">
		<tr>
			<td>Username:</td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td>Select User Type</td>
			<td><form:select path="usertype">
					<form:option value="visitor">Visitor</form:option>
					<form:option value="admin">Admin</form:option>
					<form:option value="staff">Staff</form:option>
				</form:select></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Login" /></td>
		</tr>
	</table>
</form:form>