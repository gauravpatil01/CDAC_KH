package com.demo2;

//Array should be sorted in Binary Search
import java.util.Arrays;
//sorted only 
import java.util.Scanner;

public class BinarySeachDemo {
	public static int binarySearch(int[] arr, int key) {
		int leftIndex = 0, rightIndex = arr.length - 1, mid;
		while (leftIndex <= rightIndex) {
			mid = (leftIndex + rightIndex) / 2;
			if (key == arr[mid])
				return mid;
			if (key < arr[mid])
				rightIndex = mid - 1;
			else
				leftIndex = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Arrays.sort(arr);
		System.out.println("Enter A Key : ");
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		if (index != -1)
			System.out.println("Key Found at I ndex  : " + index);
		else
			System.out.println("Key Not Found ");

	}
}
