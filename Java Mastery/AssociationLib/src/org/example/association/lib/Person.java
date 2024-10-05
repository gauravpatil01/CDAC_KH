package org.example.association.lib;

public class Person {
	private String name; // Association
	private Date birthdate = new Date(); // Association (composiation)
	private Address currentAddress; // Association()aggrigation

	public Person() {

	}

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.birthdate.setDay(day);
		this.birthdate.setMonth(month);
		this.birthdate.setYear(year);

	}

	public Person(String name, String cityName, String stateName, int pincode) {
		this.name = name;
		this.currentAddress.setCityName(cityName);
		this.currentAddress.setStateName(stateName);
		this.currentAddress.setPincode(pincode);

	}

	public Person(String name, int day, int month, int year, String cityName, String stateName, int pincode) {
		this.name = name;
		this.birthdate.setDay(day);
		this.birthdate.setMonth(month);
		this.birthdate.setYear(year);

		this.currentAddress.setCityName(cityName);
		this.currentAddress.setStateName(stateName);
		this.currentAddress.setPincode(pincode);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	@Override
	public String toString() {

		return this.name + " " + this.birthdate.toString() + " " + this.currentAddress.toString();
	}

}
