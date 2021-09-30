package com.hibernate1;

import java.util.ArrayList;
import java.util.List;
import com.hibernate.service.EmployeeService;

public class ManageEmployee {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		/* Add few employee records in database */
		Integer empID1 = employeeService.addEmployee("Shivam", "kumar1", 81000);// asssinged values from here
		Integer empID2 = employeeService.addEmployee("Kshitij", "kumar", 960000);// asssinged values from here

		List<Integer> listinfo = new ArrayList<Integer>();

		listinfo.add(empID1);
		listinfo.add(empID2);

		if (listinfo.size() != 0) {
			System.out.println("*************************************Inserted******************************");
		} else {
			System.out.println("##############not Inserted########################");

		}

		/* list employee records in database */
		try {
			employeeService.ListAllEmployee();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update employee records in database */
	//	try {
		//employeeService.updateEmployeeDetails(3, 555);
		//} catch (Exception e) {

			//e.printStackTrace();
		//}
		
		/* delete employee records in database by id */
		//try {
		//employeeService.deleteEmployeeDetailsById(2, 555);
		//} catch (Exception e) {

			//e.printStackTrace();
		//}
	}

}