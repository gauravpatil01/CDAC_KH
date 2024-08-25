/*
 * Snippet 6:  
public class Main { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
} 
 What error occurs? Why must variables be declared?

error: cannot find symbol error comes 
 * 
 */
public class Snippet6 {
    public static void main(String[] args) {
        int y=0;
        int x = y + 10;
        // int y = 0;              if we declare here not run becayse it use before 
        System.out.println(x);
    }

}
