package org.demo7;

class Outer {
	private int num1 = 10;
	private static int num2 = 20;

	static class Inneer {
		private int num3 = 30;
		private static int num4 = 40;

		public void printRecord() {
//			System.out.println("Num 1  :" +num1); //Not Ok
//			if we want non static then we need to do instance way
			Outer out =new Outer();
			System.out.println("Num1 : "+out.num1);  //now its ok 
			System.out.println("Num 2 :	" + num2);

			System.out.println("Num 3  :" + this.num3);
			System.out.println("Num 4 :	" + Inneer.num4);
		}
	}

}

public class StaticNestedClass {
	public static void main(String[] args) {
		Outer.Inneer ii = new Outer.Inneer();
		ii.printRecord();

	}
}