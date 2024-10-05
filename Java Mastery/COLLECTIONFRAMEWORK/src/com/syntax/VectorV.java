package com.syntax;
import java.util.*;


public class VectorV {
	public static void main(String[] args) {
		Vector <String> v =new Vector<> ();
		v.add("apple");
		v.add("Banana");
		v.add("Mango");
		v.add("chiku");
		v.add("watermelon");
		v.add("fruits");
		v.add("lal fal");
		System.out.println("first all :: " +v);
		v.addElement("newly added Element");
		System.out.println("ahter add element :: " +v);
		v.remove("apple");
		v.remove(1);
		System.out.println("ahter remove element :: " +v);
		System.out.println("size of  element :: " +v.size());
		
		v.set(1, "set new element");


		
		System.out.println("------------------------------------------------------------------------------");
		Enumeration e =v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		v.clear();
		System.out.println("after clear : "+v);
		
		System.out.println("is empty  :: " +v.isEmpty());
		
		
		
	}
}
