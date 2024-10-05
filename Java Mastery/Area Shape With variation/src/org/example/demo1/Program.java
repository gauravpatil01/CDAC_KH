package org.example.demo1;

// now we use class and instance 
class Rectangle {
	private float length;
	private float breadth;
	private float area;

	public Rectangle() {
//		todo
	}

	public void setLength(float length) {
		this.length = length;
	}

	public void setBredth(float breadth) {
		this.breadth = breadth;
	}

	public void calculateArea() {
		this.area = this.breadth * this.length;
	}

	public float getArea() {
		return this.area;
	}
}

class Circle {
	private float radius;
	private float area;

	public Circle() {
//		todo
	}
	
	public void setRadius(float radius) {
		this.radius=radius;
		
	}
	public void calculateArea() {
		this.area=(float) (Math.PI * Math.pow(radius, 2));
		
	}
	public float getArea() {
		return this.area;
	}
}

public class Program {

	public static void main(String[] args) {
		Circle c =new Circle();
		c.setRadius(10);
		c.calculateArea();
		
		System.out.println(c.getArea());

	}

	public static void main1(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setBredth(10);
		rect.setLength(5);
		rect.calculateArea();
		System.out.println("Length :	" + rect.getArea());

	}
}
