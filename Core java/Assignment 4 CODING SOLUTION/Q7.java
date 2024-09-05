public class Q7 {
    public static void main(String[] args) {
        // b
        double bytescheck = Double.BYTES;
        System.out.println("byte for double is :" + bytescheck);
        // c
        double minValue = Double.MIN_VALUE;
        double maxValue = Double.MAX_VALUE;
        System.out.println("min value for double is: " + minValue + "" + " max value for double is " + maxValue);
        // d
        double number = 234.3456;
        String str = Double.toString(number);
        System.out.println(str);

        // e

        String strNumber = "123.45";
        double strnum = Double.parseDouble(strNumber);
        System.out.println(strnum);

        // f

        // String strNumString1 ="Ab12Cd3";
        // Double strchange =Double.parseDouble(strNumString1);
        // System.out.println(strchange);

        // g

        double number1 = 456.856;
        Double numwrapper = Double.valueOf(number1);
        System.out.println(numwrapper);

        // h

        String strnumber = "125.45";
        Double strwrapper = Double.valueOf(strnumber);
        System.out.println(strwrapper);

        // i
        double value1 = 112.3;
        double value2 = 984.5;

        double result =Double.sum(value1 ,value2);
        System.out.println(result);

        //j

        double value3= 112.2;
        double value4= 556.6;

        double min=Double.min(value4, value3);
        double max=Double.max(value4, value3);
        System.out.println("min value is : "+min+" max value is : "+max);

        //k
        double variable =-25.0;
        double result1 =Math.sqrt(variable);
        System.out.println(result1);

        //l 

        double x=0.0;
        double y=0.0;
        double result3 =x/y;
        System.out.println(result3);



    }
}