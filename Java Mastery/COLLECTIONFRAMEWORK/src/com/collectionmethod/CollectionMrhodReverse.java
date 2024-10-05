package com.collectionmethod;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMrhodReverse {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			number.add(i);
		}
		System.out.println("Array list conten :" + number);
		// highest to smallest(descending)
		Collections.reverse(number);
		System.out.println("Array list content after reverse :" + number);

		// swap
		Collections.swap(number, 0, 1);
		System.out.println("after swap" + number);
		//addAll
		ArrayList<Integer> newNumber =new ArrayList<>();
		newNumber.addAll(number);
		System.out.println("compntent of new number :" +newNumber);
		
		//fill -->replace every element in a collection with value 
		
		Collections.fill(newNumber, 10);
		System.out.println("after filling with 10 :" +newNumber);
		
		//copy ==creates copy of element from the specified sourse to destination 
		Collections.copy(newNumber,number);
		System.out.println("after copy : "+newNumber);
		
	}

}
