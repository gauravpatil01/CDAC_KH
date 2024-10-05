package com.collectionmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortDemo {
public static void main(String[] args) {
	ArrayList<Integer> al =new ArrayList<>();
	Random random =new Random();
	for (int i =0;i<20;i++) {
		al.add(random.nextInt(20));
	}
//	
//	al.add(4);
//	al.add(5);
//	al.add(2);
//	al.add(1);
//	al.add(3);
	
	System.out.println("list content is : "+ al);
	
	Collections.sort(al);
	System.out.println("After sorting content is :"+al);
	
	
}
}
