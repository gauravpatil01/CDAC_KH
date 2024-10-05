//file read use Scanne r
//sample.txt

package org.solution8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileinput {

	public static void main(String[] args) {
		try {// try catch explanation not given simply select +surrountd by+trycatch block
			String pathname = "sample.txt";
			File obj = new File(pathname); // instance created

			Scanner sc = new Scanner(obj); // insted of System.in
//			System.out.println("entre number");

			int number = sc.nextInt();
			System.out.println(number);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
