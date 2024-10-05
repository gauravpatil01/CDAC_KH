package com.syntax;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Watermelon");
		hs.add("Banana");
		hs.add("Graphs");
		hs.add("Chiku");

		System.out.println(hs.contains("Apple")); // true
		hs.remove("Apple"); // remove Apple
		System.out.println(hs);
		System.out.println(hs.isEmpty()); // false
		System.out.println(hs.size()); // 5 because remove apple is there

		System.out.println("iterating set ");
		for (String str : hs) {
			System.out.println(str);
		}
		
		HashSet<String> newhs = new HashSet();
		newhs.add("Apple");
		newhs.add("Watermelon");
		System.out.println(newhs);
		hs.retainAll(newhs);
		System.out.println(hs);
		
		System.out.println(hs.containsAll(newhs));  //true
		
		hs.removeAll(newhs);
		System.out.println(hs);
		
		
		

	}
}
