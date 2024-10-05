package com.bufferedinputestrime;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedStreamInputeMethod {
	public static void main(String[] args) {
		try {

			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("F:\\\\eclipse\\\\CDAC\\\\InpueOutputStream\\\\src\\\\test file"));
			int i = bis.read();
//			System.out.println("first character of file : " + (char) i);      //only print first character
			System.out.print("all file content use while ");
			while (i != -1) {
				System.out.print((char) i);
				i = bis.read();

			}
		} catch (Exception e) {
			System.out.println("Error : " + e.getCause());

		}

	}
}
/*
 * buffered inpute stream class is used with another input stream to read the
 * data (in bytes)more efficiently
 * 
 * the bufferedInputeStream maintain an internal buffer of 8192 bytes
 * 
 * during the read operation in bufferedInputeStream chunk of bytes is read from
 * the disk and stored in the internal buffer and from the internal buffer bytes
 * are read individually.
 * 
 * hence the number of communication to the disk is reduce this is why reading
 * bytes is faster using the bufferedinputestream.
 * 
 * method read available close
 * 
 */