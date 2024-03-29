package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileHandlingDemo {

	public static void main(String arg[]) throws FileNotFoundException {

		byte[] array = new byte[100];//

		InputStream in = new FileInputStream("D:/io/abc.txt");

		try {
			in.read(array); // read from file and store in bytes

			// convert bytes arrayh to String
			String data = new String(array);

			System.out.println(data);

		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
