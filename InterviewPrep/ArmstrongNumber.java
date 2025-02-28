import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");

        int value = sc.nextInt();
        int num = value, sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }
        System.out.println(num == sum ? "Armstrong " : "Not arm");
    }
}


