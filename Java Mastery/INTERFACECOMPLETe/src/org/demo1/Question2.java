package org.demo1;

interface P {
	void f1();
	void f3();

}
interface Q{
	void f2();
	void f3();
}
abstract class S {
	public abstract void f3();
}

class R extends S implements P,Q{
	public void f1() {
		 System.out.println("p class F1 method");
	}
	public void f2() {
		 System.out.println("p class F1 method");
	}
	public void f3() {
		System.out.println("inside f3 override one time only ");
	}
}
public class Question2 {
	public static void main(String[] args) {
		P p =new  R ();  //upcasting
		p.f1();
		p.f3();
		System.out.println("**********");
		Q q =new R ();  //upcasting
		q.f2();
		q.f3();
		System.out.println("**********");
		S s=new R();
		s.f3();
	}
	public static void main1(String[] args) {
		R r =new R();
		r.f1();
		r.f2();
		
	}
}
