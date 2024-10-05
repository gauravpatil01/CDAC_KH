package com.singlylinkedlist;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

class SinglyList {
	// Node is Static member class of SinglyList
	static class Node {
		// Node class feilds
		private int data;// integer linked list
		private Node next;

		// Node class Method
		public Node(int value) {
			data = value;
			next = null;
		}

	}

	// List class feild
	private Node head;

	// list class method
	public SinglyList() {
		/* this */head = null;
	}

	void display() {
		System.out.println("List : ");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

	void addFirst(int value) {
		// Create first node and initialize it
		Node newNode = new Node(value);
		// New node next should point head
		newNode.next = head;
		// head should point new Node
		head = newNode;

	}

	void addLast(int value) {
		// create new node & init it
		Node newNode = new Node(value);

		// special Case 1: if list is empty,make new node as first node of list
		if (head == null) {
			head = newNode;
		} // general Case : add node at the end
		else {
			// traverse list
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}

			// Add new node after trav (trav.next)
			trav.next = newNode;
		}

	}

	void addAtPos(int value, int pos) {

		// special case: if list is empty ,add node at the start
		// special case: if pos<=1,add node at the start
		if (head == null || pos <= 1) {
			addFirst(value);
		} // general case add node at given positin

		else {

			// allocate and initilize new node
			Node newNode = new Node(value);

			// traverse till position -1 (trav)
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				// special case:if pos >length of list ad node at the end .
				if (trav.next == null) {
					break;
				}
				trav = trav.next;
			}
			// new node next should point to trave's next
			newNode.next = trav.next;
			// trav's next should pointer to new Node
			trav.next = newNode;
		}
	}

	void delFirst() {
		// special case 1: if list is empty throw exception
		if (head == null) {
			throw new RuntimeException("List is empty");
		}
		// general case :make head pointing to next node
		head = head.next;
		// note:the old first node will be garbage collected
	}

	void delAll() {
		head = null;
		// all nodes will be garbage collected
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
		Node temp = null;
		Node trav = head;

		// traverse till pos (trav)
		for (int i = 1; i < pos; i++) {
			// special case 3: if position is beyound list length throw exception
			if (trav == null) {
				throw new RuntimeException("invalid range  ");
			}
			temp = trav;
			trav = trav.next;
		}
		// trav is node to be deleted and temp is node before trav
		temp.next = trav.next;
		// trav node automatically garbage collected
	}

	public void delLast() {

		// special case1 : head is null
		if (head == null) {
			throw new RuntimeException("List is empty");
		}
		// special case2 : if list has single element;make head null
		if (head.next == null) {
			head = null;
		} else {
			// general case condition
			Node temp = null;
			Node trav = head;
			// travers till last( using trav)and run temp behind it
			while (trav.next != null) {
				temp = trav;
				trav = trav.next;
			}
			// when last node (trav)is deleted ,second node (temp)next should be null
			temp.next = null;
			// last node trav will be garbage collect

		}

	}

	public void sort() {
		Node i;
		Node j;
		for (i = head; i != null; i = i.next) {
			for (j = i.next; j != null; j = j.next) {
				if (i.data > j.data) {
					// Swap the data values of nodes i and j
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}

			}
		
		}	display();
	}

}

public class SinglyLinkedListMainOne {
	public static void main(String[] args) {
		int choice;
		int value;
		int pos;
		SinglyList list = new SinglyList();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"\n\n0..exit\n1. Display\n2. Add First\n3. Add Last\n4. Add Pos\n5. Del First\n6. Del Last\n7. Del Pos\n8. Del All\n9. Sort ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// display
				list.display();
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
				try {
					list.delLast();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
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
				list.delAll();
				break;

			case 9:// Sort
				list.sort();
				break;

			}

		} while (choice != 0);
		sc.close();
	}
}
