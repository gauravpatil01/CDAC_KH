package string;

public class StringConstructor {
	public static void main(String[] args) {
		String s1 = "Gaurav"; // 1 obj in literal pool
		String s2 = new String("Rahul");// two obj 1 in scp and ;one is heap

		byte [] b = {101, 102,103};//byte array to 
		String s3 = new String(b);
		System.out.println(s3); //byte array to string
		
		char[] ch= {'a','b','c','d'};
		String s4 = new String(ch);
		System.out.println(s4); 
		
//		why char array is prefere over string for password 
		char[] password1 = new char[]{'a','b','c'};
		String password2 = new String("abc");
		System.out.println("password1 use char : "+password1); 
		System.out.println("password1 use String : "+password2); 		
		
		
		
		
		

	}
}
