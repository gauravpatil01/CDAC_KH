public class Q5l {
    public static void main(String[] args) {
        long longValue = 100000L;

        int intValue = (int) longValue;
        System.out.println("Long to int: " + intValue);

        short shortValue = (short) longValue;
        System.out.println("Long to short: " + shortValue);

        byte byteValue = (byte) longValue;
        System.out.println("Long to byte: " + byteValue);

        float floatValue = longValue;
        System.out.println("Long to float: " + floatValue);

        double doubleValue = longValue;
        System.out.println("Long to double: " + doubleValue);

        int intToLong = 200;
        long convertedLongFromInt = intToLong;
        System.out.println("Int to long: " + convertedLongFromInt);

        short shortToLong = 300;
        long convertedLongFromShort = shortToLong;
        System.out.println("Short to long: " + convertedLongFromShort);

        byte byteToLong = 100;
        long convertedLongFromByte = byteToLong;
        System.out.println("Byte to long: " + convertedLongFromByte);
    }

}
