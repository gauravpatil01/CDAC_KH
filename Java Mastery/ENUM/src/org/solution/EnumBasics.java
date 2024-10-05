package org.solution;

enum Color {
	RED, // PUBLIC STATIC FINAL COLOR RED
	GREEN, BLUE
}

public class EnumBasics {
	public static void main(String[] args) {
		String name ="pink";  //java.lang.IllegalArgumentException
		Color color = Color.valueOf(name);
		
		System.out.println(color.name() + "  " + color.ordinal());

		
	}
	public static void main8(String[] args) {
		String name = "green";
		Color color = Color.valueOf(name.toUpperCase()); // Use toUpperCase to match enum constants
		System.out.println(color.name() + "  " + color.ordinal());

	}

	public static void main7(String[] args) {
		String name = "BLUE";
		Color color = Color.valueOf(name);
		System.out.println(color.name() + "   " + color.ordinal());
	}

	public static void main6(String[] args) {
		String name = "RED";
		Color color = Color.valueOf(name);
//		Color color = color.valueOf(name);
		System.out.println(color.name() + " " + color.ordinal());
	}

	public static void main5(String[] args) {
		Color[] colors = Color.values();
		for (Color color : colors) {
			System.out.println(color.name() + "    " + color.ordinal());

		}
	}

	public static void main4(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1.name()); // RED
		System.out.println(c1.ordinal());// 0

		c1 = Color.GREEN;
		System.out.println(c1.name());// GREEN
		System.out.println(c1.ordinal());// 1

		c1 = Color.BLUE;
		System.out.println(c1.name());// BLUE
		System.out.println(c1.ordinal());// 2

	}

	public static void main3(String[] args) {
		Color co = Color.RED;
		System.out.println(co.ordinal());// 0
		System.out.println(co.name());// RED

	}

	public static void main2(String[] args) {
		System.out.println(Color.RED.ordinal()); // 0
		System.out.println(Color.RED.name()); // RED
	}

	public static void main1(String[] args) {
		System.out.println(Color.RED);
		System.out.println(Color.GREEN);
		System.out.println(Color.BLUE);
	}
}
