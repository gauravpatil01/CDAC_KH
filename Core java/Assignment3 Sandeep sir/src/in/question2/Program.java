package in.question2;

import java.util.Scanner;

class CompoundInterestCalculator {
	float initalInvestment;
	float annualInterestRate;
	float comnpoundInterestRate;
	float duration;;
	float futureValue;
	float totalIntrest;

	Scanner sc = new Scanner(System.in);

	void acceptRecord() {
		System.out.print("enter initalInvestment :");
		this.initalInvestment = sc.nextFloat();

		System.out.print("enter annualInterestRate :");
		this.annualInterestRate = sc.nextFloat();

		System.out.print("enter comnpoundInterestRate :");
		this.comnpoundInterestRate = sc.nextFloat();

		System.out.print("enter duration :");
		this.duration = sc.nextFloat();
	}

	void calculateFutureValue() {
		double rate = annualInterestRate / 100;

		futureValue = initalInvestment
				* (float) Math.pow((1 + rate / comnpoundInterestRate), comnpoundInterestRate * duration);
		totalIntrest = futureValue - initalInvestment;
	}

	void printRecord() {
		System.out.println("future value : " + futureValue);
		System.out.println(" totalIntrest : " + totalIntrest);
	}

}

public class Program {

	public static void main(String[] args) {
		CompoundInterestCalculator obj = new CompoundInterestCalculator();
		obj.acceptRecord();
		obj.calculateFutureValue();
		obj.printRecord();

	}

}
