public class Q19 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
