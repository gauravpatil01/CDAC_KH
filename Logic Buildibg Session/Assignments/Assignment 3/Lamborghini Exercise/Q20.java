public class Q20 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                if (j < rows) {
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
