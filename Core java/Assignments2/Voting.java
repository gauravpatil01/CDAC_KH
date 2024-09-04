import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age ");

        double age = sc.nextDouble();

        String check = age > 18 ? "you can vote " : "aap abhi chote ho 😂 ";
        System.out.println(check);

    }

}
