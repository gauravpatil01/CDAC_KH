/*
 * Write a program that performs arithmetic operations involving different 
 * data types (int, double, float) and observes how Java handles widening 
 * conversions automatically.

 */


public class Q3 {
    public static void main(String[] args) {
        int value1 =12;
        float value2 =12.3f;
        double value3 =19.786549;
        long value4 =12;

        double result =(value1*value3)/(value2+value4);
        System.out.println("double"+result);

       int result1 =(int)(value1*value3/value2+value4);
       System.out.println("integer"+result1);

       float result2 =(float)(value1*value3/value2+value4);
       System.out.println("float"+result2);



    }
}
