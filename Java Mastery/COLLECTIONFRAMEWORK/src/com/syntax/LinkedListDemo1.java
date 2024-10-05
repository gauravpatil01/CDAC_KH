package com.syntax;

import java.util.*;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList();
		list.add("gaurav");
		list.add("ram");
		list.add("ravi");
		list.add("soham");
		list.add("mrunal");
		list.add("sneha");

		list.set(4, "ramcharan");
		System.out.println(list);
		System.out.println("get index second "+list.get(2));
		System.out.println("get index of soham "+list.indexOf("soham"));
		
		System.out.println(list.contains("ravi"));
		list.addLast("lastString");
		list.addFirst("First String");

		ListIterator ltr = list.listIterator();

		while (ltr.hasNext()) {
			System.out.print(ltr.next() + " : ");
		}

	}
}
