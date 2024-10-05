package com.demo3;

import java.util.Arrays;
//sorted only 
import java.util.Scanner;

public class BinarySearchRecersiveDemo {
	public static int recersiveBinarySearch(int[] arr, int left, int right, int key) {
		if (right < left) {
			return -1; // base condation
		}
		int index;
		int mid = (left + right) / 2;
		if (key == arr[mid]) {
			return mid;
		}
		if (key < arr[mid]) {
//			return right =mid-1;
			index = recersiveBinarySearch(arr, left, mid - 1, key);
			return index;
		} else {
			index = recersiveBinarySearch(arr, mid + 1, right, key);
			return index;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Arrays.sort(arr);
		System.out.println("Enter A Key : ");
		int key = sc.nextInt();
		int index = recersiveBinarySearch(arr, 0, arr.length - 1, key);
		if (index != -1) {
			System.out.println("Key found at index is : " + index);
		} else {
			System.out.println("key not found");
		}
	}
}
