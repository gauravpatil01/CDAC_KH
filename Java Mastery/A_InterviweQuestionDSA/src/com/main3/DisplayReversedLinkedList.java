package com.main3;
//here only we display reversed 
//find middle also include here 

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

	private void revDisplay(Node h) {  
		if(h==null) {
			return ;
		}
		revDisplay(h.next);
		System.out.print(h.data+"-->");
	}

	public void revDisplay() {
		System.out.print("List: ");
		revDisplay(head);
		System.out.println("");
	}
	
	public int findMid() {
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return slow.data;
	}

}

public class DisplayReversedLinkedList {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
//		list.display();
//		list.revDisplay();
//		list.display();
		System.out.println("Middle: "+list.findMid());

	}
}
