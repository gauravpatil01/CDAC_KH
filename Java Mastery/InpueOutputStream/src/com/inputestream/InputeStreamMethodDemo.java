package com.inputestream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputeStreamMethodDemo {
	public static void main(String[] args) {
		try {
			InputStream input = new FileInputStream("F:\\eclipse\\CDAC\\InpueOutputStream\\src\\test file");
			// available
			int count = input.available(); // count
			System.out.println("count : " + count);

//		read
			byte[] content = new byte[100];
			input.read(content); // content store from read
//		convert byte to string
			String fileContent = new String(content);
			System.out.println("file content from read method:--> " + fileContent);
//close
			input.close();
			System.out.println("file has been closed ");
		

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();
		}

	}
}
