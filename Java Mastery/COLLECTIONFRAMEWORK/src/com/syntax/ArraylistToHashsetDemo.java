package com.syntax;
import java.util.*;
import java.util.HashSet;
public class ArraylistToHashsetDemo {
public static void main(String[] args) {
	ArrayList<Integer> list =new ArrayList();
	list.add(100);
	list.add(110);
	list.add(120);
	list.add(120);
	list.add(100);
	list.add(130);
//	System.out.println(list);
	
	HashSet<Integer> hs =new HashSet();

	hs.addAll(list);
	System.out.println(hs);
	
	
	
}
}
