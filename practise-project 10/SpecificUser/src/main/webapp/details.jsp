<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.table.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<%
		List<User> u=(List<User>)request.getAttribute("user");
	%>
	<div align="center">
	<h1>Update user details</h1>
	<form action="updateUser">
		<input type="hidden" name="id" value="<%=u.get(0).getId() %>"><br><br>
		User name : <input type="text" name="name" value="<%=u.get(0).getName() %>"><br><br>
		User age :<input type="text" name="age" value="<%=u.get(0).getAge() %>"><br><br>
		User gender : <input type="text" name="gender" value="<%=u.get(0).getGender() %>"><br><br>
		<input type="submit" value="update User">
		
	</form>
	</div>
	
</body>
</html>