package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJdbc {
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
			//String sql="CREATE TABLE CUSTOMER" + "(id INTEGER not NULL,"+"Name VARCHAR(255),"+"age INTEGER,"+"Address VARCHAR(255),"+"Salary INTEGER,"+"PRIMARY KEY (id))";

		     //statement.executeUpdate(sql);
		     System.out.println("created successfully..");
			String insert="INSERT INTO CUSTOMER VALUES(1,'Akshit',24,'Delhi',25)";
			String insert1="INSERT INTO CUSTOMER VALUES(2,'Akshay',25,'UP',15)";
			String insert2="INSERT INTO CUSTOMER VALUES(3,'Akshita',22,'UK',35)";
			statement.executeUpdate(insert);
			statement.executeUpdate(insert1);
			statement.executeUpdate(insert2);
			System.out.println("Insert Successfully...");
			}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		}

}
