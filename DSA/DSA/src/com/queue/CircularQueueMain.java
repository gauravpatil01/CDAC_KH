package com.queue;

import java.util.Scanner;

class CircularQueue {
	private int[] arr;
	private int rear, front;

	public CircularQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public boolean isFull() {
		return (front == 0 && rear == arr.length - 1) || (front == rear + 1);
	}

	public boolean isEmpty() {
		return (front == -1);
	}

	public void push(int value) {
		if (isFull())
			throw new RuntimeException("Queue is full");
		if (isEmpty()) {
			front = 0; // Set front to 0 when the first element is added
		}
		rear = (rear + 1) % arr.length;
		arr[rear] = value;
	}

	public void pop() {
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		if (front == rear) {
			front = -1; // Reset front and rear when the queue becomes empty
			rear = -1;
		} else {
			front = (front + 1) % arr.length;
		}
	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		return arr[front];
	}
}

public class CircularQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularQueue q = new CircularQueue(6);
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
					System.out.println("Popped value is: " + value);
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
				System.out.println("Is the queue empty? " + q.isEmpty());
				break;

			case 5: // isFull
				System.out.println("Is the queue full? " + q.isFull());
				break;
			}

		} while (choice != 0);
		sc.close();
	}
}
