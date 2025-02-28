// package RajaSoft;

public class PrimeNumber {

    public static void checkPrime(int num) {
        int temp = 0;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                temp = 1;
            }
        }
        if (temp == 0) {
            System.out.println("PRIME");
        } else {
            System.out.println("Not A Prime");
        }

    }

    public static void displayTillNumber(int num) {
        int temp = 0;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
            } else {
                temp = 0;
            }
        }
    }

    public static void main(String[] args) {
        int number = 10;

        System.out.println("PRime or not ");
        checkPrime(number);
        System.out.println();


        System.out.println("All Range to the number");
        System.out.println();
        displayTillNumber(number);
    }

    public static void main2(String[] args) {
        int temp = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
            } else {
                temp = 0;
            }
        }
    }

    public static void main1(String[] args) {
        int number = 7;
        int temp = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("prime ");
        } else {
            System.out.println("not a prime");
        }
    }
}
