package string;
public class LengthEmptyTrim {
	public static void main(String[] args) {
	String name ="abc      ";//if null then bnot allowed nullpointer exception 
	String email="gaurav@gmail.com";
	String password="abc@123";
//	System.out.println(name.length()); //return integer output
	
//	how to check name is empty  use length
	int check=name.length();
	if(check==0) {
		System.out.println("String is empty");
	}else {
		System.out.println("not empty have "+check + " character");
	}
	
//	how to check String is empty  -->boolean isEmpty
	System.out.println("Email  empty "+email.isEmpty());

//	how to check String is empty trim return String it only remove first and last spaces not center 
	System.out.println("trim "+name.trim());
	
//	absolute length 
	String ss = "   gaurav   ";
	System.out.println("abs length without trim "+ss.length());
	System.out.println("abs length with trim "+ss.trim().length());//Ok
//	System.out.println("abs length with trim "+ss.length().trim());//Not Ok

	
	
	
	
	}
}
