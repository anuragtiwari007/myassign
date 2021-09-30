package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String args[]) {
		List<String> fruitlist= new ArrayList<String>();
		fruitlist.add("apple");
		fruitlist.add("pineapple");
		fruitlist.add("orange");
		
		for(String fruitloop:fruitlist) {
			System.out.println("list of fruit  "+fruitloop );
		}
	}

}
