package com.singlycircularlinkedlist;

import java.rmi.ServerRuntimeException;
import java.util.Scanner;

class SinglyCircularList {
//Node class
	static class Node {
		// feilds
		private int data;
		private Node next;
		// Node class method

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

	public SinglyCircularList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		System.out.println("List: ");
		// special case: list is empty then return
		if (isEmpty()) {
			return;
		}
		// general case print all nodes in list

		// trav
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != head);

	}

	public void addLast(int value) {

		// create node and init value

		Node newNode = new Node(value);
		// special case1 :list is empty.new node is the first node & make it circular

		if (isEmpty()) {
			head = newNode;
			head.next = head; /* newNode.next =head --> same */
		} // general case: add node to last;
		else {

			// traverse till last node (trav)i.e the next whose contain head
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			// new Node next to the head
			newNode.next = head;
			// last node (trav) next point to new node
			trav.next = newNode;

		}
	}

	public void addFirst(int value) {
		// create newNode and init it
		Node newNode = new Node(value);
		// special case1: if list is empty ;make newnode head and newNode nexthead
		if (isEmpty()) {
			head = newNode;
			head.next = newNode;/* newNode.next=head //ok */
		}
		// traverse till last node (trav)i.e the next whose contain head
		Node trav = head;
		while (trav.next != head) {
			trav = trav.next;
		}
		// new Node next to the head
		newNode.next = head;
		// last node (trav) next point to new node
		trav.next = newNode;

		// head is pointing to neeNode
		head = newNode;

	}

	public void addAtPos(int value, int pos) {
		// allocate and init newNode
		Node newNode = new Node(value);
		// special case1 :if list is Empty & pos<=1 ;make add newNode to first
		if (isEmpty() || pos <= 1) {
			addFirst(value);
			return;
		}

		// traverse till positon -1
		Node trav = head;

		for (int i = 1; i < pos - 1; i++) {
			// special case 2:if pos is beyond range
			if (trav.next == head) {
				break;
			}
			trav = trav.next;
		}
		// new node next point to trav next
		newNode.next = trav.next;
		// trav next should pointer towards newnode
		trav.next = newNode;
	}

	public void delFirst() {

		// special case 1:if list is empty
		if (isEmpty()) {
			throw new RuntimeException("list is Empty");
		}
		// special case 2:if our list have only one Node
		if (head.next == head) {
			head = null;
		} // general case: delete first node
		else {
			// traverse till last node
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}

			// take head to the next ((2nd)Node)
			head = head.next;

			// last Node (trav);next should be to new head
			trav.next = head;
		}
	}

	public void delLast() {

		// special case 1:if list is empty
		if (isEmpty()) {
			throw new RuntimeException("list is Empty");
		}
		// special case 2:if our list have only one Node
		if (head.next == head) {
			head = null;
		} else {

			// create temp and trav for traversing
			Node temp = null;
			Node trav = head;
			// trave till last node
			while (trav.next != head) {
				temp = trav;
				trav = trav.next;
			}
			// temp points address to the head
			temp.next = head;

			trav.next = null;

		}
	}

	public void delAtPos(int pos) {
		// special case 1: if you want to delete 1 node
		if (pos == 1) {
			delFirst();
			return;
		}
		// special case 2:if list is empty or pos < 1
		if (head == null || pos < 1) {
			throw new RuntimeException("List is empty");
		} else {
			// take temp pointer running begind trav
			Node temp = null;
			Node trav = head;
			// traverse till position
			for (int i = 1; i < pos; i++) {
				// special case 3:if you want to go beyond the position
				if (trav.next == head) {
					throw new RuntimeException("Linvalid position ");
				}
				temp = trav;
				trav = trav.next;
			}
			temp.next = trav.next;
		}
	}

	public void delAll() {
		head.next=null;
		head=null;
	}
}

public class SinglyLinkedListMain {
	public static void main(String[] args) {
		int choice;
		int value;
		int pos;

		SinglyCircularList list = new SinglyCircularList();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"\n\n0..exit\n1. Display\n2. Add First\n3. Add Last\n4. Add Pos\n5. Del First\n6. Del Last\n7. Del Pos\n8. Del All\n ");
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

			}

		} while (choice != 0);
		sc.close();
	}
}
