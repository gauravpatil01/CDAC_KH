package org.demo6;

import org.demo6.Outer.Inneer;

class Outer {
	private int num1 =10;
	private static int num2=20;
	
	static class Inneer {
		private int num3 =30;
		private static int num4=40;
	}
	
	
	public void printRecord() {
		System.out.println("Num 1  :"+this.num1);
		System.out.println("Num 2 :	"+Outer.num2);
		Inneer in =new Inneer ();
		System.out.println("Num 3  :"+in.num3);
		System.out.println("Num 4 :	"+Inneer.num4);
	}
	
}

public class StaticNestedClass {
	public static void main(String[] args) {
		Outer out =new Outer();
		out.printRecord();
		
		
		
	}
}


//it behaves like static method 
//OPNLY ACCES STATIC MEMBER IN IT 