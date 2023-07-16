package com.table;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowDetails
 */
public class ShowDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDetails() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductMain pm=new ProductMain();
		PrintWriter out=response.getWriter();
		List<Product> products=pm.getProducts();
		out.print("<html><body style='color:green'><center><h1><i>Product Details</i></h1></center>");
		out.print("<table border='1' align='center'>"
				+ "<tr><th>Product id</th><th>Product name</th><th>Product type</th><th>Product manufacturing date</th></tr>");
		for(Product product:products) {
			out.print("<tr><td>"+product.getId()+"</td><td>"+product.getName()+"</td><td>"+product.getType()+"</td><td>"+product.getManufacturing_date());
		}
		out.print("</table></body></html>");
	}

}
