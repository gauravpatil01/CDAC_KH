package com.set;

import java.util.*;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(); // sorted order
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(80);

//	System.out.println("all element in treeset : "+ts);
		ts.remove(10);
		Iterator<Integer> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + ",");
		}

//	System.out.println(ts.headSet(30)); //before 30
//	System.out.println(ts.tailSet(30)); //after 30
		System.out.println("fiest emement" + ts.first()); // first
		ts.pollFirst(); // REMOVE FIRST
		ts.pollLast(); // REMOVE LAST
		System.out.println("all element in treeset : " + ts);

	}
}
