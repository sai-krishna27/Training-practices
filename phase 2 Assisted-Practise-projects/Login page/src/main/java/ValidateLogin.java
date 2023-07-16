import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateLogin
 */
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=null;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		if(pass.equals(user) && !pass.equals("")) {
			out.print("<div align='center'>"
					+ "<h1 style='color:green'>Welcome "+user+"<br></h1>"
					+ "<h1><a href='UserServlet'>Click here</a>"
					+ "to log out from the page</h1></div>");
		}else {
			
			out.println("<center><h3 style='color:red'>Invalid credentials!</h3></center> ");
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
