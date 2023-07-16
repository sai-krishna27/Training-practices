package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDispatcher
 */
@WebServlet("/LoginDispatcher")
public class LoginDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		String name=request.getParameter("u_name");
		String pass=request.getParameter("u_pass");
		PrintWriter out=response.getWriter();
		
		//login successful
		if(name.equalsIgnoreCase("sai") && pass.equals("krishna")) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		
		//login fails - display again login pass with a message
		else {
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.println("<center><h1 style='color:red'>Invalid credentials!</h1></center> ");
		}
	}

}
