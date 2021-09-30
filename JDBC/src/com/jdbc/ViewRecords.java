package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewRecords {
	public static void main(String args[]) {
		Connection connection =null;
		String username="sa";
		String password="";
		String jdbcurl="jdbc:h2:~/test";
		String selectsql="";
		try {
			Class.forName("org.h2.Driver");
			connection= DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=connection.createStatement();
			selectsql="Select * from customer";
			ResultSet rs=statement.executeQuery(selectsql);
			while(rs.next()) {
				System.out.println("ID is : "+rs.getInt("id"));
				System.out.println("Nmae is: "+rs.getString("Name"));
				System.out.println("Age is  "+rs.getInt("age"));
				System.out.println("Address is "+rs.getString("Address"));
				System.out.println("Salary is "+rs.getInt("Salary"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
