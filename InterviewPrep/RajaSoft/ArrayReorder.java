public class ArrayReorder {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4};
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
