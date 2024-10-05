package org.demo2;

class Outer {
	class Inner {

	}
}

public class OuterInner {
	public static void main(String[] args) {
		Outer out = new Outer(); // ok
		Outer.Inner in1 = out.new Inner();

		Outer.Inner in2 = new Outer().new Inner();
	}
}

//non-static nested class behaves like non static method 
//it access using like instence 
