//do not want to write accept record and print record 
package org.solution4;

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

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner
		Employee emp = new Employee();
		
		emp.setName("gaurav");
		emp.setEmpid(3);
		emp.setSalary(102586);
		
		String name =emp.getName();
		System.out.println("name :"+name);
		int empid =emp.getEmpid();
		System.out.println("empid : "+empid);
		int salary =emp.getSalary();
		System.out.println("salary"+salary);
		
		//but problem is its a hardcoded value 
	}

}
