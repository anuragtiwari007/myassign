package com.lambda;
interface Circle{
	void draw();
}
public class WithoutLambda {
	public static void main(String args[]) {
		int radius=5;
		Circle circle=new Circle() {
			
			@Override
			public void draw() {
				System.out.println("Drawing "+radius);
			}
		};
		circle.draw();
	}
}