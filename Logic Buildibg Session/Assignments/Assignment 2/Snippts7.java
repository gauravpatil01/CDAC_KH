/*
Snippet 7:  
public class Main { 
    public static void main(String[] args) { 
        int x = "Hello"; 
        System.out.println(x); 
    } 
} 
 What compilation error do you see? Why does Java enforce type safety?
error: incompatible types: String cannot be converted to int because java is typed language 
*/

public class Snippts7 {
    public static void main(String[] args) { 
        // int x = "Hello"; 
        String x = "Hello"; 
        System.out.println(x); 
    } 
}
