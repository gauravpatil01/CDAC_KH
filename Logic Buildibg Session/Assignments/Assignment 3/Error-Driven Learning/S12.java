public class S12 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int x = i * 2;
            System.out.println(x);
        }
        // System.out.println(x); // Error: 'x' is not accessible here because its
        // outside the loop
    }
}
/*
 * Snippet 12:
 * public class LoopVariableScope {
 * public static void main(String[] args) {
 * for (int i = 0; i < 5; i++) {
 * int x = i * 2;
 * }
 * System.out.println(x); // Error: 'x' is not accessible here
 * }
 * }
 * // Error to investigate: Why does the variable 'x' cause a compilation error?
 * How does scope
 */