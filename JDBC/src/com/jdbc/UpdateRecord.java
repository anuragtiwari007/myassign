package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String args[]) {
		Connection connection=null;
		String username="sa";
		String password="";
		String jdbcurl="jdbc:h2:~/test";
		String selectsql="";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=connection.createStatement();
			String sql="UPDATE CUSTOMER SET Name='Anurag'" +"WHERE id=3;";
			statement.executeUpdate(sql);
			System.out.println("record updated successfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
