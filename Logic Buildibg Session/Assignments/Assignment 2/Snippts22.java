public class Snippts22 {
    static void displayMessage() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        /*
         * static void displayMessage() { //Method Inside a Method not declared
         * System.out.println("Message");
         * }
         */

        displayMessage();
    }
}
/*
 * Snippet 22:
 * public class Main {
 * public static void main(String[] args) {
 * static void displayMessage() {
 * System.out.println("Message");
 * }
 * }
 * }
 *  What syntax error occurs? Can a method be declared inside another method?
 */