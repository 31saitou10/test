package com.internousdev.miamiburger.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	private String user ="root";
	private String url="jdbc:mysql://localhost/miamiburger";
	private String password="mysql";
	private String driverName="com.mysql.jdbc.Driver";

	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return con;
	}
}
