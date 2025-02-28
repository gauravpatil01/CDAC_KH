
import java.util.ArrayList;

public class EvenOddCountSum {
    public static void main(String[] args) {
        int[] a = { 8, 5, 10, 12, 3, 1, 4 };
        int total1 = 0, total2 = 0;
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {

                al1.add(a[i]);

            } else {
                al2.add(a[i]);
            }
        }
        System.out.println("Even Number ");
        for (int num : al1) {
            total1 = total1 + num;
            System.out.println(num);
        }
        System.out.println("Count of Even Number is " + al1.size());
        System.out.println("Even Number Sum " + total1);
        System.out.println("Odd Number ");
        for (int num : al2) {
            System.out.println(num);
            total2 = total2 + num;
        }
        System.out.println("Count of Odd Number is " + al2.size());
        System.out.println("Odd Number Sum " + total2);

    }
}
