package com.assessment13sep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAndRemoveArray {
	public static void main(String args[]) {
	List<Integer> arraylist1=new ArrayList<Integer>();
		arraylist1.add(5);
		arraylist1.add(1);
		arraylist1.add(3);
		arraylist1.add(2);
		System.out.println("array list"+arraylist1);
		Collections.sort(arraylist1);
		System.out.println("sorted list "+arraylist1);
		
		//remove element in array
		arraylist1.remove(3);
		System.out.println("after removing "+arraylist1);
	}

}
