import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("its a monday");
                System.out.println("It's a weekday.");
                break;
            case 2:
                System.out.println("its a tuesday");
                System.out.println("It's a weekday.");
                break;
            case 3:
                System.out.println("its a wednesday");
                System.out.println("It's a weekday.");
                break;
            case 4:
                System.out.println("its a thursday");
                System.out.println("It's a weekday.");
                break;
            case 5:
                System.out.println("its a friday");
                System.out.println("It's a weekday.");
                break;
            case 6:
                System.out.println("its a saturday");
                System.out.println("It's a weekday.");
                break;
            case 7:
                System.out.println("its a sunday");
                System.out.println("It's a weekend.");
                break;
        }
    }

}
/*
 * : Days of the Week
 * Write a program that uses a nested switch statement to print out the day of
 * the week based on an
 * integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each
 * day, print whether it
 * is a weekday or weekend.
 */