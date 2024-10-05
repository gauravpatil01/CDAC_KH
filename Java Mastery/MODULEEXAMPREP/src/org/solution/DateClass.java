package org.solution;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		String pattern = "hh :m:ss";
		SimpleDateFormat sdt = new SimpleDateFormat(pattern);

		Date date = new Date();

		String strTime = sdt.format(date);
		System.out.println(strTime); 
	}

	public static void main3(String[] args) {
		String pattern = "dd:MM:yyyy";

		SimpleDateFormat sdt = new SimpleDateFormat(pattern);

		Date date = new Date();
		String strDate = sdt.format(date);
		System.out.println(strDate);
	}

	public static void main2(String[] args) {
		Date date = new Date();
		System.out.println(date.getDate() + " : " + date.getMonth() + " : " + date.getYear());
	}

	public static void main1(String[] args) {
		LocalDate ldt = LocalDate.now();
		System.out.println("system localDate is " + ldt);
	}
}
