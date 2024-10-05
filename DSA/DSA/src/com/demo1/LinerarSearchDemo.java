package com.demo1;
//it work on sorted or unsorted array
import java.util.Scanner;

public class LinerarSearchDemo {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length;i++) {
			if (arr[i] == key) { 
				return i;
			}
			
		}
		return -1; // Return -1 if the key is not found after the loop completes

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 88, 33, 66, 99, 44, 77, 22, 55, 11 };
		System.out.println("Enter key to search Element : ");
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		if (index != -1) {
			System.out.println("key found at index  :" + index);

		} else {
			System.out.println("key not found");
		}

	}
	}
	
