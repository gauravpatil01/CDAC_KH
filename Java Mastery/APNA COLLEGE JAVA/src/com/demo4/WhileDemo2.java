package com.demo4;

public class WhileDemo2 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 11) {
			System.out.print(i + "-->");

			i++;
		}
		System.out.println();

		// do while
		int x = 0;
		do {
			System.out.print(x + "-->");
			x = x + 1;
		} while (x < 10);

		// sum of n number
		int n = 4;
		int sum = 0;
		for (int j = 0; j <= n; j++) {
			sum = sum + j;

		}
		System.out.println("Sum is " + sum);
	}
}
/*
 * while (Condition) {//do somthing}
 * 
 */
