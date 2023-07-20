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
	<h1>Enter Product details</h1>
	<form action="">
		Enter product id : <input type="number" name="id" required><br><br>
		Enter product name : <input type="text" name="name" required><br><br>
		Enter product type : <input type="text" name="type" required><br><br>
		Enter product manufacturing date : <input type="date" name="date" required><br><br>
		<input type="submit" value="add product" name="add">
	</form>
	</div>
	<%
		if(request.getParameter("add")!=null){
			ProductMain pm=new ProductMain();
			Product product=new Product();
			product.setId(Integer.parseInt(request.getParameter("id")));
			product.setName(request.getParameter("name"));
			product.setType(request.getParameter("type"));
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date=sdf.parse(request.getParameter("date"));
				product.setManufacturing_date(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(pm.addProduct(product)>0) {
				response.sendRedirect("index.jsp");
			}
		}
	%>
	
</body>
</html>