<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="validate.js"></script>
</head>
<body>
	<h1>Registration</h1>
	<form name="register">
		Name<input type="text" name="name"><br>
		<div id="name" style="color:red"></div>
		Email<input type="email" name="email"><br>
		<div id="email" style="color:red"></div>
		Password<input type="password" name="password"><br>
		<div id="password" style="color:red"></div>
		<input type="button" value="register" onclick="validateRegister()"> 
	</form>
</body>
</html>
