// 5. Write a program to print the Fibonacci sequence up to the number 21. 

public class Q5 {

    public static void main(String[] args) {
        int n = 21;
        int first = 0;
        int secnond = 1;
        System.out.println(first + " " + secnond +" ");
        for (int i = 2; i < n; i++) {
            int next = first + secnond;

            System.out.println(next + " ");
            first = secnond;
            secnond = next;
        }

    }

}
