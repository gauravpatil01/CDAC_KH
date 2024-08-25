public class Snippts17 {
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        //int result = a ** b; // error: illegal start of expression
        double result =Math.pow(a,b);  // or we use Math.pow instade
        System.out.println(result); 
    } 
    

}
/*
 * Snippet 17:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 
 What compilation error occurs? Why is the ** operator not valid in Java?
 */