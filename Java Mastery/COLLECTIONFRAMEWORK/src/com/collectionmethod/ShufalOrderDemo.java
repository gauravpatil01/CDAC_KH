package com.collectionmethod;

import java.util.ArrayList;
import java.util.Collections;

public class ShufalOrderDemo {
public static void main(String[] args) {
	ArrayList<Integer> ls =new ArrayList<Integer>();
	for (int i =1;i<=10;i++) {
		ls.add(i);
	}
	System.out.println( "Content in list : "+ls);
	Collections.shuffle(ls);
	System.out.println("after shuffal   : "+ls);
	Collections.shuffle(ls);
	System.out.println("another  shuffal  : "+ls);
}

}
/*
 * shuffle use to distroy any kind of sorting order present in the data
 * structure
 * 
 */
