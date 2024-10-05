package com.sorting;

import java.util.Arrays;

public class InsertionMain {
	public static void insertionSort(int arr[]) {
		// n-1 passes in each pass consider ith element as last element of array
		for (int i = 1; i < arr.length; i++) {
			// copy last element into temp variable
			int j;
			int temp = arr[i];
			// compare temp element with all element before that find appropriate position
			// for the element
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 9, 6, 4, 7, 8, 6, 7, 10 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

// insertion technique Not insertion sort  (for only last element is unsortrd )
//public static void insertion(int[] arr) {
//
//	int temp = arr.length - 1; // last value
//
//	for (int j = arr.length - 2/* second last */;
//       j >= 0/* goes till first index */ && arr[j] > temp/* currnet j > last element */;
//		 j--) {
//		{
//			arr[j + 1] = arr[j];
//		}
//		arr[j + 1] = temp;
//	}
//}
