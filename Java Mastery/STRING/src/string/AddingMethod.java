package string;

//concat;join(delimeter,charsequencec...);subSequence(start index,end-1 index);
//substring()take 1 or two argument and start to end value get
public class AddingMethod {
	public static void main(String[] args) {
		String s1 = "Gaurav";
		String s2 = " patil";
		System.out.println(s1 + s2);// Gaurav patil
		System.out.println(s1 + 10);// Gaurav10
		System.out.println(10 + 10 + s1 + 10);// 20Gaurav10
		System.out.println(s1 + 10 / 2);// Gaurav5 -->follow presendence
//		System.out.println(s1 + 10-5);// error

//		concat
		System.out.println("use concat :" + s1.concat(s2));

		// join//null at delemeter not allowed
		System.out.println("Join (delemeter)(charsequence take multiple character here)" + String.join(",", s1, s2));
//		join is static method 

		String ss = "gaurav pratap patil";
		System.out.println("Sub sequence 0 to 6: " + ss.subSequence(0, 7)); // star to end -1
		System.out.println("substring: " + ss.substring(0, 7)); 

	}
}
