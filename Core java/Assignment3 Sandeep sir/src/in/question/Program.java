
package in.question;

import java.util.Scanner;

class LoanAmortizationCalculator {

	float principleAmount;
	float anualIntrestRate;
	int yearToLone;
	float monthlyPayment;
	float totalAmountPaid;

	Scanner sc = new Scanner(System.in);

	void acceptRecord() {
		System.out.print("enter principle amount :");
		this.principleAmount = sc.nextFloat();

		System.out.print("enter anualIntrestRate :");
		this.anualIntrestRate = sc.nextFloat();

		System.out.print("enter yearToLone :");
		this.yearToLone = sc.nextInt();
	}
//monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)

	void calculateMonthelyPayment() {
		double monthlyInterestRate = anualIntrestRate / 12 / 100;
		int numberOfMonth = yearToLone * 12;

		monthlyPayment = (float) (principleAmount
				* (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonth))
				/ (Math.pow(1 + monthlyInterestRate, numberOfMonth) - 1));
		totalAmountPaid = monthlyPayment * numberOfMonth;

	}

	void printrecord() {
		System.out.println("your monthly payment is :" + monthlyPayment);
		System.out.println("your totalAmountPaid to paid is :" + totalAmountPaid);
	}
}

public class Program {

	public static void main(String[] args) {
		LoanAmortizationCalculator obj = new LoanAmortizationCalculator();
		Scanner sc = new Scanner(System.in);
		obj.acceptRecord();
		obj.calculateMonthelyPayment();
		obj.printrecord();
	}

}
