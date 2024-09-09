package in.solution4;

import java.util.Scanner;

public class DiscountCalculatorUtils {
	private DiscountCalculator obj;
	private static Scanner sc = new Scanner(System.in);

	public void acceptprice() {
		System.out.println("ACCEPT ORIGINAL PRICE");
		float  originalPrice =sc.nextFloat();
//		obj.setoriginalPrice(10000.0f);
		System.out.println("discounted percentage ");
		float discountPercentage =sc.nextFloat();

		obj = new DiscountCalculator(originalPrice, discountPercentage);
	}
	
	public void printRecord() {
		if(obj!=null) {
			System.out.println(obj.toString());
		}else {
			System.out.println("you need to insert original price");
		}
	}
	
	public void menuList() {
		int choice ;
		do {
		System.out.println("enter 1 to Accept ");
		System.out.println("enter 2 to print ");
		System.out.println("enter 3 to exit ");
		
		choice =sc.nextInt();
		
		switch(choice) {
		case 1 :
			acceptprice();
			break;
		case 2 :
			printRecord();
			break;
			
		case 3:
			System.out.println("ohk you exit ");
			break;
		default :
			System.out.println("enter valid entry please");
		}}
		while(choice != 3);
	}

}
