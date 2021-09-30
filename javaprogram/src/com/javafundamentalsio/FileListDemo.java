package com.javafundamentalsio;

import java.io.File;

public class FileListDemo {
	public static void main(String args[]) {
		File file=new File("D:/io/");
		String[] fileList=file.list();
		for(String name:fileList) {
			System.out.println(name);
		}
	}

}
