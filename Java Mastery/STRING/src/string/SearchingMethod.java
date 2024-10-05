package string;

//indexOf();lastIndexOf();charAt(),contains(),contains(),endsWith()
public class SearchingMethod {
	public static void main(String[] args) {
		String s = "gaurav";
		System.out.println(s.indexOf('a'));// 1 it return integer
		System.out.println(s.indexOf("ga"));// 0

		System.out.println(s.lastIndexOf('a'));// 4

		System.out.println(s.charAt(1));// r it take int value and return char

		System.out.println(s.contains("ga"));// true
		System.out.println(s.contains("g"));// true
		System.out.println(s.endsWith("g"));// false

	}
}
