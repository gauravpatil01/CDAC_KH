package in.solution2;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	private CompoundInterestCalculator obj;

	public void acceptRecoprd() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter initalInvestment : ");
		float initalInvestment = sc.nextFloat();

		System.out.println("enter annualInterestRate : ");
		float annualInterestRate = sc.nextFloat();

		System.out.println("enter comnpoundInterestRate : ");
		float comnpoundInterestRate = sc.nextFloat();

		System.out.println("enter duration: ");
		float duration = sc.nextFloat();

		obj = new CompoundInterestCalculator(initalInvestment, annualInterestRate, comnpoundInterestRate, duration);
	}

	public void printRecord() {
		if (obj != null) {
			System.out.println(obj.toString());
		} else {
			System.out.println("No record to display.");
		}
	}

	public void menuList() {
			Scanner sc=new Scanner (System.in);
			int choice;
			do {
				System.out.println();
	            System.out.println("ENTER 1 accept RECORD :");
	            System.out.println("ENTER 2 print RECORD :");
	            System.out.println("ENTER 3 FOR EXIT :");
	            choice = sc.nextInt();
	            
	            switch (choice) {
	            case 1:acceptRecoprd();
	            break;
	            case 2:
	            	printRecord();
	            	break;
	            case 3 :
	            	System.out.println("you wanr to exit press 3");
	            	default:
	            		System.out.println("not valid entry ");
	            }
			}while (choice!=3);
			
			
	}

}