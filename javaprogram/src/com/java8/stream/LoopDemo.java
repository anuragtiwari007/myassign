package com.java8.stream;

import java.util.stream.Stream;

public class LoopDemo {
	public static void main(String args[]) {
		Stream.iterate(1,p->p+1).filter(p->p%19==0).limit(10).forEach(System.out::println);
	}

}
