/*reverse a num
 number =123
 take reminder of number 
 reversed num =0
 take reversed num = reversed num *10 +reminder
 and then change number  using number /10  so new number will bee 12

 use wgile loop



 */

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 123;
        int lastdigit;
        int reversedNum = 0;

        while (number != 0) {

            lastdigit = number % 10;
            reversedNum = reversedNum * 10 + lastdigit;
            number = number / 10;
             
        }
        System.out.println(reversedNum);

    }

}
