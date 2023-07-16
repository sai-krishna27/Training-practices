package com.daoCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dbConnector.DBUtil;
import com.pojo.Product;

public class ProductCrudImpl implements ProductCrudInterface {
	static DBUtil dbUtil=new DBUtil();
	@Override
	public int addProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection con=dbUtil.getConn();
		if(con==null) {
			System.out.println("connection failed");
		}
		else {
			System.out.println("connection is successfully established ....!!!");
		}
		
		//preparing an sql statement
		
		String sql="insert into product values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,product.getPid());
		ps.setString(2, product.getPname());
		ps.setInt(3, product.getCost());
		int rows=ps.executeUpdate();
		return rows;
	}

	@Override
	public int deleteProduct(int id) throws ClassNotFoundException, SQLException {
		Connection con=dbUtil.getConn();
		if(con==null) {
			System.out.println("connection failed");
		}
		else {
			System.out.println("connection is successfully established ....!!!");
		}
		Statement st=con.createStatement();
		
		String sql="delete from product where pid="+id;
		System.out.println(sql);
		//insert, update ,delete -->return int 
		int rows=st.executeUpdate(sql);
		return rows;
	}

	@Override
	public List<Product> selectProducts() throws ClassNotFoundException, SQLException {
		Connection con=dbUtil.getConn();
		if(con==null) {
			System.out.println("connection failed");
		}
		else {
			System.out.println("connection is successfully established ....!!!");
		}
		Statement st=con.createStatement();
		String sql="select * from product";
		//table address is stored in rs obj
		ResultSet rs=st.executeQuery(sql);
		List<Product> list=new ArrayList<Product>();
		//row 1
		while(rs.next()) {
			Product product=new Product();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			product.setCost(rs.getInt("cost"));
			list.add(product);
		}
		return list;
		
	}

	@Override
	public int updateProductName(int id,String name) throws ClassNotFoundException, SQLException {
		Connection con=dbUtil.getConn();
		if(con==null) {
			System.out.println("connection failed");
		}
		else {
			System.out.println("connection is successfully established ....!!!");
		}
		Statement st=con.createStatement();
		
		String sql="update product set pname='"+name+"' where pid="+id;
		System.out.println(sql);
		//insert, update ,delete -->return int 
		int rows=st.executeUpdate(sql);
		return rows;
	}

}
