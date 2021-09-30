package com.assessment13sep;

import java.util.LinkedList;

public class AppendElementLinkedList {
	public static void main(String args[]) {
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("Anurag");
		llist.add("Ankit");
		llist.add("Shubham");
		System.out.println("linked list "+llist);
		llist.addLast("Abhishek");
		System.out.println("after append "+llist );
	}

}
