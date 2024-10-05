package string;

//equals();equalsIgnoreCase()
//compareTo -->lexigraphically
//compareToIgnoreCase
public class CompairMethod {
	public static void main(String[] args) {
		String s1 = "deepak";
		String s2 = "Deepak";

		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2));// true

//	check empty or not string
		System.out.println(s1.equals(""));// false

		System.out.println("next methods ");

// compairTo return integer
		String s3 = "a";// 97 //assci value
		String s4 = "A";// 65

		System.out.println(s3.compareTo(s4));// 97-65-->32
		System.out.println(s3.compareToIgnoreCase(s4));// 97-65-->32

//		calculate length without using length
		String ss = "gaurav";
		String ssn = "";
		System.out.println("length calculated using compair to " + ss.compareTo(ssn));

//		
	}
}
