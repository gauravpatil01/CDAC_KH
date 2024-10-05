//after print user defined value now cleare main method  and declare all setter getter method in top class
//usinng helper class 

package org.solution6;

import java.util.Scanner;

class Employee {
	// feilds
	private String name;
	private int empid;
	private int salary;

	public Employee() {
		this("", 0, 0);
	}

	public Employee(String name, int empid, int salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
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

}

class EmployeeUtils {
	private Employee emp = new Employee();  // now its a feild

	// method for accept record
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in); // scanner
		System.out.print("Name :");
		emp.setName(sc.nextLine());

		System.out.print("Empid :");
		emp.setEmpid(sc.nextInt());

		System.out.print("salary :");
		emp.setSalary(sc.nextInt());

	}

	public void printRecord() {

		System.out.println("name :" + emp.getName());
		System.out.println("empid : " + emp.getEmpid());
		System.out.println("salary" + emp.getSalary());
	}

}

public class Solution {

	public static void main(String[] args) {

		EmployeeUtils util = new EmployeeUtils(); // instance of EmployeeUtils
		util.acceptRecord();
		util.printRecord();

	}

}
