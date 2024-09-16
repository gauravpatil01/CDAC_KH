package in.solution1;

import java.util.Scanner;

/*Declare a single-dimensional array as a field inside a class and
 *  instantiate it inside the class constructor.
 *  Define methods named acceptRecord and printRecord within the class and test their functionality*/
class Testing {
	int[] arr; // feild

	public Testing(/* this */ int size) {
		this.arr = new int[size]; // inside constructor initilize
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter" + arr.length + " element ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
	}

	public void printrecord() {
		System.out.println("printung element");
		for (int element : arr) {

			System.out.println(element);
		}
	}
}

public class Program7 {
	public static void main(String[] args) {
		Testing obj = new Testing(5);
		obj.acceptRecord();
		obj.printrecord();
	}
}
