package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAllList {
	public static void main(String args[]) {
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("cow");
		arr1.add("goat");
		arr1.add("Bufffalo");
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("lion");
		arr2.add("dog");
		arr1.addAll(arr2);
		Iterator itra=arr1.iterator();
		while(itra.hasNext()) {
			System.out.println("list of animals "+itra.next());
		}
	}
	

}
