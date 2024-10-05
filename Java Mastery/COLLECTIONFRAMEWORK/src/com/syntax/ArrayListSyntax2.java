package com.syntax;

import java.util.*;

class Check {
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

public class ArrayListSyntax2 {

	public static void main(String[] args) {

		List<Integer> l = Check.getList();

		System.out.println(l.toString());
		Collections.sort(l);
		System.out.println(l.toString());

	}
}

/*
 * Collection<Integer> c=new ArrayList(); //ok List<Integer> ll=new ArrayList();
 * //ok ArrayList<Integer> a=new ArrayList();//ok
 */