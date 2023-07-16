import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductMain {

	public ArrayList<Product> getProducts(int id) throws ClassNotFoundException, SQLException {
		DBconnector connector=new DBconnector();
		Connection connect=connector.getConn();
		String query="select * from product where p_id=?";
		PreparedStatement ps=connect.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		ArrayList<Product> products=new ArrayList<>();
		Product p=new Product();
		while(rs.next()) {
			p.setP_id(rs.getInt("p_id"));
			p.setP_name(rs.getString("p_name"));
			p.setP_type(rs.getString("p_type"));
			p.setP_date(rs.getDate("p_manufacturing_date"));
			products.add(p);
		}
		return products;
	}

}
