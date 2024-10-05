package string;

public class ConversionMethod {
	public static void main(String[] args) {
		String s1 = "Gaurav";
		System.out.println(s1.toUpperCase());// GAURAV
		System.out.println(s1.toLowerCase());// gaurav
		// -------------------------------------------------------------
		// valueOf -->its a static method-->convert to String
		int a = 10;
		String s2 = String.valueOf(a); // value of static method
		System.out.println(s2);// 10

		// charArray
		char[] c = s1.toCharArray();
		System.out.println(c);// Gaurav
		
		
	}
}
