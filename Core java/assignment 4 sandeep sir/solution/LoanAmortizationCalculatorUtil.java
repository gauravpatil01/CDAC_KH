package in.solution;
//package in.solution;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {

 private LoanAmortizationCalculator obj;

 public void acceptRecord() {
     

     Scanner sc = new Scanner(System.in);

     System.out.println("enter principle amount:");
     double principal = sc.nextDouble();

     System.out.println("entre Annual Interest Rate");
     double annualInterestRate = sc.nextDouble();

     System.out.println("entre Loan term");
     double loanTerm = sc.nextDouble();
     obj = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);

 }

 public void printRecord() {
     if (obj != null) {
         System.out.println();
         System.out.println(obj.toString());
     } else {
         System.out.println("no loam details availlable");
     }
 }

 public void menuList() {
     Scanner sc = new Scanner(System.in);
     int choice;
     do {
         System.out.println();
         System.out.println("ENTER 1 PRINT RECORD :");
         System.out.println("ENTER 2 ACCEPT RECORD :");
         System.out.println("ENTER 3 FOR EXIT :");
         choice = sc.nextInt();
         switch (choice) {
             case 1:
                 printRecord();
                 break;
             case 2:
                 acceptRecord();
                 break;
             case 3:
                 System.out.println("exit the code");
                 break;
             default:
                 System.out.println("invalid");
                 break;
         }

     } while (choice != 3);
 }
}