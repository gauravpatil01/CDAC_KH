package string;

//replace("old char", "new char");replaceAll();replace()
public class UpdateMethod {
public static void main(String[] args) {
	String s1 ="this is a demo ";
	System.out.println(s1.replace("is", "was"));//thwas was a demo 
	System.out.println(s1.replaceFirst("is","demo"));//thdemo is a demo 
	System.out.println(s1.replaceAll("is", "was"));//thwas was a demo 
	System.out.println(s1.replaceAll("is(.)", "was"));//thwaswasa demo 
	System.out.println(s1.replaceAll("is(.*)", "was"));//thwas
	
	System.out.println("in replace -->regular expression not  allowed ");
	System.out.println("in replaceAll -->regular expression  allowed ");

}

}
