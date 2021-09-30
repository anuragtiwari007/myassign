package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> fruitlist1=new ArrayList<String>();
		fruitlist1.add("apple");
		fruitlist1.add("strawberry");
		fruitlist1.add("blueberry");
		Iterator iterator=fruitlist1.iterator();
		while(iterator.hasNext()) {
			System.out.println("list of fruit "+iterator.next());
		}
	}

}
