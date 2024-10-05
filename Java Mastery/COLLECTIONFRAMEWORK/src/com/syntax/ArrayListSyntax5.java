package com.syntax;

import java.util.*;

class Test1 {
	public static List<Integer> getList() {
		List<Integer> ll = new ArrayList();
		ll.add(10);
		ll.add(20);

		ll.add(30);
		ll.add(50);
		ll.add(60);

		return ll;
	}
}

public class ArrayListSyntax5 {

	public static void main(String[] args) {

		List<Integer> l = Test1.getList();
		for (Integer element : l) {
			System.out.println(element);
		}

	}
}
