package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {
	public static void main(String args[]) {
		Stream.of(10,20,30,40).reduce((x,y)->x+y).ifPresent(System.out::println);
		Stream.of("Anurag","Akshita","Ashish","Akshay").reduce((x,y)->x+","+y).ifPresent(System.out::println);
		List<String> words=Arrays.asList("Anurag","Akshita","Ashish","Akshay");
		Optional<String> longestString=words.stream().reduce((x, y)->x.length()>y.length()?x:y);
		longestString.ifPresent(System.out::println);
	}

}
