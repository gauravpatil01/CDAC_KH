package com.list;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		List l1 = new ArrayList();

		l1.add(0, 5);
		l1.add(1, 10);
		l1.add(96);
		l1.add(50);
		l1.add(50);
		l1.add(null);
		l1.add(null);
		System.out.println(l1.indexOf(50));
		l1.remove(2); // 96 gayab
		System.out.println(l1.get(5)); // null
		l1.set(4, "newUpdated value through set ");

		System.out.println(l1);

	}
}
