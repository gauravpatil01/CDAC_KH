package org.demo1;

interface Test {
	void f1();

	void f2();

	void f3();

}

abstract class TestImp implements Test {
	@Override public void f1() { }
	@Override public void f2() { }
	@Override public void f3() { }
}

class X extends TestImp {
	public void f1() {
		System.out.println("f1");
	}
}

class Y extends TestImp {
	public void f2() {
		System.out.println("f2");
	}
}

class Z extends TestImp {
	public void f3() {
		System.out.println("f2");
	}
}

public class Question {
public static void main(String[] args) {
		Test t1 =new X();
		t1.f1();
		Test t2 =new Y();
		t2.f2();
		Test t3 =new Z();
		t3.f3();
}
}
