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
	<div align="center" style="color:green">
	
		<h1>Edit product records</h1><br><br>
		<h1>Edit product name</h1>
		
		<form action="">
			<input type="hidden" name="pid" value="<%=request.getParameter("id")%>">
			Enter new Product name : <input type="text" name="pname"><br><br>
			<input type="submit" name="updateName" value="update name">
		</form>
		<%
			if(request.getParameter("updateName")!=null){
				ProductMain pm=new ProductMain();
				pm.updateName(request.getParameter("pid"),request.getParameter("pname"));
				response.sendRedirect("index.jsp");
			}
		%> 
		<hr>
		<h1>Edit product type</h1>
		<form action="">
			<input type="hidden" name="pid" value="<%=request.getParameter("id")%>">
			Enter new Product type : <input type="text" name="ptype"><br><br>
			<input type="submit" name="updateType" value="update type">
		</form>
		<%
			if(request.getParameter("updateType")!=null){
				ProductMain pm=new ProductMain();
				pm.updateType(request.getParameter("pid"),request.getParameter("ptype"));
				response.sendRedirect("index.jsp");
			}
		%> 
		<hr>
		<h1>Edit product manufacturing date</h1>
		<form action="">
			<input type="hidden" name="pid" value="<%=request.getParameter("id")%>">
			Enter new Product name : <input type="date" name="mDate"><br><br>
			<input type="submit" name="updateDate" value="update date">
		</form>
		<%
			if(request.getParameter("updateDate")!=null){
				ProductMain pm=new ProductMain();
				pm.updateDate(request.getParameter("pid"),request.getParameter("mDate"));
				response.sendRedirect("index.jsp");
			}
		%> 
		
	</div>
</body>
</html>