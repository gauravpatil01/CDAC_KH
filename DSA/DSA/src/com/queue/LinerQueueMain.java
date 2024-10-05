package com.queue;

import java.util.Scanner;

class LinearQueue {
	private int[] arr;
	private int rear, front;

	public LinearQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;

	}

	public boolean isFull() {
		return rear == arr.length - 1;
		
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public void push(int value) {
		if (isFull())
			throw new RuntimeException("Queue is full");
		rear++;
		arr[rear] = value;
	}

	public void pop() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty");

		front++;
	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty");
		return arr[front + 1];
	}
}

public class LinerQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearQueue q = new LinearQueue(6);
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
				q.push(value);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;

		case 2: // pop
			try {
				value = q.peek();
				q.pop();
				System.out.println("Pooped value is: " + value);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;

		case 3: // peek
			try {
				value = q.peek();
				System.out.println("Value at top most: " + value);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4: // isEmpty
			q.isEmpty();

			break;
		case 5: // isFull
			q.isFull();

			break;
		}

	}while (choice!=0);
		}

}
