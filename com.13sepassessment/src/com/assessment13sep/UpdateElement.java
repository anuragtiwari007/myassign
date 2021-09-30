package com.assessment13sep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpdateElement {
	public static void main(String args[]) {
		List<String> list2=new ArrayList<String>();
		list2.add("Apple");
		list2.add("Samsung");
		list2.add("Redmi");
		list2.add("Realme");
		System.out.println("list "+list2);
		list2.set(3, "oneplus");
		System.out.println("updated list "+list2);
		
		//serach an element in array list
		boolean arr=list2.contains("realme");
		if(arr) {
			System.out.println("contain");
		}
		else {
			System.out.println("not contain");
			
		}
		
		//reverse element
		Collections.reverse(list2);
		System.out.println("reverse list "+list2);
	}
	
}
