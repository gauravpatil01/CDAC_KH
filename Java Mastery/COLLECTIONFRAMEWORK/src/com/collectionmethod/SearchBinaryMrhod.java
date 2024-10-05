package com.collectionmethod;

import java.util.ArrayList;
import java.util.Collections;

public class SearchBinaryMrhod {
	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			ls.add(i);
		}
		System.out.println("before sort method  :" + ls);
		// find position of 5
		int position = Collections.binarySearch(ls, 5);
		System.out.println("position of value 5 : " + position);

		// position for 8
		int position2 = Collections.binarySearch(ls, 8);
		System.out.println("position of value 8 : " + position2);
	}
}
/*
 * the binarySearch()--> methods of java collections framework searches for the
 * specified element it return the position of the element in the specified
 * collection 
 * <------------------------------------------------------->
 *  before use this method the list should be sorted
 * 
 * 
 * 
 */