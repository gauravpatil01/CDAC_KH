package org.association.test;

import org.example.association.lib.Address;
import org.example.association.lib.Date;
import org.example.association.lib.Person;

public class Program {
	public static void main(String[] args) {
		Person person=new Person();
		person.setName("gaurav");


		Date birthDay =person.getBirthdate();
		birthDay.setDay(23);
		birthDay.setDay(7);
		birthDay.setDay(1983);
		
		Address currAddress =new Address();
		currAddress.setCityName("pune");
		currAddress.setStateName("maharashtra");
		currAddress.setPincode (123456);
		
		person.setCurrentAddress(currAddress);
		System.out.println(person.toString());
	}
	public static void main2(String[] args) {
		Address address =new Address();
		address.setCityName("pune");
		address.setStateName("maharashtra");
		address.setPincode (123456);
		System.out.println(address.toString());
	}
	public static void main1(String[] args) {
		Date date =new Date();
		System.out.println(date.toString());
	}
}
