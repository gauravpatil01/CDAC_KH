package com.syntax;

import java.util.*;

class Check1 {
	public static List<Integer> getList() {
		List<Integer> ll = new ArrayList();// pk
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(30);

		return ll;
	}
}

public class ArrayListSyntax3 {

	public static void main(String[] args) {

		List<Integer> l = Check1.getList(); // method call
		Integer element = null;
		for (int i = 0; i < l.size(); i++) {
			element = l.get(i);
			System.out.println(element);
		}

	}
}

/*
 * Collection<Integer> c=new ArrayList(); //ok List<Integer> ll=new ArrayList();
 * //ok ArrayList<Integer> a=new ArrayList();//ok
 */