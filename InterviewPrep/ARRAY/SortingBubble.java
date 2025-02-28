public class SortingBubble  {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 3, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
