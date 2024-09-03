/*
 after reverse number become same then palendrom 
 121==121==palendrom

 teake number
 assigne variable to store reversenumbered =0
 int reminder

 while loop check if number!>0
 remender =num%10
 reversednum=reversednum*10+number
 number =number /10

 */
public class Palindrome {
    public static void main(String[] args) {
        int number = 121;
        int temp=number;
        int reminder;
        int reverse = 0;
        

        while (temp != 0) {
            reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp = temp / 10;
            
            
        
        }
        
        System.out.println("now check palendrom or not");
        if (number == reverse) {
            System.out.println("its a palondrom");

        } else {
            System.out.println("not a palendrom");
        }
       
       
        

    }
}
