package in.question3;

import java.util.Scanner;

class BMItracker {
	float weight;
	float height;
	float bmi;
	// ⦁ BMI Calculation: BMI = weight / (height * height)
	Scanner sc = new Scanner(System.in);

	void acceptRecord() {
		System.out.println("entre weight(kgs) :");
		this.weight = sc.nextFloat();

		System.out.println("entre height(meters) :");
		this.height = sc.nextFloat();

	}

	void calculateBMI() {
		bmi = weight / (height * height);
		System.out.println("bmi is " + bmi);
	}

	void classifyBMI() {
		if (bmi < 18.5) {
			System.out.println("Underweight: BMI = " + bmi);
		} else if (bmi >= 18.5 && bmi < 24.9) {
			System.out.println("Normal weight: BMI = " + bmi);
		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("Overweight: BMI = " + bmi);
		} else if (bmi >= 30) {
			System.out.println("Obese: BMI = " + bmi);
		}
	}

	void printRecord() {
		calculateBMI();
		classifyBMI();

	}

}

class Program {
	public static void main(String[] args) {
		BMItracker obj = new BMItracker();
		obj.acceptRecord();
//		obj.calculateBMI();
//		obj.classifyBMI();
		obj.printRecord();
	}
}