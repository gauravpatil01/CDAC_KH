/*
 * 4) Write a Program that demonstrates widening conversion from int to
 * (double,float, boolean, string)  and prints the result.
 */

public class Q4 {
    public static void main(String[] args) {
        int value =123;

        //type conversion 

        double doubleval=value;
        System.out.println("Double value is " + doubleval);

        float floatval=(float)value;
        System.out.println("float "+floatval);

        boolean boolval =value != 0;
        System.out.println("boolean "+boolval);

        String strvalue =String.valueOf(value);
        System.out.println("String value "+strvalue);


    }
}


