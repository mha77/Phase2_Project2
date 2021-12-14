package com.markus.database;

import java.sql.*;

public class Database {
	
	private Connection con = null;
	
	public Database(String url, String user, String pw) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.con = DriverManager.getConnection(url, user, pw);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.con;
	}
	
	public ResultSet query(String query) {
		Statement stmt;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			 rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public void close() {
		try {
			this.con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
