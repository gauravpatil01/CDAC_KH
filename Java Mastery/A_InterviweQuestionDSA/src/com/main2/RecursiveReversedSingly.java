package com.main2;

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

	private Node recReverse(Node h) {
		// base condition :if list having single node
		if (h.next == null) {
			head = h; // global head pointingf to last node
			return h;             
		}

		// reverse rest of the list
		Node lastNode = recReverse(h.next);
		// add current node after lastnode
		lastNode.next = h;
		// make current node next to null
		h.next = null;
		// return current node cause it became last node now
		return h;
	}

//its wrapper class function 
	public void recReverse() {
		if(head!=null)
			recReverse(head);// internal call to recReversed
	}

}

public class RecursiveReversedSingly {
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

		list.recReverse();
		list.display();

	}
}
