/*
 * Write a program to remove duplicate elements
 *  from a single-dimensional array of integers.
 * */

package in.solution1;

public class Program4 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,1,3};
		
		//traverse  array 
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicates value in array is "+ arr[i]);
				}
			}
	}

}}