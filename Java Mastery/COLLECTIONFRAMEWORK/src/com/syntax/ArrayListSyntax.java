package com.syntax;

import java.util.*;

public class ArrayListSyntax {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList(); // initilization
		ArrayList<Integer> arraylist1 = new ArrayList(15); // with capacith 15

		Collection<Integer> c = new ArrayList(); // upcasting
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(70);
		c.add(80);
		ArrayList<Integer> al = new ArrayList(c);
		System.out.println(al.toString());
		System.out.println("SIZE BEFORE TRIM " + al.size());

		al.trimToSize();
		System.out.println(al);
		System.out.println("SIZE AFTER TRIM " + al.size());

		al.subList(1, 3).clear();
		System.out.println(al);

	}
}
