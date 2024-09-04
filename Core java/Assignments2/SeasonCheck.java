import java.util.Scanner;

public class SeasonCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1, 2, 3:
                System.out.println(" Winter");

                break;
            case 4, 5, 6:
                System.out.println(" spring");

                break;
            case 7, 8, 9:
                System.out.println(" summer");

                break;
            case 10, 11, 12:
                System.out.println(" antumn");

                break;

            default:
                System.out.println("enter a right month");
                break;
        }
    }

}
