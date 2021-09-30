package com.lambda;

public class WithLambda {
	public static void main(String args[]) {
		int radius=8;
		
		Circle circle=()->{
			System.out.println("Drawing : "+radius);
		};
		circle.draw();
	}

}