package com.crud;
import com.driver.connector.*;
import java.sql.*;
import java.util.*;
import com.table.*;

public class PlantCrudImpl implements PlantCrudInterface {

	public int insert(Plant plant) throws ClassNotFoundException, SQLException {
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="insert into plant values("+plant.id+",'"+plant.name+"','"+plant.fruitColor+"')";
		return st.executeUpdate(query);
		
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="delete from plant where p_id="+id;
		return st.executeUpdate(query);
	}

	@Override
	public int update(int id, String name) throws ClassNotFoundException, SQLException {
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="update plant set p_name='"+name+"' where p_id="+id;
		return st.executeUpdate(query);
	}

	@Override
	public int read() throws SQLException, ClassNotFoundException {
		DBdriver driver=new DBdriver();
		Connection cn=driver.getConnection();
		Statement st=cn.createStatement();
		String query="select * from plant";
		ResultSet rs=st.executeQuery(query);
		Plant plant=null;
		while(rs.next()) {
			plant=new Plant(rs.getInt("p_id"),rs.getString("p_name"),rs.getString("fruit_color"));
			System.out.println(plant);
			
		}
		return 0;
	}

	
}
