package com.recursion;

public class FibonacheeMain4 {
	public static void printFib(int a, int b, int n) {
		if (n == 0)
			return;
		int nextTerm;
		nextTerm = a + b;
		System.out.println(nextTerm);
		printFib(b, nextTerm, n - 1);

	}

	public static void main(String[] args) {
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
		int n =64;
		printFib(0, 1, n);
	}
}
