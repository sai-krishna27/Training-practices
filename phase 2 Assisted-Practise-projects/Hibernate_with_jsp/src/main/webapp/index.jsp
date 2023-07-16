<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.table.*" %>
    <%@ page import="java.text.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="color:green">
	<h1 align="center">
	Add product to database
	<form action="addProduct.jsp">
		<input type="submit" value="add product">
	</form>
	
	<!-- product details -->
	<%
			ProductMain pm=new ProductMain();
			List<Product> products=pm.getProducts(); 
			%>
			<h1 align="center">Product Details</h1>
			<table border="1" align="center">
			<tr><th>id</th><th>name</th><th>type</th><th>manufacturing date</th><th>Edit Action</th><th>Delete Action</th><tr>

			<% for(Product product:products) {%>
				<tr><td><%=product.getId()%></td><td><%=product.getName()%></td><td><%=product.getType()%></td><td><%=product.getManufacturing_date()%>
						<td><a href="edit.jsp?id=<%=product.getId()%>">Edit Product</a></td><td><a href="delete.jsp?id=<%=product.getId()%>">Delete Product</a></td></tr>
			<% } %>
	
	</h1>
</body>
</html>