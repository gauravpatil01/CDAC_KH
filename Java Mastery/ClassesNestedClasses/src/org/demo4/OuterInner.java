package org.demo4;

class Outer {
	private int num1 = 10;
	private static int num2 = 20;

	public Outer() {

	}

	class Inner {
		private int num3 = 30;
		private final static int num4 = 40;

		public Inner() {

		}

		public void printRecord() {
			System.out.println("Num1 : " + num1);

			System.out.println("Num2 : " + num2);
			System.out.println("Num3 : " + this.num3);
			System.out.println("Num4 : " + Inner.num4);
		}
	}

}

public class OuterInner {
	public static void main(String[] args) {
		Outer.Inner in1 = new Outer().new Inner();
		in1.printRecord();

	}
}