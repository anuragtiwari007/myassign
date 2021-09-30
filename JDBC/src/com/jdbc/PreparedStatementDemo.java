package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {
	public static void main(String args[]) throws Exception {
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		PreparedStatement ps=con.prepareStatement("insert into emp13 values(?,?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("enter id: ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter name ");
			String name=br.readLine();
			System.out.println("enter age ");
			int age=Integer.parseInt(br.readLine());
			System.out.println("enter salary ");
			float sal=Float.parseFloat(br.readLine());
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setFloat(4, sal);
			int i=ps.executeUpdate();
			System.out.println(i+"record affected");
			System.out.println("Do you want to continue: y/n");
			String s=br.readLine();
			if(s.startsWith("n")) {
				break;
			}
				
		}while(true);
		con.close();
	}

}
