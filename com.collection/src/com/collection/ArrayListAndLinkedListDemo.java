package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class ArrayListAndLinkedListDemo {
	public static void main(String args[]) {
		ArrayList<String> arrlist1=new ArrayList<String>();
		arrlist1.add("Anurag");
		arrlist1.add("Rajan");
		arrlist1.add("Shivam");
		
		LinkedList<String> arrlist2=new LinkedList<String>();
		arrlist2.add("Anu");
		arrlist2.add("Raja");
		arrlist2.add("Shiva");
		arrlist1.addAll(arrlist2);
		Iterator itr2=arrlist1.iterator();
		while(itr2.hasNext()) {
			System.out.println("list is "+itr2.next());
		}
	}

}
