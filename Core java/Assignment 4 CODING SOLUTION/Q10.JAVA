public class Q10 {
    public static void main(String[] args) {
        // Check if exactly 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java Q10 <num1> <num2> <operator>");
            return;
        }

        // Parse the arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        char operator = args[2].charAt(0);

        // Variable to store the result
        double result = 0;
        boolean validOperation = true;

        // Perform the operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    validOperation = false;
                } else {
                    result = (double) num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                validOperation = false;
        }

        // Print the result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}
