package com.assessment13sep;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElement {
	public static void main(String args[]) {
		List<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Samsung");
		list1.add("Redmi");
		list1.add("Realme");
		System.out.println("index of phone "+list1.indexOf("Realme"));
		
		
	}
}
