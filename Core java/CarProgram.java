package org.solution;

class Vehical {
	private String make;
	private int year;

	public Vehical(String make, int year) {
		this.make = make;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}

}

class Car extends Vehical {
	private String model;

	public Car(String make, int year, String model) {
		super(make, year);
		this.model = model;
	}

	public void dispalyDetails() {
		System.out.println(getMake());
		System.out.println(getYear());
		System.out.println(model);
	}
}

public class CarProgram {
	public static void main(String[] args) {
		Car c1 = new Car("maruti", 2024, "swift");
		c1.dispalyDetails();
	}
}
