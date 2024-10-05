package org.demo1;

interface A {
	int num1 = 10;
	int num4 = 40;

	int num5 = 70;

}

interface B {
	int num2 = 20;
	int num4 = 50;

	int num5 = 80;
}

interface C extends A, B {// MULTIPAL INTERFACE INHERITANCE
	int num3 = 30;
	int num4 = 60;
}

public class FieldsInterface {

	public static void main(String[] args) {
		System.out.println("num5 : " + A.num5);// 70
		System.out.println("num5 : " + B.num5);// 80
		// System.out.//println("num5 : "+C.num5);//not ok :The field C.num5 is
		// ambiguous
	}

	public static void main2(String[] args) {
		System.out.println("num4 : " + A.num4);
		System.out.println("num4 : " + B.num4);
		System.out.println("num4 : " + C.num4);
	}

	public static void main1(String[] args) {
		System.out.println("num1 : " + A.num1); // 10
		System.out.println("num2 : " + C.num1);// 10

		System.out.println("num2 : " + B.num2);// 20
		System.out.println("num2 : " + C.num2);// 20

		System.out.println("num3 : " + C.num3);// 30
	}
}
