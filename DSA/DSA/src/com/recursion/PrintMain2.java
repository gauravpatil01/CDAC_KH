package com.recursion;

//print 1 to 5
public class PrintMain2 {
	static void printNum(int n ) {
		//base condition 
		if(n ==6) {
			return;
		}
		
		System.out.println("N is: " +n);
		printNum(n+1);
	}
	public static void main(String[] args) {
		int n =1;
		printNum(n);
	}
}
