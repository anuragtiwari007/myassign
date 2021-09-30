package com.assessment13sep;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String args[]) {
		HashSet<String> str=new HashSet<String>();
		str.add("Anu");
		str.add("raja");
		str.add("rani");
		str.add("ankit");
		System.out.println("hashset "+str);
		String[] newarr= new String[str.size()];
		str.toArray(newarr);
		
		System.out.println("newarrray: ");
		for(String element:newarr) {
			System.out.println(element);
		}
	}

}
