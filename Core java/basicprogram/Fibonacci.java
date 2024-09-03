/* steps 1 2 3 5 8 13
 take number 
 tak1 a=0
 take b=1
 fibnumber;
 for 2 ;i<=number;i++
fib=fib+a
a=b
b=fib


 */

public class Fibonacci {
    public static void main(String[] args) {
        int number =10;
        int a=0;
        int b=1;
        int c;

        for(int i=1;i<=number;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
    }
    
}
