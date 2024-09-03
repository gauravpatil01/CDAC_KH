/*steps==>
take two variable
assign value first variable to second  
a= a+b
b=a-b
a=a-b

*/

public class SwapNumber {
    public static void main(String[] args) {
        int a = 11;
        int b = 13;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a" + a);
        System.out.println("b" + b);

    }
}

// --------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
 * using third vatiablke
 * t=a
 * a=b
 * b=t
 */

/*
 * public class SwapNumber {
 * 
 * public static void main(String[] args) {
 * int a=10;
 * int b=20;
 * 
 * int t=a;
 * a=b;
 * b=t;
 * System.out.println("a is becomes:"+a);
 * System.out.println("b is becomes:"+b);
 * }
 * }
 * 
 */