

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadProduct
 */
public class ReadProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductMain productDAO=new ProductMain();
		int id=Integer.parseInt(request.getParameter("id"));
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		try {
			ArrayList<Product> products=productDAO.getProducts(id);
			if(products.size()>0) {
				out.print("<html><body style='color:green'><center><h1><i>Product Details</i></h1></center>");
				out.print("<table border='1' align='center'>"
						+ "<tr><th>Studentid</th><th>Studentname</th><th>Studentemail</th><th>Product manufacturing date</th></tr>");
				for(Product product:products) {
					out.print("<tr><td>"+product.getP_id()+"</td><td>"+product.getP_name()+"</td><td>"+product.p_type+"</td><td>"+product.getP_date());
				}
				out.print("</table></body></html>");
			}
			else{
				out.print("<h3 align='center' style='color:red'>No data found</h3>");
				rd.include(request, response);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
