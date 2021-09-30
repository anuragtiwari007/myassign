package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

class Employee{
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	int id;
	String name;
	float salary;
}

public class ListFilterWithoutStream1 {
	public static void main(String rags[]) {
		List<Employee> employeelist=new ArrayList<Employee>();
		employeelist.add(new Employee(101,"Anurag",35000f));
		employeelist.add(new Employee(102,"Anu",65000f));
		employeelist.add(new Employee(103,"Anur",45000f));
		employeelist.add(new Employee(104,"Anura",55000f));
		employeelist.add(new Employee(105,"An",25000f));
		
		List<Float>  employeeList=new ArrayList<Float>();
		for(Employee emp: employeelist) {
			
			//filtering data of list
			if(emp.salary>45000) {
				
				employeeList.add(emp.salary);
			}
		}
		System.out.println(employeeList);
		}
	}

