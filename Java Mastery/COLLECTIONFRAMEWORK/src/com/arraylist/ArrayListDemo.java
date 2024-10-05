package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(130);
		a1.add(140);
		a1.add(40);
		a1.add(50);
		a1.remove(2); // 30 remove
		System.out.println(a1);
		a1.add(2, 30); // add 30
		System.out.println(a1);

		System.out.println(a1.contains(14)); // false
		System.out.println(a1.contains(50));

		System.out.println(a1.get(2));// 30
		System.out.println(a1.set(4, 100)); // 50 replace to 100
		System.out.println(a1);

		System.out.println(a1.size()); // 5 size of array
		System.out.println(a1.isEmpty()); // False
//		a1.addFirst(5);   //not ok for AL

//		ArrayList a2 =new ArrayList(a1); //ok 

		ArrayList a2 = new ArrayList();
		a2.add(110);
		a2.add(130);
		a2.add(140);
		a2.add(150);
		a2.add(120);

		System.out.println(a2);
		a2.addAll(a1);
		System.out.println(a2); // add collection first a2 element and then a1 elements
		a2.removeAll(a1);
		System.out.println(a2);

		System.out.println(a2.containsAll(a1));

		Collections.sort(a2); // sort arraylist
		System.out.println(a2);
		a2.clear(); // clear all a2 collection
		System.out.println(a2);

	}
}
