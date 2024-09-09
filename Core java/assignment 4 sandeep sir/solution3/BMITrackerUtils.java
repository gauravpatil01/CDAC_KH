package in.solution3;

import java.util.Scanner;

public class BMITrackerUtils {
	private BMITracker obj;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.println("entre weight(kgs) :");
		double weight = sc.nextDouble();

		System.out.println("entre height(meters) :");
		double height = sc.nextDouble();

		obj = new BMITracker(weight, height);

	}

	public void printRecord() {
		if (obj != null) {
			System.out.println(obj.toString());
		} else {
			System.out.println("no record found");
		}
	}

	public void menuList() {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("print 1 :to Accept");
			System.out.println("print 2 :to print");
			System.out.println("print 3 :to exit");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				acceptRecord();
				break;
			case 2:
				printRecord();
				break;
			case 3:
				System.out.println("exit the loop");
				break;
			default:
				System.out.println("enter a valid entry ");
				break;
			}

		} while (choice != 3);
	}

}
