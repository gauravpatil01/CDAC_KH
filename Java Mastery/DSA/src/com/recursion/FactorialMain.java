package com.recursion;

public class FactorialMain {
	public static int fact(int n) {
		// base condition
		if (n == 1 || n == 0) return 1;
			
		int factCureentMinusOne = fact(n - 1);
		int currentFacteroial = n * factCureentMinusOne;
		
		return currentFacteroial;

	}

	public static void main(String[] args) {
		int n = 6;
		int ans = fact(n);
		System.out.println("factorail of number " + n + "is: " + ans);
	}
}
