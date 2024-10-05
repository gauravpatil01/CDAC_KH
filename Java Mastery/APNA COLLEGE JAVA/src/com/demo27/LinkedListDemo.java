package com.demo27;

import java.util.LinkedList;

public class LinkedListDemo {
	Node head;
	private int size;

	LinkedListDemo() {
		this.size = 0;
	}

	class Node { // data and next pointer store here
		String data;
		Node next; // contain next Node Address

		Node(String data) {
			this.data = data;
			this.next = null; // new node next is always null
			size++;

		}
	}

	// add -first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) { // if list is not there
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

// add-last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node currNode = head; // traverse --> create current node
		while (currNode.next != null) {
			currNode = currNode.next; // never change head
		}
		currNode.next = newNode;
	}

	// print
	public void printList() {

		if (head == null) {// if head is not present
			System.out.println("List is empty ");
		}

		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	// Delete first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty ");
			return;
		}
		size--;
		head = head.next;
	}

	// delete last
	public void deleteLast() {
		if (head == null) {
			System.out.println("head is empty ");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}

//		traverse
		Node secondLast = head;
		Node lastNode = head.next; // head.next ==null --> lastnode =null

		while (lastNode.next != null) { // null.next-->error
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;

	}

	public int getSize() {
		return size;// null not count here
	}

	public static void main(String[] args) {

		LinkedListDemo list = new LinkedListDemo();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();

		list.addLast("List");
		list.printList();

		list.addFirst("This");
		list.printList();

		list.deleteFirst();
		list.printList();

		list.deleteLast();
		list.printList();

		System.out.println(list.getSize());
		list.addFirst("this");

		System.out.println(list.getSize());
	}
}
