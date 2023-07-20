<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<h1 align="center">Update Product</h1>
	<form action="editProduct" method="post">
		<input type="hidden" name="id" value="<%=request.getParameter("id") %>">
		Enter name : <input type="text" name="name" value="<%=request.getParameter("name") %>"><br><br>
		Enter type : <input type="text" name="type" value="<%=request.getParameter("type") %>"><br><br>
		Enter manufacturing date : <input type="date" name="date" value="<%=request.getParameter("date") %>"><br><br>
		<input type="submit" value="edit product">
		
	</form>
</body>
</html>