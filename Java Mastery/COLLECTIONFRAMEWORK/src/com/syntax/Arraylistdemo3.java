package com.syntax;


import java.util.*;

public class Arraylistdemo3 {
public static void main(String[] args) {
	ArrayList<Integer> list =new ArrayList();
	list.add(0);
	list.add(2);
	list.add(3);
	System.out.println(list);
	//get element 
	int element =list.get(1);
	System.out.println(element);
	
	//add el in between 
	
	list.add(1,1);
	System.out.println(list);
	
	//set el
	list.set(0, 5);
	System.out.println(list);
	
	//delete el
	list.remove(3);
	System.out.println(list);
	int size=list.size();
	System.out.println(size);
	//loops
	
	for(int i =0 ;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println();
	
	//sort
	Collections.sort(list);
	System.out.println(list);
}
}
