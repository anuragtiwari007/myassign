package com.javafundamentalsio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadByLineAndStore {
	public static void main(String args[]) throws IOException {
		FileReader nam=new FileReader("D:/io/abc.txt");
		BufferedReader nam1=new BufferedReader(nam);
		
		String n="";
		String n1="";
		while(n!=null) {
			if(n==null) 
				break;
				n1+=n;
				n=nam1.readLine();
			}
			System.out.println("store value "+n1);
			nam1.close();
		}
		
		
	}


