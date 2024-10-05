package org.solution2;

import java.time.LocalDate;

class Date {
	// feilds
	private int day;
	private int month;
	private int year;

	public Date() {
		// this statement
//		this(0, 0, 0); // constructor chaining //but its must be first statemnt
		this(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear()); // constroctor
																											// chaning
		System.out.println("hello123");
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void printRecord() {
		System.out.println(this.day + " /" + this.month + " /" + this.year);
		System.out.println();
	}

}

public class ConstructorLearn {

	public static void main(String[] args) {

		Date dt1 = new Date();
		dt1.printRecord();

		Date dt2 = new Date(12, 04, 2024);
		dt2.printRecord();
	}

}
