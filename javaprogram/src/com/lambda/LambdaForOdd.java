package com.lambda;

interface OddEven{
	boolean checkOddEven(int num);
}
public class LambdaForOdd {

	public static void main(String args[]) {
		
		OddEven oddevennum=(num) ->{
			boolean result=(num%2==0)?false:true;;
			return result;
		};
		
		boolean flag;
		flag=oddevennum.checkOddEven(7);
		System.out.println(flag==false?"Even Number":"Odd Number");
		
	}
}