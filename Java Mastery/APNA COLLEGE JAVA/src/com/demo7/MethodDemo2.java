package com.demo7;

import java.util.Calendar;
import java.util.Scanner;

public class MethodDemo2 {
	private static Scanner sc = new Scanner(System.in);

	public static int calculateSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;

	}
	
	public static void factrialNumber(int n) {
		//loop
		if(n<0) {
			System.out.println("invalid Number");
			return;
		}
		int factorial =1;
		for(int i =n;i>=1 ;i-- ) {
			factorial =factorial*i;
		}
		System.out.println(factorial);
		return;
	}

	public static void main(String[] args) {
		System.out.println("enter number");
		int n =sc.nextInt();
		factrialNumber(n);
		
	}
}
