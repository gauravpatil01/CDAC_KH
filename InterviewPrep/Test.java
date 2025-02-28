public class Test {
    public static void main(String args[]) {
        int a[] = {5, 1, 7}; // Correct array initialization
        int sum = 0;

        for (int i = 0; i < a.length; i += 2) { // Iterates over index 0 and 2
            sum = sum + a[i]; // Adds elements at indices 0 and 2
            i--;
        }




        System.out.print(sum);
    }
}
