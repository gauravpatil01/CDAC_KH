public class SquareAndCube {
    public static void main(String[] args) {
        int[] arr = { 9, 12, 8, 14, 16 };
        double s[] = new double[arr.length];
        double c[] = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            s[i] = Math.sqrt(arr[i]);
            c[i] = Math.pow(arr[i], 3);
        }
        for (double d : c) {

            System.out.println("cube" + d);
        }
        for (double d : s) {
            System.out.println("Square" + d);

        }
    }
}