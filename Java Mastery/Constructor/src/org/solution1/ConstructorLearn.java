package org.solution1;

import java.time.LocalDate;
import java.util.Scanner;

class Date {
	// feilds
	private int day;
	private int month;
	private int year;
	Scanner sc = new Scanner(System.in);

	/* public */private Date() { // parameter-less comstructor
		// constructor
		System.out.println("inside constructor");

		this.day = 0;
		this.month = 0;
		this.year = 0;

	}


	public void printRecord() {
		System.out.println(this.day + " /" + this.month + " /" + this.year);
	}
	
	
	//static method
	public static void test() {
		Date dt2 =new Date();
		
	}

}

public class ConstructorLearn {

	public static void main(String[] args) {

//		Date dt1 = new Date();

		Date.test();  //static call

	}

}

/* what we do 
31 ==> create instance of date class
43==> create instance of date class

  if constroctor are public then we can create instance of class
   in inside and outside class
   
   but if constroctor is private then we can only  create create instance in same class only 
   



*/
