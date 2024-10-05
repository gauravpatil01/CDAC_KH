package DECLARE_DEMO1;

import java.util.Arrays;

public class Declar1DMain1 {
	public static void main(String[] args) {
		// SUMMAREY
		int[] x;
		x = new int[10];

		int[] y = new int[10];

		int[] z = { 10, 20, 30, 40, 50 };

		int[] g = new int[] { 10, 20, 30, 40, 50 };

		// Retrive
		// FOR
		System.out.print("Print With For : ");

		for (int i = 0; i < z.length; i++)
			System.out.print(z[i] + " ");

		System.out.println("");

		// while
		System.out.print("Print With while : ");
		int index = 0;
		while (index < z.length) {
			System.out.print(z[index] + " ");
			index++;
		}
		System.out.println("");

		// DO-WHILE
		System.out.print("Print With Do-while : ");
		index = 0;
		do {
			System.out.print(z[index]);
			index++;
		} while (index < z.length);

		System.out.println("");

		// ForEach
		System.out.print("Print With ForEach : ");
		for (int element : z)
			System.out.print(element + " ");

		System.out.println();

		// Using Arrays.toString
		System.out.print("Print With Arrays.toString : ");
		System.out.println(Arrays.toString(z));

	}
}
