package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
    	if(session!=null) {
    		User u=(User)session.getAttribute("user");
    		u.setContact(Long.parseLong((request.getParameter("u_pno"))));
        	u.setCity(request.getParameter("u_city"));
        	session.setAttribute("user", u);
        	PrintWriter out=response.getWriter();
        	out.println("<h2>hello "+u.getEmail()+"</h2>");
        	out.println("<br><h3>your details are ... "+u+"</h3>");
        	out.println("<br>session id is "+session.getId());
        	out.println("<br>session is created on "+session.getCreationTime());
        	
        	session.invalidate();
        	//killing the session
    	}
	}

}
