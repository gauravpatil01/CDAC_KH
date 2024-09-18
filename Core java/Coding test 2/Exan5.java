import java.util.Arrays;

public class Exan5 {

    public static void findMedianInWindow(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) {

            int[] window = new int[k];
            for (int j = 0; j < k; j++) {
                window[j] = arr[i + j];
            }

            Arrays.sort(window);

            int median = window[k / 2];

            System.out.println("Median of window starting at index " + i + ": " + median);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
        int k = 3;

        findMedianInWindow(arr, k);
    }
}
