package com.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamMethod {
	public static void main(String[] args) {
		try {
			String data = "this is a test line from program goes to the output file  .";
			String data1 = "this is another line .";
			OutputStream optput = new FileOutputStream("F:\\eclipse\\CDAC\\InpueOutputStream\\src\\output file");

			// string data convertes to arrays of byte
			byte[] array = data.getBytes();
			// write -one character at time
			optput.write(array);
			array = data1.getBytes();
			optput.write(array);

			System.out.println("content wrtten in file");
			optput.close();

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}

	}
}