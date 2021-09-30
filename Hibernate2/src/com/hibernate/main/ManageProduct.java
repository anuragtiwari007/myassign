package com.hibernate.main;

import java.util.ArrayList;

import java.util.List;
import com.hibernate2.util.*;
import com.hibernate2.service.*;

public class ManageProduct {

	public static void main(String[] args) {

		ProductService productservice = new ProductService();

		
		Integer prodID1=productservice.addProduct(567,"Lenovo", "ideapad",45000);
		Integer prodID2=productservice.addProduct(578, "Lenovo", "Yoga", 65000);
		List<Integer> listinfo = new ArrayList<Integer>();

		listinfo.add(prodID1);
		listinfo.add(prodID2);

		if (listinfo.size() != 0) {
			System.out.println("*************************************Inserted******************************");
		} else {
			System.out.println("##############not Inserted########################");

		}

		/* list product records in database */
		try {
			productservice.ListAllProduct();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update employee records in database */
	//	try {
	//	prodiuctservice.updateEmployeeDetails(3, 555);
	//	productservice.updateProductDetails(1, 5000);
		//} catch (Exception e) {

		//	e.printStackTrace();
		//}
		
		/* delete employee records in database by id */
		/*try {
		employeeService.deleteEmployeeDetailsById(2, 555);
		} catch (Exception e) {

			e.printStackTrace();
		}*/
	}

}