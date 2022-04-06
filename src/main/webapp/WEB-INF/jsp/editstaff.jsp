<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
<%@include file="/WEB-INF/css/loginstyle.css"%></style>
<h1>Edit Staff Here</h1>
<form:form method="post" modelAttribute="login" action="/Assignment5GrpD/updateStaff">
	<table>
		<tr>
			<td>Username:</td>
			<td><form:input path="username" disabled="disabled" /></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Update" /></td>
		</tr>
	</table>
</form:form>