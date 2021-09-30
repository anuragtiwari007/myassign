package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeTableView {
	public static void main(String args[]) {
		Connection connection= null;
		final String username="sa";
		final String password="";
		final String jdbcurl="jdbc:h2:~/test";
		String selectsql1="";
		try {
			Class.forName("org.h2.Driver");
			connection= DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=connection.createStatement();
			selectsql1="select ename,job,sal,hiredate from emp where sal>1000 and sal<2000";
			/*String sql1="CREATE TABLE emp"+ "(empno INTEGER,"+"ename varchar(255),"+ "job varchar(255),"+"mgr INTEGER,"
			+"hiredate date,"+"sal INTEGER,"+"comm INTEGER,"+"deptno INTEGER,"+"constraint pk_emp primary key (empno),"
					+"constraint fk_deptno foreign key (deptno) references dept (deptno))";*/
	
			ResultSet rss=statement.executeQuery(selectsql1);
			while(rss.next()) {
				
				/*System.out.println("deptno is "+rss.getInt("deptno"));
				System.out.println("deptname is "+rss.getString("dname"));
				System.out.println("location is "+rss.getString("loc"));*/
				
				//System.out.println("empno "+rss.getInt("empno"));
				System.out.println("ename "+rss.getString("ename"));
				System.out.println("job "+rss.getString("job"));
				//System.out.println("mgr "+rss.getInt("mgr"));
				System.out.println("hiredate "+rss.getString("hiredate"));
				System.out.println("sal "+rss.getInt("sal"));
				//System.out.println("comm "+rss.getInt("comm"));
				//System.out.println("deptno "+rss.getInt("deptno"));
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}