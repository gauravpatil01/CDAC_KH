public class Q4l {
    public static void main(String[] args) {
        int number = 100;

        byte byteValue = (byte) number;
        short shortValue = (short) number;
        long longValue = number;
        float floatValue = number;
        double doubleValue = number;
        char charValue = (char) number;
        boolean boolValue = (number != 0);

        System.out.println("Original int value: " + number);
        System.out.println("Converted to byte: " + byteValue);
        System.out.println("Converted to short: " + shortValue);
        System.out.println("Converted to long: " + longValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to double: " + doubleValue);
        System.out.println("Converted to char: " + charValue);
        System.out.println("Converted to boolean: " + boolValue);

        int fromByte = byteValue;
        int fromShort = shortValue;
        int fromLong = (int) longValue;
        int fromFloat = (int) floatValue;
        int fromDouble = (int) doubleValue;
        int fromChar = charValue;

        System.out.println("\nConverted back to int:");
        System.out.println("From byte: " + fromByte);
        System.out.println("From short: " + fromShort);
        System.out.println("From long: " + fromLong);
        System.out.println("From float: " + fromFloat);
        System.out.println("From double: " + fromDouble);
        System.out.println("From char: " + fromChar);
    }
}
