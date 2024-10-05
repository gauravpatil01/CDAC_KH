package com.syntax;
import java.util.*;


public class LinkedHashSetArrayDemo {
public static void main(String[] args) {
	LinkedHashSet<Integer> lhs =new LinkedHashSet();
	lhs.add(10);
	lhs.add(20);
	lhs.add(30);
	lhs.add(40);
	lhs.add(30);
	lhs.add(10);
	
	System.out.println(lhs);
	lhs.remove(10);
	System.out.println(lhs);
	System.out.println(lhs.contains(20));
	
	
}
}
