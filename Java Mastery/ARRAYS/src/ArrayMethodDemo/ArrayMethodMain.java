package ArrayMethodDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodMain {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 10, 20, 30, 40, 50 };
		if (Arrays.equals(a, b)) {
			System.out.println("both are equals");
		} else {
			System.out.println("not equals");
		}

		if (a == b) { // it check reference (a and b not value )
			System.out.println("arrays equal using ");
		} else {
			System.out.println("not equal ");
		}
	}

	// copyOf
	public static void main3(String[] args) {
		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.print("enter element : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int a2[] = Arrays.copyOf(a, 6); // (a-->where to copy , 6 -->size of current )
		System.out.print("data in a2: ");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}

	}

	// Equals() method return boolean
	public static void main2(String[] args) {
		int[] a = new int[5];
		int[] a2 = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("enter element for 2nd array : ");
		for (int i = 0; i < a2.length; i++) {
			a2[i] = sc.nextInt();
		}
		boolean checkEqual = Arrays.equals(a, a2);
		System.out.println("is equal return boolean : " + checkEqual);

	}

	// sort
	public static void main1(String[] args) {

		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("sorted element");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}
}
