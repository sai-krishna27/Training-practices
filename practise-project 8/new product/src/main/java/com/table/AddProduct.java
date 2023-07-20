package com.table;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.util.*;

/**
 * Servlet implementation class AddProduct
 */
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductMain pm=new ProductMain();
		Product product=new Product();
		product.setId(Integer.parseInt(request.getParameter("id")));
		product.setName(request.getParameter("name"));
		product.setType(request.getParameter("type"));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date=sdf.parse(request.getParameter("date"));
			product.setManufacturing_date(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(pm.addProduct(product)>0) {
			response.sendRedirect("details.html");
		}
	}

}
