package com.syntax;
import java.util.*;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s =new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(40);
		s.push(50);
		s.push(60);
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.search(20));
		
		 s.setSize(2);
	     System.out.println("Stack after setSize(2): " + s);
	 	System.out.println(s.search(20));
		
		
		
	}
}
