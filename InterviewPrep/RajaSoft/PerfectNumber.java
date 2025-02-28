import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        System.out.println(num == sum ? "Perfect Number" : "Not a Perfect Number"); // निकाल दाखवा
        sc.close();
    }
}
