package org.demo3;

class Outer {
	private int num1 = 10;
	private static int num2 = 20;

	public Outer() {

	}
	class Inner {
		private int num3 =30;
//		private static int num4 =40; //The field num4 cannot be declared static in a non-static inner type, unless initialized with a constant expression
		private final static int num4 =40; //now its allowed static  with final 
	}
	public void printRecord() {
		System.out.println("Num1 : "+this.num1);
		Inner in=new Inner ();
		System.out.println("Num2 : "+Outer.num2);
		System.out.println("Num3 : "+in.num3);// to acces it create instance
		System.out.println("Num4 : "+Inner.num4); // it acces with class name  
	}

}

public class OuterInner {
	public static void main(String[] args) {
		Outer out = new Outer(); // ok
		out.printRecord();
	}
}
//using instance we can access member of nonstatic access class  