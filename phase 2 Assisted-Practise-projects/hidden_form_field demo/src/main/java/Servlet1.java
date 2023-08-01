

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("userid");
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		//pw is not only taken for a output based object but also we can write a HTML as an output over here 
		pw.print("<HTML><body><form action='Servlet2'>"
				+ "<input type='hidden' name='user' value='"+user+"'>"
						+ "<input type='submit'>"
				+ "</form></body></HTML>");
	}

}


