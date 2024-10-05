//problem statement if you enter wrong value then 
//then  you have to re-enter name for that you shoud need to run whole  method  
// no 
//use setter getter 

package org.solution2;

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
		System.out.print("enter name   :");
		this.name = sc.next();
		System.out.print("enter empid  :");
		this.empid = sc.nextInt();
		System.out.print("enter salary :");
		this.salary = sc.nextInt();

	}


	public void setName(/* Employee this */String name) {
		this.name = name;
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
		System.out.print(" :"+this.name );
		System.out.print(" :"+this.empid );
		System.out.print(" :"+this.salary );
		System.out.println("");
	}

}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner
		Employee emp2 = new Employee();
		
		emp2.acceptrecord(sc);
		emp2.printRecord();
		
		// here we want to read existing salary and thene change
		// Float emp =emp.salary; //not ok private
		
		int sal = emp2.getSalary(); // call method getsalary
		sal = sal + 15000;           //salary get 
		emp2.setSalary(sal);             //set salary new one 
		emp2.printRecord();               //print record 
	}

	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner
		Employee emp1 = new Employee();
		emp1.acceptrecord(sc);
		emp1.printRecord();
		sc.close();

		emp1.setName("Gaurav"); // (emp1.setName(emp1)) //setname method kiske upar call kiya he emp ke upar
		emp1.printRecord();

		// if emp id change
		emp1.setEmpid(15); // emp1.setEmpid(emp1 ,15) //internal call
		emp1.printRecord();

//		if salary also change

		emp1.setSalary(1500055); // emp1.setEmpid(emp1 ,15) //internal call
		emp1.printRecord();

	}

}
