/* 
 *Declare a single-dimensional array of 5 integers inside the main method.
 *Traverse the array to print the default values. 
 *Then accept records from the user and print the updated values of the array. 
 */
package in.solution1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// array of 5 element
		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "	");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 4 integer");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("updated value ");
		for (int i = 0; i <= arr.length; i++) {
			System.out.println("array index at [" + i + "] is " + arr[i] + " ");
		}

	}
}