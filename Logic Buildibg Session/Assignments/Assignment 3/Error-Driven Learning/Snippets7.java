public class Snippets7 {
    public static void main(String[] args) {
        // int count; //variable count might not have been initialized
        int count = 0;

        while (count < 10) {
            System.out.println(count);
            count++;
        }
    }
}
/*
 * Snippet 7:
 * public class UninitializedWhileLoop {
 * public static void main(String[] args) {
 * int count;
 * 
 * 
 * while (count < 10) {
 * System.out.println(count);
 * count++;
 * }
 * }
 * }
 * // Error to investigate:
 */
