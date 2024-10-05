package com.demo3;

import java.util.*;

public class ConditionalDemo {
	private static Scanner sc = new Scanner(System.in);

	public void checkButton(int button) {
		switch (button) {
		case 1:
			System.out.println("namaste");
			break;
		case 2:
			System.out.println("hello");
			break;
		case 3:
			System.out.println("Bonjour");
			break;
		default:
			System.out.println("invalid entry ");
		}
	}

	public static void main(String[] args) {
		ConditionalDemo a1 = new ConditionalDemo();
		System.out.println("Enter A button ");
		int button = sc.nextInt();
		a1.checkButton(button);

		System.out.println("enter a number ");
		int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}
}
