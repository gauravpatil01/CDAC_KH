package org.demo1;
interface Aa{
	void f1();
	
}
abstract class Bb implements Aa{
	void f2() {
		
	}
}
class Cc implements Aa{
	@Override 
	public void f1() {
		System.out.println("C.f1");
	}
	
}
public class MethodInterface {
public static void main(String[] args) {
	
}
}
