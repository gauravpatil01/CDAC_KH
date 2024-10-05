package org.solution;

class Outer {
	private int num = 10;

	class Inner {
		private int num2 = 20;
		int num3=30;

		public  void printRecord() {
			int num3=40;
			System.out.println(num3);
			System.out.println(this.num3);
			System.out.println(this.num2);
			System.out.println(Outer.this.num);

		}
	}
}

public class OuterInner {
	public static void main(String[] args) {
		Outer.Inner in1 =new Outer().new Inner();
		in1.printRecord();
	}
}


//acces outer class variable in inner class 