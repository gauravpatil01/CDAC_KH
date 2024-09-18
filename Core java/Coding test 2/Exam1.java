
import java.util.Scanner;

public class Exam1 {

	public static int gcd(int[] numbers) {
		int a = numbers[0];
		int b = numbers[1];

		System.out.println("Calculating GCD of " + a + " and " + b);
		while (b != 0) {
			int remainder = a % b;
			System.out.println("a:" + a + ", b:" + b + ", remainder:" + remainder);
			a = b;
			b = remainder;
		}
		System.out.println("Final GCD: " + a);
		return a;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[2];
		System.out.print("Enter the firs integer: ");
		numbers[0] = scanner.nextInt();
		System.out.print("Enter the second integer: ");
		numbers[1] = scanner.nextInt();


		int gcdResult = gcd(numbers);

		System.out.println("The GCD of " + numbers[0] + " and " + numbers[1] + " is: " + gcdResult);

		scanner.close();
	}

}