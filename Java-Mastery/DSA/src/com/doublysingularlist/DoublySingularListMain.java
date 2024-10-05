package com.doublysingularlist;

import java.util.Scanner;

class DoublyList {
	// Create node class
	static class Node {
		// feilds
		private int data;
		private Node next;
		private Node prev;

		// Methods

		public Node() {
			data = 0;
			next = null;
			prev = null;

		}

		public Node(int value) {
			data = value;
			next = null;
			prev = null;

		}

	}

	// create list class feilds

	private Node head;

	// create list class method
	public DoublyList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// display

	public void displayForward() {
		System.out.println("Fwd List :");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public void displayReversed() {
		// Special case 1: if list is empty
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("Rwd List :");
		Node trav = head;
		// traverse till last node
		while (trav.next != null) {
			trav = trav.next;
		}
		// print all node in reverse order

		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.prev;
		}
	}

	public void addLast(int value) {
		// create and initiallze new node
		Node newNode = new Node(value);
		// Special case 1: if list is empty
		if (head == null) {
			head = newNode;
			return;
		}

		Node trav = head;
		// traverse till last node
		while (trav.next != null) {
			trav = trav.next;
		}
		trav.next = newNode;
		newNode.prev = trav;

	}

	public void addFirst(int value) {
		// create new Node
		Node newNode = new Node(value);
		// special case 1:if list is empty
		if (isEmpty()) {
			head = newNode;

		} else {
			// new node's next should point to the current head
			newNode.next = head;
			// current head's prev should point to the new node

			head.prev = newNode;
			// head point to new node
			head = newNode;

		}

	}

	public void addAtPos(int value, int pos) {

		// create node
		Node newNode = new Node(value);
		// special case l: if list is empty or ps<1 add node at start
		if (isEmpty() || pos <= 1) {
			addFirst(value);
			return;
		}
		// traverse till pos-1
		Node trav = head;
		Node temp;
		for (int i = 1; i < pos - 1; i++) {
			// special case 2: pos>length of list .
			if (trav.next == null) {
				break;
			}
			trav = trav.next;

		}
		// take temp pointer to node after trav
		temp = trav.next;
		// new node next should be point to travs next(temp)
		newNode.next = temp;
		// newnode prev to trav
		newNode.prev = trav;

		// trav next should point to new node
		trav.next = newNode;

		// temp prev to new node
		if (temp != null) { // spcial case4 :if adding at end ,next line is not required

			temp.prev = newNode;
		}
	}

	public void delFirst() {
		// special case1 :if list is empty
		if (isEmpty()) {
			throw new RuntimeException("list is empty");

		}
		// spicial case 2: if list of only one
		if (head.next == null) {
			head = null;
		} else {
			// general case
			// head should point to next node
			head = head.next;
			// second node (new head ) prev should be null|
			head.prev = null;

		}

	}

	void delAtPos(int pos) {
		// special case 1: if pos =1 delete first node
		if (pos == 1) {
			delFirst();
		}
		// special case 2: if list is empty and pos is <1ength throw exception
		if (head == null || pos < 1) {
			throw new RuntimeException("List is empty or invalid position  ");
		}

		// take temp pointer running behind trav.

		Node trav = head;

		// traverse till pos (trav)
		for (int i = 1; i < pos; i++) {
			// special case 3: if position is beyound list length throw exception
			if (trav == null) {
				throw new RuntimeException("invalid range  ");
			}

			trav = trav.next;
		}
		// trav's previous node's next to trav's next node
		trav.prev.next = trav.next;

		// trav's nextNode's prev to trav's privious node
		if (trav.next != null) {//while deleting last node skip next line
			trav.next.prev = trav.prev;
		}

	}

}

public class DoublySingularListMain {
	public static void main(String[] args) {
		int choice;
		int value;
		int pos;
		DoublyList list = new DoublyList();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"\n\n0..exit\n1. Display\n2. Add First\n3. Add Last\n4. Add Pos\n5. Del First\n6. Del Last\n7. Del Pos\n8. Del All\n ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// display
				list.displayForward();
				list.displayReversed();
				break;
			case 2:// Add First
				System.out.println("Enter New Element : ");
				value = sc.nextInt();
				list.addFirst(value);
				break;
			case 3:// Add Last
				System.out.println("Enter New Element : ");
				value = sc.nextInt();
				list.addLast(value);
				break;

			case 4:// Add Pos
				System.out.println("Enter New Element : ");
				value = sc.nextInt();
				System.out.println("Enter Element  Position : ");
				pos = sc.nextInt();
				list.addAtPos(value, pos);

				break;
			case 5:// Del First
				try {
					list.delFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:// Del last
//				try {
//					list.delLast();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
				break;
			case 7:// Del AtPos
				try {
					System.out.println("Enter a position: ");
					pos = sc.nextInt();
					list.delAtPos(pos);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8:// Del All
//				list.delAll();
				break;

			}

		} while (choice != 0);
		sc.close();
	}
}
