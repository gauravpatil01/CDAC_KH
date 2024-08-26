public class Q21 {
    public static void main(String[] args) {
        int rows = 5;
        int odd = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print("*");
                }
                System.out.print(odd);
                odd += 2;
            }
            System.out.println();
            odd = 1; 
        }
    }
}
