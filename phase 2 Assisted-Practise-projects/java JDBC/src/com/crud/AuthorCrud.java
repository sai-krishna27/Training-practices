package com.crud;
import java.sql.*;

import com.driver.connector.*;
import com.table.*;

public class AuthorCrud {

	public void insert(Author author) throws ClassNotFoundException, SQLException {
		DBdriver driver=new DBdriver();
		Connection connect=driver.getConnection();
		String insert="insert into author values(?,?,?)";
		PreparedStatement ps=connect.prepareStatement(insert);
		ps.setInt(1,author.id);
		ps.setString(2,author.name);
		ps.setString(3,author.email);
		ps.executeUpdate();
		System.out.println("author details inserted successfully");
		
		
		
	}

	public void read() throws SQLException, ClassNotFoundException {
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="select * from author";
		ResultSet rs=st.executeQuery(query);
		Author author=null;
		while(rs.next()) {
			author=new Author(rs.getInt("author_id"),rs.getString("author_name"),rs.getString("author_email"));
			System.out.println(author);
			
		}
	}

	public void update(int id, String name) throws ClassNotFoundException, SQLException {
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="update author set author_email='"+name+"' where author_id="+id;
		st.executeUpdate(query);
		System.out.println("author deatils updated successfully");
		
	}

	public void delete(int id) throws ClassNotFoundException, SQLException {
		
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		try {
			String delete="delete from author where author_id="+id;
			int res=st.executeUpdate(delete);
			if(res>0) {
				System.out.println("deletion successful");
			}
			else {
				System.out.println("no record deleted");
			}
		}
		catch(Exception e) {
			String delete="delete from book where author_id="+id;
			st.executeUpdate(delete);
			st.executeUpdate("delete from author where author_id="+id);
			System.out.println("deleted records in author table and also deleted matching records in book table");
		}
	}
	

}
