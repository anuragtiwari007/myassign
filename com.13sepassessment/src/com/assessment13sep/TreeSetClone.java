package com.assessment13sep;

import java.util.TreeSet;

public class TreeSetClone {
	public static void main(String args[]) {
		TreeSet<String> color= new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Black");
		color.add("Green");
		System.out.println("color "+color);
		TreeSet<String> color1= new TreeSet<String>();
		color1 = (TreeSet<String>) color.clone();
		
		System.out.println("cloned tree list "+color1);
		
}
}