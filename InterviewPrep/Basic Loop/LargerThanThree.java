public class LargerThanThree {
    public static void main(String[] args) {
        int a = 20;
        int b = 100;
        int c = 500;

        if (a > b && a > c) {
            System.out.println("A is greater");
        } else if (b > c) {
            System.out.println("B is greater ");
        } else {
            System.out.println("c is greater");
        }
    }
}
