//problemyou want change name  to lower case 

package org.solution3;

import java.util.Scanner;

class Employee {
	// feilds
	private String name;
	private int empid;
	private int salary;

//	public Employee() {
//		this.name = name;
//		this.empid = empid;
//		this.salary = salary;
//	}

	public void acceptrecord(Scanner sc) { // Scanner sc parameter
		System.out.print("enter name   :");
		this.name = sc.next();
		System.out.print("enter empid  :");
		this.empid = sc.nextInt();
		System.out.print("enter salary :");
		this.salary = sc.nextInt();

	}

	public String getName() {
		return this.name;
	}

	public void setName(/* Employee this */String name) {
		this.name = name;
	}

	public int getEmpid() {
		return this.empid;
	}

	public void setEmpid(/* Employee this */int empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(/* Employee this */int salary) {
		this.salary = salary;
	}

	public void printRecord() {
		System.out.print(" :" + this.name);
		System.out.print(" :" + this.empid);
		System.out.print(" :" + this.salary);
		System.out.println("");
	}

}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner
		Employee emp2 = new Employee();

		emp2.acceptrecord(sc);
		emp2.printRecord();

		// here we want to read existing salary and then change
		// Float emp =emp.salary; //not ok private

		int sal = emp2.getSalary(); // call method getsalary
		sal = sal + 15000; // salary get
		emp2.setSalary(sal); // set salary new one
		emp2.printRecord(); // print record

		String name = emp2.getName();
		name = name.toUpperCase();
		emp2.setName(name);
		emp2.printRecord();

		int empid = emp2.getEmpid();
		empid = empid + 120;

		emp2.setEmpid(empid);
		emp2.printRecord();
	}

}
