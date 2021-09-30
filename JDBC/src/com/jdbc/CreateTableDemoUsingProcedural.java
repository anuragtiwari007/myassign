package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemoUsingProcedural {
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
		String procedurevar="CREATE PROCEDURE CUST ," +
		         "BEGIN ,"+
		         " SELECT * FROM CUST1 ,"+
		         "END";
		 //statement.executeUpdate(sql);//this one
         
         
         statement.execute(procedurevar);//this one
         
         
         System.out.println("done...");
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}

}
}