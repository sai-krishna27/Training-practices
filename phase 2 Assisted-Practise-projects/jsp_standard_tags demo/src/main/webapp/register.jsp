<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register your details</h1><br>
	<form action="">
		Enter Name : <input type="text" name="name"><br><br>
		Enter Age : <input type="text" name="age"><br><br>
		Enter Email : <input type="text" name="email"><br><br>
		Enter Password : <input type="text" name="pass"><br><br>
		Select Country : <select name="country">
			<option>India</option>
			<option>Sri Lanka</option>
			<option>Bangladesh</option>
		</select><br><br>
		<input type="submit" value="register" name="register">
	</form>
	<% if(request.getParameter("register")!=null){ %>
		<jsp:useBean id="user" class="com.User" scope="request"></jsp:useBean>
		<jsp:setProperty property="*" name="user"/>
		<jsp:forward page="RegisterServlet"></jsp:forward>
	<%} %>
</body>
</html>