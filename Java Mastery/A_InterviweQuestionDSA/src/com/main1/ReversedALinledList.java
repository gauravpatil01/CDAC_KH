package com.main1;

class SinglyLinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public void addLast(int value) {
		// create a node
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;

		} else {
			// traverse till node

			Node trav = head;

			while (trav.next != null) {
				trav = trav.next;

			}
			trav.next = newNode;

		}
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + "-->");
			trav = trav.next;
		}
		System.out.println("");
	}

	public void reverse() {
//consider current list as old and new list as empty
		Node oldhead = head;
		head = null;
		while (oldhead != null) {
			// delete first(temp) from old list
			Node temp = oldhead;
			oldhead = oldhead.next;

			// add first (temp) to new List

			temp.next = head;
			head = temp;

		}//repete until last node become null 
	}
}

public class ReversedALinledList {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.display();

		list.reverse();
		list.display();

	}
}
