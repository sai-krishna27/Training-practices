<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi Mphasis Learners </h1>
	<%!
	int counter=0;
	int getusers(){
		return ++counter;
	}
	%>

<%out.println("no of vistors on this page"+getusers()); %>
<%="no of vistors on this page"+getusers() %>
	
</body>
</html>