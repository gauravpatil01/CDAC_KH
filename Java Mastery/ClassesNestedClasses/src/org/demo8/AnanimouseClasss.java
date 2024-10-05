package org.demo8;

class A {
	public void show() {
		System.out.println("gOOd mOOrning!!");
	}
}

public class AnanimouseClasss {
	public static void main(String[] args) {
		A obj = new A() {
			public void show() {
				System.out.println("gOOd eVeninG!!");
			}
		};
		obj.show();
	}

}
// we can define  {} braces after the statement 
