package com.demo27;
import java.util.*;
public class LinkedListDemo1 {
public static void main(String[] args) {
	LinkedList<String> list =new LinkedList();
	list.addFirst("a");
	list.addFirst("is");
	System.out.println(list);
	
	list.addFirst("this");
	list.addLast("list");
	System.out.println(list);
	
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i)=="list") {
		
		}
		System.out.print (list.get(i)+"-->");
	}
	System.out.println("Null");
	list.removeFirst();
	list.removeLast();
	list.remove(3);
	System.out.println(list);
	
}
}
