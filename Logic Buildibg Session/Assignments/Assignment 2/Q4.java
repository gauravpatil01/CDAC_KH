import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total parchase amount ");
        float totalPurchase = sc.nextFloat();

       

        if (totalPurchase >= 1000) {
            float result = totalPurchase * 0.80f;
            float discount = totalPurchase - result;

            System.out.println("your total parchese is : " + totalPurchase + " you get discount of " + discount
                    + " your final amount to be paid is " + result);

        } else if (totalPurchase > 500) {

            float result = totalPurchase * 0.90f;
        float discount = totalPurchase - result;
            System.out.println("your total parchese is : " + totalPurchase + " you get discount of " + discount
                    + " your final amount to be paid is " + result);

        } else if (totalPurchase < 500) {
            float result = totalPurchase * 0.95f;
        float discount = totalPurchase - result;
            System.out.println("your total parchese is : " + totalPurchase + " you get discount of " + discount
                    + " your final amount to be paid is " + result);

        }

       

    }

}
/*
 * : Discount Calculation
 * Write a program to calculate the discount based on the total purchase amount.
 * Use the following
 * criteria:
 *  If the total purchase is greater than or equal to Rs.1000, apply a 20%
 * discount.
 *  If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 *  If the total purchase is less than Rs.500, apply a 5% discount.
 * Additionally, if the user has a membership card, increase the discount by 5%.
 */



 //OR


 /*
  * 
import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: Rs. ");
        double totalPurchase = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next();

        double discount = 0;

        if (totalPurchase >= 1000) {
            discount = 0.20;
        } else if (totalPurchase >= 500) {
            discount = 0.10;
        } else {
            discount = 0.05;
        }

        if (membership.equalsIgnoreCase("yes")) {
            discount += 0.05;
        }

        double discountAmount = totalPurchase * discount;
        double finalPrice = totalPurchase - discountAmount;

        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Discount amount: Rs. " + discountAmount);
        System.out.println("Final price after discount: Rs. " + finalPrice);
    }
}



  */