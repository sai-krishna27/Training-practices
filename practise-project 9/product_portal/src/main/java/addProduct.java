

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addProduct
 */
public class addProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.print("<h1 align='center'>Product Details</h1><table border='1' align='center'><tr><th>id</th><th>name</th><th>type</th><th>manufacturing date</th><tr>");
		out.print("<tr><td>"+request.getParameter("id")+"</td><td>"+request.getParameter("name")+"</td><td>"+request.getParameter("type")+"</td><td>"+request.getParameter("date")+"</td></td>");
		
	}

}
