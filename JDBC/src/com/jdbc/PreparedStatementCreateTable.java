package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PreparedStatementCreateTable {
	public static void main(String args[]) {
		Connection connection= null;
		final String username="sa";
		final String password="";
		final String jdbcurl="jdbc:h2:~/test";
		String selectsql="";
		try {
			Class.forName("org.h2.Driver");
			connection= DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=connection.createStatement();
		
			String sql="CREATE TABLE emp13" + "(id INTEGER not NULL,"+"name VARCHAR(255),"+"age INTEGER,"+"sal INTEGER,"+"PRIMARY KEY (id))";
			statement.executeUpdate(sql);
			System.out.println("created...");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
