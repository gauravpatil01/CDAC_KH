package com.collectionmethod;

import java.util.ArrayList;
import java.util.Collections;

public class FrequenceDisjointMinMaxMethods {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			number.add(i);
			if (i == 3) {
				number.add(2);
			}
		}
		number.add(2);
		System.out.println(number);

		// frequency
		int count = Collections.frequency(number, 2);
		System.out.println("count of number 2: " + count);
//disjoint
		ArrayList<Integer> newNumber = new ArrayList<>();
		for (int i = 11; i <= 15; i++) {
			newNumber.add(i);

		}
		newNumber.add(2);
		System.out.println("new number list : " + newNumber);
		boolean disjointnum = Collections.disjoint(number, newNumber);
		System.out.println("disjointnum :" + disjointnum); // true not present same elkement ;false for present
//min max
		int minValue = Collections.min(newNumber);
		int maxValue = Collections.max(newNumber);
		System.out.println("minimum in new Array list : " + minValue);
		System.out.println("maximum in new Array list : " + maxValue);

	}

}
/*
 * Frequency()--> return count of number that how much time element repeate in
 * collection
 * 
 * disjoint -->check two collection have some comman element
 * 
 * min and max()--> find min and maximum of element
 */