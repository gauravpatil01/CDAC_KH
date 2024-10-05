//want to print user defined value now 

package org.solution5;

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

		System.out.print("Name :");
		emp.setName(sc.nextLine());

		System.out.print("Empid :");
		emp.setEmpid(sc.nextInt());

		System.out.print("salary :");
		emp.setSalary(sc.nextInt());

		System.out.println("name :" + emp.getName());
		System.out.println("empid : " + emp.getEmpid());
		System.out.println("salary" + emp.getSalary());

		sc.close();
	}

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner
		Employee emp = new Employee();

		System.out.println("Name :");
		String name = sc.nextLine();
		emp.setName(name);

		System.out.println("Empid :");
		int empid = sc.nextInt();
		emp.setEmpid(empid);

		System.out.println("salary :");
		int salary = sc.nextInt();
		emp.setSalary(salary);

		System.out.println("name :" + emp.getName());

		System.out.println("empid : " + emp.getEmpid());

		System.out.println("salary" + emp.getSalary());

		sc.close();
	}

}
