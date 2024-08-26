// 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 

public class Q11 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        
        int preInc = ++a; 
        System.out.println("After pre-increment, a = " + a + " and preIncrement = " + preInc);

   
        int postDec = b--;
        System.out.println("After post-decrement, b = " + b + " and postDecrement = " + postDec);
    }
}
