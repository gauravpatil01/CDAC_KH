package Declare_ANONYMOUS_DEMO4;
//single time use 
public class AnonymousMain {
	static void sum(int [] no) {
		int total =0;
		for(int element:no) {
			total=total+element;
		}System.out.println("Sum is:"+ total);
		
	}
	public static void main(String[] args) {
		AnonymousMain.sum(new int [] {10,20,30});
	}
}
// array without name ;
//created and initilize in single line 
//single or multidimensional 
//use only one 
//use as method agrgument 