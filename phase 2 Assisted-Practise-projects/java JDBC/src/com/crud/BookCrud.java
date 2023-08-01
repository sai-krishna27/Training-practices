package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.driver.connector.DBdriver;
import com.table.Book;

public class BookCrud {
	public void insert(Book book) throws ClassNotFoundException, SQLException {
		DBdriver driver=new DBdriver();
		Connection connect=driver.getConnection();
		try{String insert="insert into book values(?,?,?)";
			PreparedStatement ps=connect.prepareStatement(insert);
			ps.setInt(1,book.id);
			ps.setString(2,book.name);
			ps.setInt(3,book.author_id);
			ps.executeUpdate();
			System.out.println("author details inserted successfully");
		}
		catch(Exception e) {
			System.out.println("insersion failed due to author id not present in author table");
		}
		
		
		
	}

	public void read() throws SQLException, ClassNotFoundException {
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="select * from book";
		ResultSet rs=st.executeQuery(query);
		Book book=null;
		while(rs.next()) {
			book=new Book(rs.getInt("book_id"),rs.getString("book_title"),rs.getInt("author_id"));
			System.out.println(book);
			
		}
	}

	public void delete(int id) throws ClassNotFoundException, SQLException {
		
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String delete="delete from book where book_id="+id;
		int res=st.executeUpdate(delete);
		if(res>0) {
			System.out.println("deletion successful");
		}
		else {
			System.out.println("no record deleted");
		}
	}

	
	public void authorOfBookJava() throws ClassNotFoundException, SQLException {
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="select author_name from author,book where author.author_id=book.author_id and book_title='java'";
		ResultSet res=st.executeQuery(query);
		while(res.next()) {
			System.out.println(res.getString("author_name"));
		}
		
	}
}
