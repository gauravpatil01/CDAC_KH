package org.demo1;

/* I3 EXTENDS I1 AND I2 //OK MULTIPLE INHERITANCE INHERITANCE 
   JAVA SUPPORT MULTIPLE INTERFACE INHERITANCE
* 
* 
* C1 IMPLEMENTS I1,I2 //OK MULTIPLE INTERFACE IMPLEMENTATION INHERITANCE JAVA
* SUPPORT MULTIPLE INTERFACE IMPLEMENTATION INHERITANCE
* 
* 
* C3 EXTENDS C1,C2 //NOT OK MULTIPLE INHERITANCE JAVA DO NOT SUPPORT MULTIPLE
* INHERITANCE*/

interface sample {
	// fields
	// nested type
	// abstract method
	// default method
	// static interface method
}

interface Printable { // ISI
//	int num1;//Not ok : The blank final field num1 may not have been initialized
	int number = 10;

	// Implicitly is :public static final int number =10 : interface bydefault final
	// printable(){} //constructor not present in interface
//	void print() {} //Abstract methods do not specify a body
	void print(); // ok
//	public abstract void print(); OK

}

//service provider
class PrintableImpl implements Printable {
	public void print() {
		System.out.println("Num is : " + Printable.number);
	}
}

public class InterfaceSyntax {
	// service consumer

	public static void main(String[] args) {
		Printable obj = new PrintableImpl();
		obj.print(); // upcasting
	}

	public static void main1(String[] args) {
		PrintableImpl obj = new PrintableImpl();
		obj.print();
	}
}

/*
 * interface I1,I2,I3 AND CLASSES C1,C2,C3
 * 
 * I2 IMPLEMENTS I1 //NOT OK I2 EXTENDS I1 //OK INTERFACE INHERITANCE
 *
 * 
 * I3 EXTENDS I1 AND I2 //OK MULTIPLE INHERITANCE INHERITANCE JAVA SUPPORT
 * MULTIPLE INTERFACE INHERITANCE
 * 
 * I1 EXTENDS C1 //NOT OK SUPERTYPE OF INTERFACE MUST BE INTERFACE
 * 
 * C1 EXTENDS I1 //NOT OK C1 IMPLEMENTS I1 //OK INTERFACE IMPLEMENTATION
 * INHERITANCE
 * 
 * C1 IMPLEMENTS I1,I2 //OK MULTIPLE INTERFACE IMPLEMENTATION INHERITANCE JAVA
 * SUPPORT MULTIPLE INTERFACE IMPLEMENTATION INHERITANCE
 * 
 * C2 IMPLEMENTS C1 // NOT OK ;EXTENDS NOT IMPLEMENT C2 EXTENDS C1 // OK
 * 
 * C3 EXTENDS C1,C2 //NOT OK MULTIPLE INHERITANCE JAVA DO NOT SUPPORT MULTIPLE
 * INHERITANCE C2 IMPLEMENTS I1 EXTENDS C1 //NOT OK C2 EXTENDS C1 IMPLEMENT L1
 * //NOT OK C2 EXTENDS C1 IMPLEMENT L1,L2,L3 //OK
 * 
 *
 * 
 */
