package com.set;

import java.util.*;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<Integer>();
		ss.add(3);
		ss.add(1);
		ss.add(8);
		ss.add(2);
		ss.add(4);
		ss.add(2);
		ss.add(9);
		ss.add(8);
		ss.add(7);
		ss.add(23);
		System.out.println("conntented of sorted set " + ss);

		System.out.println("first element in set " + ss.first());
		System.out.println("last element in set " + ss.last());

		System.out.println("i want all number before 4 "+ss.headSet(4));
		System.out.println("i want all number after 4 "+ss.tailSet(4));
		System.out.println("Give number between 1 to 4 in which last element excluded "+ss.subSet(1,4));

	}
	
}
