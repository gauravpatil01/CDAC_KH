package in.question4;

import java.util.Scanner;

class DiscountCalculator {
	float ogprice;
	float discountpercentage;
	float discountAmount;
	float finalPrice;
	Scanner sc = new Scanner(System.in);

	void acceptRecord() {
		System.out.println("enter original price:");
		this.ogprice = sc.nextFloat();
		System.out.println("enter discountpercentage");
		this.discountpercentage = sc.nextFloat();
	}
	void calculateDiscount() {
		discountAmount=  ogprice * (discountpercentage / 100);
//		Final Price Calculation: finalPrice = originalPrice
		finalPrice=ogprice - discountAmount;
	
	}
	void printRecord() {
		System.out.println("discounted amount:"+discountAmount);
		System.out.println("final:"+finalPrice);
				
	}
}

class Program {
	public static void main(String[] args) {
		DiscountCalculator obj = new DiscountCalculator();
		obj.acceptRecord();
		obj.calculateDiscount();

		obj.printRecord();

	}
}
