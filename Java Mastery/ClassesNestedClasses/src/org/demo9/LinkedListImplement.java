package org.demo9;

class Node {
	int data;
	Node next = null;

	public Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	private Node head = null;
	private Node tail = null;

	public boolean empty() {
		return this.head == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (this.empty())
			this.tail = newNode;
		else
			newNode.next = this.head;
		this.head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (this.empty())
			this.head = newNode;
		else
			this.tail.next = newNode;
		this.tail = newNode;
	}

	public void printRecord() {
		if (!this.empty()) {
			Node trav = this.head;
			while (trav != null) {
				System.out.println(trav.data + "	");
				trav = trav.next;
			}
			System.out.println();
		} else
			System.out.println("List is empty");
	}
}

public class LinkedListImplement {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.printRecord();
	}
}
