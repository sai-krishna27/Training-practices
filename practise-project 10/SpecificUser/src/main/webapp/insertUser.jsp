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
		<h1>Enter User details</h1><br>
		<form action="addUser" method="post">
		Enter id : <input type="number" name="id"><br><br>
		Enter name : <input type="text" name="name"><br><br>
		Enter age : <input type="number" name="age"><br><br>
		Select Gender : <input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female<br><br> 
		<input type="submit" value="insert User">
		</form>
	</div>
</body>
</html>