
package com.bufferdwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterCharacterDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new  FileWriter("F:\\eclipse\\CDAC\\InpueOutputStream\\src\\output file"));
		
		bw.write("THIS IS A FIRST IN AN EXTERNAML FILE (OUTPUT)\n");
		
		bw.write("THIS IS A second IN AN EXTERNAML FILE (OUTPUT)");
		System.out.println("file content write successufully ");
		bw.close();
	}
}
