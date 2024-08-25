public class Snippts15 {
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = (int) (num1 + num2);   //data types, is automatically promoted to the larger data type
        System.out.println(result);   
    } 
}
/*
 * Snippet 15:  
public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 
 What error occurs when compiling this code? How should you handle different data types 
in operations?

// error: incompatible types: possible lossy conversion from double to int
        int result = num1 + num2;   //data types, is automatically promoted to the larger data type
 */