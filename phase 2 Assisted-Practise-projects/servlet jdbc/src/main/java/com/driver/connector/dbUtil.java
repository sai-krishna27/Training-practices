package com.driver.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {
	public static final String DRIVER_NAME="com.mysql.jdbc.Driver";
	public static final String URL_NAME="jdbc:mysql://localhost:3306/new";
	public static final String USER_NAME="root";
	public static final String PASS_WORD="9014803544";
	
	public static Connection getConn() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_NAME);
		Connection cn=DriverManager.getConnection(URL_NAME,USER_NAME,PASS_WORD);
		return cn;
	}
}