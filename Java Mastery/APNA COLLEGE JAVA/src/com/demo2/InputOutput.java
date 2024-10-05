package com.demo2;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
//		output
		System.out.print("Hare Krishna! \n namste ");
		System.out.print("Hare Krishna!");

		// variables

		String name = "Gaurav";
		int a = 25;
		int b = 10;
		int sum = a + b;
		System.out.println(sum);

		int diff = a - b;
		System.out.println(diff);

		int x = 10;
		int y = 5;
		int ans = a * b / a - b;
		System.out.println(ans);

		int result = (x * y) / (x - y);
		System.out.println(result);

		// input
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("print number " + m);

	}
}
