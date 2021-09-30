package com.assessment13sep;

import java.util.ArrayList;
import java.util.List;

public class InsertArray {
	public static void main(String args[]) {
		List<String> list=new ArrayList<String>();
		list.add("Samsung");
		list.add("Redmi");
		list.add("Realme");
		System.out.println("list of mobile phone "+list);
		list.add(0, "Apple");
		System.out.println("updated lists "+list);
	}

}
