package com.stringreader;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {
	public static void main(String[] args) throws IOException {
		String data ="this is a test String  : ";
		 StringReader sr =new StringReader(data);
		 for (int i =1;i<=10;i++) {
			 int x =sr.read();
			 System.out.print((char) x +", ");
		 }
	}
}
/*
 * 
 * String reader java.io package use to read data in characters from Strings
 * //create string reader
 * 
 * StringReader input =new StringReader (String data);
 * 
 * method
 *read();
 * read(char [] array)-->read character from the reader and store in the specified array
 * ready->> check class is ready or not boolean 
 * mark --. marks the position in reader up to which data has been read 
 * reset() --> return to point where marke is set 
 * 
 */