package interview.com;

import java.util.Arrays;

public class MedianOfArray {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 11, 23, 45, 98 };
		
		Arrays.sort(arr);
		int n=arr.length;
		double median;
		
		if(n%2==0) {
			median=arr[n/2];
		}else {
			median=(arr[n/2 -1] + arr[n/2])/2.0;
		}
		
		System.out.println("Median is "+ median);
	}
	
	
	
	public static void main1(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 11, 23, 45, 98 };
		int median;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			median = (arr.length / 2);
			System.out.println(arr[median]);
			break;

		}

	}
}
