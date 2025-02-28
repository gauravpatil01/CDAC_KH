public class DecrisingTrangle {

    public static void main(String[] args) {
        int pattern = 5;
        for (int i = 1; i <= pattern; i++) {
            for (int j = i; j <= pattern; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}