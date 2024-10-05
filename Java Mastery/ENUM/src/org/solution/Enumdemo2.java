package org.solution;

enum Day{
	SUN("Sunday");

	private String name;

	private Day(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class Enumdemo2 {
	public static void main(String[] args) {
		Day day =Day.SUN;
		System.out.println("name : "+day.name());
		System.out.println("ordinal:" + day.ordinal());
		System.out.println("Literal :"+ day.getName());
	}
}
