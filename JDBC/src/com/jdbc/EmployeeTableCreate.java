package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeTableCreate {
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
			
			
			String sql="CREATE TABLE dept"+"(deptno INTEGER,"+"dname VARCHAR(255),"+"loc VARCHAR(255),"+"constraint pk_dept primary key (deptno))";
			String sql1="CREATE TABLE emp"+ "(empno INTEGER,"+"ename varchar(255),"+ "job varchar(255),"+"mgr INTEGER,"
			+"hiredate date,"+"sal INTEGER,"+"comm INTEGER,"+"deptno INTEGER,"+"constraint pk_emp primary key (empno),"
					+"constraint fk_deptno foreign key (deptno) references dept (deptno))";
			statement.executeUpdate(sql1);
			System.out.println("employee table created successfully");
			
			
	}
		catch(Exception e) {
		e.printStackTrace();	
		}

}
}