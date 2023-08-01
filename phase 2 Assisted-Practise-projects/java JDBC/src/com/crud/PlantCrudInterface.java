package com.crud;
import com.table.*;
import java.sql.SQLException;

public interface PlantCrudInterface {
	public int insert(Plant plant) throws ClassNotFoundException, SQLException;
	public int delete(int id) throws ClassNotFoundException, SQLException;
	public int update(int id,String name) throws ClassNotFoundException, SQLException;
	public int read() throws ClassNotFoundException, SQLException;
}
