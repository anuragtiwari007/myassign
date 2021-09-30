package com.assessment13sep;

import java.util.LinkedList;

public class InsertLinkedList {
	public static void main(String args[]) {
		LinkedList<String> llist1=new LinkedList<String>();
		llist1.add("Anurag");
		llist1.add("Ankit");
		llist1.add("Shubham");
		llist1.add("Abhinav");
		System.out.println("list "+llist1);
		
		//insert at specified position in linked list
		llist1.add(3, "Sachin");
		System.out.println("after insert "+llist1);
		
		llist1.addFirst("Rajan");//insert at fisrt position in linked list
		System.out.println("insert at fisrt "+llist1);
		
		llist1.addLast("Akshit"); //insert at last position in linked list
		System.out.println("insert at last "+llist1);
	}

}
