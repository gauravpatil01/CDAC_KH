package org.solution;

class Student{
	private String name;
	private int rollnumber;
	private char grade;
	
	public Student(String name,int rollnumber,char grade) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.grade=grade;
	}
	public void showRecord() {
		System.out.println("Student Name is : "+name);
		System.out.println("Student Rollnumber is :"+rollnumber);
		System.out.println("Student grade is : "+grade);
	}
	
}

public class StudentInheritance {
	public static void main(String[] args) {
		Student s1=new Student("gaurav", 3, 'A');
		s1.showRecord();
		
		

	}
}
