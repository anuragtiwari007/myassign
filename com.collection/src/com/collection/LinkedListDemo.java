package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String> linklist=new LinkedList<String>();
		linklist.add("Ravi");
		linklist.add("Anurag");
		linklist.add("shivam");
		Iterator itr=linklist.iterator();
		while(itr.hasNext()) {
			System.out.println("list is "+itr.next());
		}
	}
}
