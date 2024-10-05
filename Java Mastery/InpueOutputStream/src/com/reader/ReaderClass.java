package com.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderClass {
public static void main(String[] args) throws IOException {
	Reader fileReader = new FileReader("F:\\eclipse\\CDAC\\InpueOutputStream\\src\\output file");
	char[]array =new char[100];
	System.out.println("ready ?"+fileReader.ready());
	fileReader.read(array);
	
	System.out.println("file content  : " +String.valueOf(array));
	
	fileReader.close();
	
}
}
