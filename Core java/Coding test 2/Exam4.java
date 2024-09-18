
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array value:");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        float average = sum / size;

        System.out.println("Numbers greater than the average (" + average + "):");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

    
    }
}

