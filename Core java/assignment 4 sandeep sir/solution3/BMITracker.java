package in.solution3;

public class BMITracker {
	private double weight;
	private double height;

	public BMITracker(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;

	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateBMI() {
		return weight / (height * height);

	}

	public String classifyToBMI() {
		double bmi = calculateBMI();
		if (bmi < 18.5) {
			return "You are underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Normal weight";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

	public String toString() {
		return "Your height is: " + height + "\nYour weight is: " + weight + "\nYour BMI is: " + calculateBMI()
				+ "\nYou are classified as: " + classifyToBMI();
	}

}
