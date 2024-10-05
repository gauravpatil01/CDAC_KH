package org.solution;

import java.time.LocalDate;
import java.util.Scanner;

class Date {
	// feilds
	private int day;
	private int month;
	private int year;
	Scanner sc = new Scanner(System.in);

//	public Date() { // parameter-less comstructor
//		// constructor
//		System.out.println("inside constructor");
//
//		this.day = 0;
//		this.month = 0;
//		this.year = 0;
//
//	}
	
	public Date(int day,int month,int year) { // parameterized comstructor
		// constructor
		System.out.println("inside constructor");
       //feilds    parameter
		this.day = day;
		this.month = month;
		this.year = year;

	}
	

	public void printRecord() {
		System.out.println(this.day + " /" + this.month + " /" + this.year);
	}

}

public class ConstructorLearn {

	public static void main(String[] args) {
		
//		Date dt1 = new Date();   not ok if we not create parameterless constroctor 
		Date dt1 = new Date(23,5,2028);
		dt1.printRecord();

	}

}
