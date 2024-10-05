package org.demo5;

class Outer {
	private int num1 = 10;
	//reference to inner class object
	
	class Inner {
		private int num1 = 20;
		

		public void printRecord() {
			int num1=30;
			
			System.out.println(Outer.this.num1);
			System.out.println(this.num1);
			System.out.println(num1);
		}
	}

}

public class OuterInner {
	public static void main(String[] args) {
		Outer.Inner in1 = new Outer().new Inner();
		in1.printRecord();

	}
}