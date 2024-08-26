// Write a program to compute the factorial of the number 10.
public class Q2 {
    public static void main(String[] args) {
        int n = 10;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
