package com.sorting;

import java.util.Arrays;

public class MergSortMain {
	public static void mergSort(int[] arr, int left, int right) {
		// BASE
		// if partition is invalid or single element then return
		if (left > right || left == right) {
			return;
		}
		// divide array into two equal partitions
		int mid = (left + right) / 2;
		// sort left partition [left to mid]
		mergSort(arr, left, mid);
		// sort right partition [mid+1 to right]
		mergSort(arr, mid + 1, right);
		// create temporary to accommodate both partitions
		int[] temp = new int[right - left + 1];
		// merge two sorted partition into temp array
		int i = left, j = mid+1, k = 0;
		// Compare element from both partition and copy smaller one
		// (until any one partition is done )
		while (i <= mid && j <= right) {// any one condition fail it will come out
			if (arr[i] < arr[j]) {
				temp[k] = arr[i]; // temp[k++] =arr[i++]; it ok
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		// copy remaining element from other partition
		while (i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while (j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		// overwrite temp array back to original array
		for ( i = 0; i < temp.length; i++) {
			arr[left + i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int [] arr = {8,3,9,1,5,7,2,6,4};
		System.out.println(Arrays.toString(arr));
		mergSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
}
