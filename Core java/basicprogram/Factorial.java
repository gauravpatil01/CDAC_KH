/*
 factorial means 
 5! ==>5*4*3*2*1
 1!==1
 number >=0 is no factorial 

 take factorial number from user
take one empty variable to have factorial value  initilize with ==1

for loop
if condition to check number is greater than 0 
to go till factorial number
calculate factorial = = fact=i*fact


 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int favtorialNumber = sc.nextInt();
        int factorial = 1;
        for (int i = 2; i <= favtorialNumber; i++) {

            if (favtorialNumber <= 0) {
                break;
            }

            factorial = factorial * i;
            System.out.println(factorial);

        }
        

    }
}
