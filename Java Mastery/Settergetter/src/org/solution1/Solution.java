//this code is for scanner not use setter getter here 

package org.solution1;

import java.util.Scanner;

class Employee {
	// feilds
	private String name;
	private int empid;
	private int salary;

	public Employee() {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public void acceptrecord(Scanner sc) { // Scanner sc parameter
		System.out.println("enter name :");
		this.name = sc.next();
		System.out.println("enter empid :");
		this.empid = sc.nextInt();
		System.out.println("enter salary :");
		this.salary = sc.nextInt();

	}

	public void printRecord() {
		System.out.println(this.name + " /" + this.empid + " /" + this.salary);
		System.out.println();
	}

}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner
		Employee emp1 = new Employee();
		emp1.acceptrecord(sc); // pass as argument
		emp1.printRecord();
		sc.close(); // close scanner

	}

}
