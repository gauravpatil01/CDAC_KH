import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number1=2;
        int number2=14;
        String symbol=sc.next();
        switch (symbol){
            case "*":
            System.out.println(number1 * number2);
            break;
            case "/":
            System.out.println(number1 / number2);
            break;
            case "%":
            System.out.println(number1%number2);
            break;
            case "+":
            System.out.println(number1+number2);
            break;
            default:
            System.out.println("enter correct operation");

        }

    }
}
