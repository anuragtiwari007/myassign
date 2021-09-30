package com.constructor;

public class parametrizedconstructor {
	String languages;

	  // constructor accepting single value
	parametrizedconstructor(String lang) {
	    languages = lang;
	    
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		  parametrizedconstructor obj1 = new parametrizedconstructor("c#");
		  parametrizedconstructor obj2 = new parametrizedconstructor("java");
		  parametrizedconstructor obj3 = new parametrizedconstructor("rust");
	  }
	  }