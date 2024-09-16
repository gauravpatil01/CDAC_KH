package org.solution;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;

	}

	public void eat() {
		System.out.println(name + " eating ");
	}

	public void sleep() {
		System.out.println(name + " sleeping");
	}

	public String getname() {
		return name;
	}

}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	public void bark() {
		System.out.println(getname() + "is barking");
	}
}

public class AnimalInheritance {
	public static void main(String[] args) {
		Animal a1 =new Animal("lion ");
		a1.eat();
		a1.sleep();
		
		Dog d1=new Dog("Buddy ");
		d1.bark();
		d1.eat();
		d1.sleep();
		
	}
}
