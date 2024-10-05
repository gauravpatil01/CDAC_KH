package com.syntax;

import java.util.*;

class Test {
	public static List<Integer> getList() {
		List<Integer> ll = new ArrayList();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(30);
		ll.add(50);
		ll.add(60);

		return ll;
	}
}

public class ArrayListSyntax4 {

	public static void main(String[] args) {

		List<Integer> l = Test.getList();
		Integer element = null;

		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		}

	}
}
