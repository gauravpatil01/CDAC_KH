import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 4, 5, 5 };
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int integer : hs) {
            System.out.println(integer);
        }

    }

    public static void main1(String[] args) { // for sorted array
        int a[] = { 1, 2, 2, 3, 4, 5, 5 };
        int length = a.length;
        int j = 0;

        int[] temp = new int[length];

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i];
                j++;
            }
        }

        temp[j] = a[a.length - 1];
        for (int i : temp) {
            System.out.println(i);
        }
    }
}
