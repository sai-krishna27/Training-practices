<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= "<h1>Hello from Jsp</h1>" %>
	<h1>Hello from HTML</h1>
	<%
		int n=20;
	%>
	<input type="text" value="<%= n %>">
	
	<% 
		out.println("<h1> Demo of Implicit JSP objects</h1>");
	%>
	<form action="">
		Enter Name : <input type="text" name="fname">
		<input type="submit" name="click" value="click me">
	</form>
	<%
		if(request.getParameter("click")!=null){
			out.print("<h1>Hello "+request.getParameter("fname")+"</h1>");
		}
	%>
	
	<%-- include annotation  --%>
	<%@include file="footer.html" %>
	
</body>
</html>