package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ListFilterWithoutStream{
	public static void main(String args[]) {
		List<Integer> inte=new ArrayList<Integer>();
		inte.add(13);
		inte.add(18);
		inte.add(16);
		inte.add(11);
		inte.add(14);
		System.out.println(inte);
		for(Integer name:inte) {
			if(name>15)
			System.out.println(name);
		}
	}
	
}