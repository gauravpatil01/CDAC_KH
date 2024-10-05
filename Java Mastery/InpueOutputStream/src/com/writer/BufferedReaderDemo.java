package com.writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("F:\\eclipse\\CDAC\\InpueOutputStream\\src\\output file"));
//	String data =br.readLine();
//	System.out.println("First line : "+data);
		String data = "";
		while ((data = br.readLine()) != null) {
//		data =br.readLine();
			System.out.println(data);

		}

	}
}
