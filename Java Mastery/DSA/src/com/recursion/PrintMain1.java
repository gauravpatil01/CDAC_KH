package com.recursion;
//print 5 to 1 number 

public class PrintMain1 {
	public static void printNum(int n) {
		// base condition
		if (n == 0) {
			return;
		}
		System.out.println("Print n value: " + n);
		printNum(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		printNum(n);
	}
}
