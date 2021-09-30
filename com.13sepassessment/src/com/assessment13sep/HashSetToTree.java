package com.assessment13sep;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTree {
	public static void main(String args[]) {
		HashSet<String> str=new HashSet<String>();
		str.add("Anu");
		str.add("raja");
		str.add("rani");
		str.add("ankit");
		System.out.println("hashset "+str);
		Set<String> str1=new TreeSet<String>(str);
		System.out.println("tree:");
		for(String element:str1) {
			System.out.println(element);
		}

}
}