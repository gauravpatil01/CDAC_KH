import java.util.Scanner;
public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("take array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array  " + size );
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print("arr "+arr[i]+" ");
        }
        System.out.println();
        System.out.println("enter k value ");

        int k =sc.nextInt();
       
        if (k <= arr.length) {
            System.out.println(k + " largest : " + arr[k - 1]);
        } else {
            System.out.println("The array lower than  " + k);
        }
        for (int i =0 ;i<k;i++){
            System.out.println(arr[i]);
        }
    }
   
}

// 1.4.17,7,25,3,100