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
<body>
	<%
		ProductMain pm=new ProductMain();
		pm.deleteProduct(Integer.parseInt(request.getParameter("id")));
		response.sendRedirect("index.jsp");
		
	%>
</body>
</html>