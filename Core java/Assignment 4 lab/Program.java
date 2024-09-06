// package org.solution;

import java.util.Scanner;

   class Employee {
	private int empid;
	private String empName;
	private float salary;
	private String location;
	
	Scanner sc = new Scanner(System.in);

	void acceptRecord() {
		
		
		
		System.out.print("enter employee id : ");
		empid = sc.nextInt();
		

		System.out.print("enter employee empname : ");
		empName = sc.next();

		System.out.print("enter employee salary : ");
		salary = sc.nextFloat();

		System.out.print("enter employee  location : ");
		location = sc.next();

	}

	void printRecord() {
		System.out.println("name   :" +empid);
		System.out.println("empid  :" + empName);
		System.out.println("salary   :"+salary);
		System.out.println("salary   :"+location);
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.acceptRecord();
		emp1.printRecord();
		
		Employee emp2 = new Employee();
		emp2.acceptRecord();
		emp2.printRecord();
	}
}
