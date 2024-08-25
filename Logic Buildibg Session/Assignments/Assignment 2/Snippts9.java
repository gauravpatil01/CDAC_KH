public class Snippts9 {
    public static void main(String[] args) { 
        int a = 10; 
        System.out.println(a);  //we use identifiers name not keyword 
    } 
}
/*
 * Snippet 9:  
public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
} 
 What error occurs? Why can't reserved keywords be used as identifiers?

Snippts9.java:3: error: ';' expected
        int class = 10; 
           ^
Snippts9.java:3: error: <identifier> expected
        int class = 10; 
                 ^
Snippts9.java:4: error: illegal start of expression
        System.out.println(class); 
                           ^
Snippts9.java:4: error: <identifier> expected
        System.out.println(class);
                                ^
 */