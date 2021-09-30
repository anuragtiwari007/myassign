package com.assessment13sep;

import java.util.LinkedList;
import java.util.Iterator;
public class IterateLinkedList {
	public static void main(String args[]) {
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("Anurag");
		llist.add("Ankit");
		llist.add("Shubham");
		llist.add("Abhinav");
		System.out.println("list "+llist);
		
		//iterate linked list
		Iterator itr1=llist.listIterator();
		//System.out.println("list"+itr1);
		while(itr1.hasNext()) {
		System.out.println(itr1.next());
		}
		
		//iterate linked list at specified position
		Iterator itr2=llist.listIterator(1);
		//System.out.println("list"+itr1);
		while(itr2.hasNext()) {
		System.out.println(itr2.next());
		}
		
		//iterate linked list in reverse order
		Iterator itr3=llist.descendingIterator();
		while(itr3.hasNext()) {
			System.out.println("reverse list "+itr3.next());
		}
	}
}
