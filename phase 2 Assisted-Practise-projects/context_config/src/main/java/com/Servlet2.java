package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config=getServletConfig();
		PrintWriter out=response.getWriter();
		out.println("<h1>Accessing config data<br></h1>");
		out.println("sql = "+config.getInitParameter("sql"));
		out.println("<br>Message = "+config.getInitParameter("message"));
		
		out.print("<br><hr>");
		out.println("<h1>Accessing context data<br></h1>");
		ServletContext context=getServletContext();
		out.println("driver = "+context.getInitParameter("driver"));
		out.println("<br>url = "+context.getInitParameter("url"));
		
	}

}
