package com.demo5;
//i --> 1 to n

//j-->i to n
//k--> 1 to i
//l--> 1 to i

public class HalfDiamond {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}/*
	
	    
	    *
	   ***
	  *****
	 *******
	*********
	
	decreasing -->increasing -->increasing
	
	
	
	*/