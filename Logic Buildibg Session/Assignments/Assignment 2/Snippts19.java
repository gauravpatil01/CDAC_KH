public class Snippts19 {
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b;            // it will compile but at run time throw  java.lang.ArithmeticException:
        System.out.println(result); 
    } 
    
}
/*
 * 
 * Snippet 19:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 
 What runtime exception is thrown? Why does division by zero cause an issue in Java? 
 */