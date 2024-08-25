public class Snippts10 {
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 

        Snippts10 obj =new Snippts10();
        obj.display(); 
        obj.display(5); 
    } 
}




/*
 *
 * Snippet 10:  
public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 
 What happens when you compile and run this code? Is method overloading allowed? 


here we need to create object using new keyword or create method static 
 */