<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.sample.demo.*" %>
    <%@ page import="java.text.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center" style="color:green">
	<h1>Enter Product details</h1>
	<form action="addProduct" method="post" enctype="multipart/form-data">
		Enter product name : <input type="text" name="name" required><br><br>
		Enter product type : <input type="text" name="type" required><br><br>
		Enter product manufacturing date : <input type="date" name="date" required><br><br>
		Upload Image : <input type="file" name="image"><br><br>
		<input type="submit" value="add product" name="add">
	</form>
	</div>

</body>
</html>