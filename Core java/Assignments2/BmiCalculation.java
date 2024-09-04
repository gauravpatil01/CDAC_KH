/*
bmi =weight in kg / height(m)^2
*/

public class BmiCalculation {
    public static void main(String[] args) {
        double weigth=70;
        double heightInMeter =1.75;
        double bmi= weigth / (heightInMeter*heightInMeter);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");}
         else {
            System.out.println("obisity.");
        }
        
    }
    
}
