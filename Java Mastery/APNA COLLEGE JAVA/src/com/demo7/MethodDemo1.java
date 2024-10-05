package com.demo7;

import java.util.Scanner;

public class MethodDemo1 {
	

	public void printMyName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		MethodDemo1 obj = new MethodDemo1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name...");
		String name=sc.nextLine();
		obj.printMyName(name);
	}
}
/*
all function present like Stack 

stack one frame 
main is going to frame 


 */
