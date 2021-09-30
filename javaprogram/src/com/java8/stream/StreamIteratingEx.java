package com.java8.stream;

import java.util.stream.Stream;

public class StreamIteratingEx {
	public static void main(String args[]) {
		Stream.iterate(1, n->n+1).filter(x->x%2==0).limit(10).forEach(x->System.out.println(x));
	}

}
