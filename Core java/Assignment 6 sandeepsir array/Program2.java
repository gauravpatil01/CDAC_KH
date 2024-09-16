package in.solution1;
//Declare a single-dimensional array of 5 integers inside the main method. Define a method named acceptRecord to get input from the terminal into the array and another method named printRecord to print the state of the array to the terminal.

import java.util.Scanner;

public class Program2 {
	private static Scanner sc = new Scanner(System.in);

	public static void acceptRecord(int[] arr) {
		System.out.println("accept record ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

	}

	public static void printRecord(int arr[]) {
		System.out.println("printing record");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		acceptRecord(arr);
		printRecord(arr);
	}
}
