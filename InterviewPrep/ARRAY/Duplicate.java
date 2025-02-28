import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {
    public static void main2(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3 };
        Set<Integer> s = new HashSet<>();
        for (int num : arr) {
            if (s.add(num) == false) {
                System.out.println( num);
            } 
        }

    }

    public static void main(String[] args) { // using collection
        int[] a = { 3, 5, 4, 3, 2, 2, 1, 1 };
        Set<Integer> s = new HashSet<>();
        for (int number : a) {
            if (s.add(number) == false) {
                System.out.println(number);
            }
        }
    }

    public static void main1(String[] args) { // bruit forse single repetation
        int[] a = { 3, 5, 4, 3, 2, 2, 1 };
        for (int index = 0; index < a.length; index++) {
            for (int j = index + 1; j < a.length; j++) {
                if (a[index] == a[j] && index != j) {
                    System.out.print(a[j] + " ");
                }
            }

        }
    }
}
