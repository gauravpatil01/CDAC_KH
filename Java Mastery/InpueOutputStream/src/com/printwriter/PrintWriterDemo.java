package com.printwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("F:\\\\eclipse\\\\CDAC\\\\InpueOutputStream\\\\src\\\\output file");
		pw.println("this is first line in external file .");
		pw.print("hello second line");
		int age =10;
		pw.printf("my age is %d", age);
		System.out.println("file written successfully");
		pw.close();
	}
}
/*
 * printwriter unlike other writers printwriterconverts the primitive data (int
 * float char )into text formate it then writes that formetted data the writer
 * 
 * 
 */