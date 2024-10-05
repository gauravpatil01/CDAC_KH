package com.stack;
//stack implemented using array
import java.util.Scanner;

class Stack {
	// we can make Object type also
	// how private Object[]
	private int top;
	private int[] arr;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int value) {
		if (isFull()) {
			throw new RuntimeException("stack is Full");
		}
		top++;
		arr[top] = value;
	}

	public void pop() {
		if (isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		top--;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		return arr[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}
}

public class ImplementedStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(6);
		int choice, value;
		do {
		System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. isEmpty\n5. isFull");
		System.out.print("Enter choice: ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1: // push
			try {
				System.out.println("Enter value to push: ");
				value = sc.nextInt();
				s.push(value);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;

		case 2: // pop
			try {
				value = s.peek();
				s.pop();
				System.out.println("Pooped value is: " + value);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;

		case 3: // peek
			try {
				value = s.peek();
				System.out.println("Value at top most: " + value);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4: // isEmpty
			s.isEmpty();

			break;
		case 5: // isFull
			s.isFull();

			break;
		}

	}while (choice!=0);
		}
}
