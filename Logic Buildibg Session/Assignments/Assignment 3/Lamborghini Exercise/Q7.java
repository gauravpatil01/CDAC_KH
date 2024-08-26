// 7. Write a program to calculate the sum of the digits of the number 9876. The output should be 

public class Q7 {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }

}
