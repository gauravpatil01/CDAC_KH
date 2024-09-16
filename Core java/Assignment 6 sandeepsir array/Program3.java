package in.solution1;
//Write a program to find the maximum and minimum values in a single-dimensional array of integers.

public class Program3 {
	 
	
	public static int maxValue(int arr[]) {
		int max = arr [0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
		}return max;
	}
	
	public static int minValue(int arr[]) {
		int min = arr [0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}
		}return min;
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 11, 35, 67, 65, 89 };
		int maximun=maxValue(arr);
		int minimun=minValue(arr);
		
		System.out.println("max value array is :"+maximun);
		System.out.println("min value array is :"+minimun);
		
	}
}
