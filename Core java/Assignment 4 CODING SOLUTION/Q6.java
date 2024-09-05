public class Q6 {
    public static void main(String[] args) {
        // b. Write a program to test how many bytes are used to represent a float value using the BYTES field.
        int floatBytes = Float.BYTES;
        System.out.println("Bytes used to represent a float: " + floatBytes);

        // c. Write a program to find the minimum and maximum values of float using the MIN_VALUE and MAX_VALUE fields.
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum value for float: " + minFloatValue);
        System.out.println("Maximum value for float: " + maxFloatValue);

        // d. Declare a method-local variable number of type float with some value and convert it to a String using the toString method.
        float floatNumber = 123.45f;
        String floatAsString = Float.toString(floatNumber);
        System.out.println("Float as String: " + floatAsString);

        // e. Declare a method-local variable strNumber of type String with some value and convert it to a float value using the parseFloat method.
        String strNumber = "456.78";
        float parsedFloat = Float.parseFloat(strNumber);
        System.out.println("Parsed float: " + parsedFloat);

        // f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value.
        try {
            String invalidStrNumber = "Ab12Cd3";
            float invalidFloat = Float.parseFloat(invalidStrNumber);
            System.out.println("This won't print: " + invalidFloat);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // g. Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using Float.valueOf().
        float floatValue = 789.01f;
        Float floatWrapper = Float.valueOf(floatValue);
        System.out.println("Float wrapper: " + floatWrapper);

        // h. Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper class using Float.valueOf().
        String floatStrNumber = "987.65";
        Float strToWrapper = Float.valueOf(floatStrNumber);
        System.out.println("String to Float wrapper: " + strToWrapper);

        // i. Declare two float variables with values 112.3 and 984.5, and add them using a method from the Float class.
        float float1 = 112.3f;
        float float2 = 984.5f;
        float sumResult = Float.sum(float1, float2);
        System.out.println("Sum of floats: " + sumResult);

        // j. Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values using the Float class.
        float float3 = 112.2f;
        float float4 = 556.6f;
        float minFloat = Float.min(float3, float4);
        float maxFloat = Float.max(float3, float4);
        System.out.println("Minimum float: " + minFloat + ", Maximum float: " + maxFloat);

        // k. Declare a float variable with the value -25.0f. Find the square root of this value.
        float negativeFloat = -25.0f;
        double sqrtResult = Math.sqrt(negativeFloat);  // Note: Math.sqrt() returns double
        System.out.println("Square root of " + negativeFloat + ": " + sqrtResult);

        // l. Declare two float variables with the same value, 0.0f, and divide them.
        float zero1 = 0.0f;
        float zero2 = 0.0f;
        float zeroDivisionResult = zero1 / zero2;
        System.out.println("Result of dividing 0.0f by 0.0f: " + zeroDivisionResult);
    }
}
