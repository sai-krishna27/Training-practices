package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckPolindrome
 */
public class CheckPolindrome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckPolindrome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String str=(request.getParameter("text")).trim();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+""+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str) && !str.equals("")) {
			out.print(str+" is a palindrome");
		}
		else {
			out.print("'"+str+"' is not a palindrome");
		}
	}

}
