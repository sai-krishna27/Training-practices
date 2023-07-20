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
<style>
	td,th,tr { text-align:center}
</style>
<body style="color:green">

	<h2><a href="index.jsp"><--Back</a></h2>
	<h1 align="center">All products details</h1>
	
	<!-- product details -->
	<%
			List<Product> products=(List<Product>)request.getAttribute("products"); 
			%>
			<table border="1" align="center">
			<tr><th>id</th><th>name</th><th>type</th><th>manufacturing date</th><th>Edit Action</th><th>Delete Action</th><tr>

			<% for(Product product:products) {%>
				<tr><td><%=product.getId()%></td><td><%=product.getName()%></td><td><%=product.getType()%></td><td><%=product.getManufacturing_date()%>
						<td>
				<form action="edit.jsp" method="post">
					<input type="hidden" name="id" value="<%=product.getId() %>">
					<input type="hidden" name="name" value="<%=product.getName() %>">
					<input type="hidden" name="type" value="<%=product.getType() %>">
					<input type="hidden" name="date" value="<%=product.getManufacturing_date() %>">
					<input type="submit" value="edit">
				</form></td>
				<td>
				<form action="deleteProduct" method="post">
					<input type="hidden" name="id" value="<%=product.getId() %>">
					<input type="submit" value="delete">
					
				</form>
				</td></tr>
			<% } %>
	
	
</body>
</html>