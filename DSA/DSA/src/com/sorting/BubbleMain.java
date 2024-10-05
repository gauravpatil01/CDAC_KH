package com.sorting;

import java.util.Arrays;

public class BubbleMain {
	public static void bubbleSort(int[] arr) {
		// execute n-1 passes
		for (int i = 0; i < arr.length - 1; i++) {
			// Compare consecutive elements
			// if left element is greater than right element then swap
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

	public static void improvedBubbleSort(int[] arr) {
		// execute n-1-i passes
		for (int i = 0; i < arr.length - 1 - i; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void moreImprovedBubbleSort(int[] arr) {
		//If our array is sorted 
		for (int i = 0; i < arr.length - 1 - i; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}
			if (flag == false /* !flag */) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 2, 8, 3, 1 };
		System.out.println("Before : " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After  : " + Arrays.toString(arr));
		improvedBubbleSort(arr);
		System.out.println("After Improved  : " + Arrays.toString(arr));

	}
}
