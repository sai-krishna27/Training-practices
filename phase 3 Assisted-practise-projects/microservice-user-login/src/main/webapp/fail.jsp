<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		User not found or invalid credentials!<br> register first<br>
		<h1>Register</h1>
		<form action="register" method="post">
		Enter username : <input type="text" name="name" required><br><br>
		Enter email : <input type="email" name="email" required><br><br>
		Enter password : <input type="password" name="password" required><br><br>
		<input type="submit" value="register">
	</form>
	</div>
</body>
</html>