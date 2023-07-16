package com.dbConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//db Conn - 1. driver 2. url 3. username 4. password 
public class DBUtil {
	public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	
	//by using jdbc driver - connect to mysql which is a local dB server on the port of 3306 which has db1 as dB
	public static final String DB_URL="jdbc:mysql://localhost:3306/db1";
	public static final String USER_NAME="root";
	public static final String PASS_WORD="9014803544";
	
	public Connection getConn() throws ClassNotFoundException, SQLException {
		//register the driver 
		Class.forName(DRIVER_CLASS);
		//connection with the dB
		Connection con=DriverManager.getConnection(DB_URL,USER_NAME,PASS_WORD);
		return con;
	}

}
