package org.solution;

enum Day {
	SUN("sunday"), MON("monday"), TUES("tuesday");

	private String name;

	private Day(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class EnumDemo3 {

	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			System.out.println(day.name() + " " + day.ordinal() + " " + day.getName());
		}
	}

	public static void main1(String[] args) {
		Day day = Day.SUN;
		System.out.println("name  " + day.name());
		System.out.println("ordinal   " + day.ordinal());
		System.out.println("literal  " + day.getName());

	}
}
