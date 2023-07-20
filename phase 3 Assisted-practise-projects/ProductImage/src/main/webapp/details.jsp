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
	int i=1;
			%>

			<% for(Product product:products) {%>
				<h1>Product <%=i %></h1><br><br>
				<img src="images/<%=product.getImg_name() %>" height="100px" width="75px"><br><br>
				name : <%= product.getName() %><br><br>
				type : <%= product.getType()%><br><br>
				Manufactured_data : <%= product.getManufacturing_date() %><br><br><hr>
				
			<% i++;} %>
	
	
</body>
</html>