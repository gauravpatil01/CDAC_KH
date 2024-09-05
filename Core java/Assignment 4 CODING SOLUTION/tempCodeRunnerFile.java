public class Q10 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ArithmeticOperations <num1> <num2> <operator>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        char operator = args[2].charAt(0);
        
        double result;
        
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = (double) num1 / num2; 
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
