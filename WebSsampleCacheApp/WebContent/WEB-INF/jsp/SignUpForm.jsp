
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}
 
.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
 
<body>
    <div align="center">
	<h2>Customer SignUp Form - JSR303 @Valid example</h2>
	
	<form:form method="POST" commandName="getLogins" action="Sample/signupts">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>User ID :</td>
				<td><form:input path="eid" /></td>
				<td><form:errors path="eid" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User SSN :</td>
				<td><form:input path="ssn" /></td>
				<td><form:errors path="ssn" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
 </div>
</body>
</html>