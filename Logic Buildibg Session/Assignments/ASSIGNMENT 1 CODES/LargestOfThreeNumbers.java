public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        int c = 99;

        if (a > b && a > c) {
            System.out.println(" Number a is greater with value :" + a);
        } else if (b > c) {
            System.out.println("Number b is greater with value :" + b);
        } else {
            System.out.println("Number c is greater with value :" + c);
        }
    }
}
