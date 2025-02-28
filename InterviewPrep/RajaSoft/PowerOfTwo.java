public class PowerOfTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16, 3, 7, 5};
        System.out.println(countPowerOfTwo(arr));
    }

    public static int countPowerOfTwo(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if ((num & (num - 1)) == 0 && num > 0) count++;
        }
        return count;
    }
}
