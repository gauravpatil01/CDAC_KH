public class ReverseNumber {
    public static void main(String[] args) {
        int number =123;                                                                                                number = 123;
        int remender = 0;
        int reverse = 0;

        while (number != 0) {
            remender = number % 10;
            reverse = reverse * 10 + remender;
            number = number / 10;

        }
        System.out.println(reverse);

    }
}