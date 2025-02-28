public class Lcm {
    public static void main(String[] args) {
        System.out.println("hello");
        int a = 4;
        int b = 6;
        int og_a=a;
        int og_b=b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        System.out.println("Gcd is  : " + a);

        int lcm = (og_a * og_b) / a;
        System.out.println(" lcm is : "+lcm);
    }
}
