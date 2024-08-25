import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter sub1 marks");
        int sub1 = sc.nextInt();
        System.out.println("enter sub2 marks");
        int sub2 = sc.nextInt();
        System.out.println("enter sub3 marks");
        int sub3 = sc.nextInt();

        int failCount = 0;

        if (sub1 < 40) {
            failCount = failCount + 1;
        }
        if (sub2 < 40) {
            failCount = failCount + 1;
        }
        if (sub3 < 40) {
            failCount = failCount + 1;
        }
        switch (failCount) {

            case 1:
                System.out.println("you failed in 1 subject");

                break;
            case 2:
                System.out.println("you failed in 2 subject");

                break;

            case 3:
                System.out.println("you failed in 3 subject");

                break;

            default:
                System.out.println("you p[assed the exam]");
                break;
        }

    }
}
/*
 * Question 5: Student Pass/Fail Status with Nested Switch
 * Write a program that determines whether a student passes or fails based on
 * their grades in three
 * subjects. If the student scores more than 40 in all subjects, they pass. If
 * the student fails in one or
 * more subjects, print the number of subjects they failed in.
 */
