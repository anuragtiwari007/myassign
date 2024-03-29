package com.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManageEmployee {

	public static void main(String args[])throws IOException {
		
		//Variables
		Integer empNo;
		String name;
		Integer age;
		String location;
		
		//List of employee
		List<Employee> listOfEmployee=new ArrayList<Employee>();
		
		//Taking input from user
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter employee 5 records:");
		for(int i=1;i<=3;i++) {
			System.out.println("Enter "+i+" employee detils :");
			System.out.print("Enter employee no. : ");
			empNo=Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter employee name : ");
			name=bufferedReader.readLine();
			System.out.print("Enter employee age : ");
			age=Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter employee location : ");
			location=bufferedReader.readLine();
			listOfEmployee.add(new Employee(empNo, name, age, location));
			
		}
		//filttering record using condition from list
		System.out.println("The details of employee whose location is pune ");
		List<Employee> puneEmployee=
				listOfEmployee.stream()
				.filter(EmployeeLocation-> EmployeeLocation.getLocation().equalsIgnoreCase("Pune"))
				.toList();
	    
		//Traversing listOfEmployee
		Iterator<Employee> iterator=puneEmployee.iterator();
		while(iterator.hasNext()) {
			Employee employee=iterator.next();
			System.out.println(employee.getEmpNo()+" "+employee.getName()+" "+employee.getAge()+" "+employee.getLocation());
		}
	}
}