public class OnceInArray {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 5, 2, 3, 4 };

        int unique = 0;
        for (int num : arr) {
            unique = unique ^ num;
        }

        System.out.println(unique);

    }
}
