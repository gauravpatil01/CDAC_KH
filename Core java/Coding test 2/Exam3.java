
import java.util.Scanner;
public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] tempArr = new int[size];
        int index = 0;

       
        for (int num : arr) {
            if (num < 0) {
                tempArr[index++] = num;
            }
        }

    
        for (int num : arr) {
            if (num >= 0) {
                tempArr[index++] = num;
            }
        }

   
        System.out.println("Rearranged array:");
        for (int num : tempArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
