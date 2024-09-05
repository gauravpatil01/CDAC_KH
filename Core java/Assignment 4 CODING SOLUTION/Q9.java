public class Q9 {
    // Instance variables (non-static)
    byte instanceByte;
    short instanceShort;
    int instanceInt;
    long instanceLong;
    float instanceFloat;
    double instanceDouble;
    char instanceChar;
    boolean instanceBoolean;

    // Static variables
    static byte staticByte;
    static short staticShort;
    static int staticInt;
    static long staticLong;
    static float staticFloat;
    static double staticDouble;
    static char staticChar;
    static boolean staticBoolean;

    public static void main(String[] args) {
        // Create an object of the class to access instance variables
        Q9 obj = new Q9();

        // Print default values of instance variables
        System.out.println("Default values of instance variables:");
        System.out.println("byte: " + obj.instanceByte);
        System.out.println("short: " + obj.instanceShort);
        System.out.println("int: " + obj.instanceInt);
        System.out.println("long: " + obj.instanceLong);
        System.out.println("float: " + obj.instanceFloat);
        System.out.println("double: " + obj.instanceDouble);
        System.out.println("char: '" + obj.instanceChar + "'");
        System.out.println("boolean: " + obj.instanceBoolean);

        // Print default values of static variables
        System.out.println("\nDefault values of static variables:");
        System.out.println("byte: " + staticByte);
        System.out.println("short: " + staticShort);
        System.out.println("int: " + staticInt);
        System.out.println("long: " + staticLong);
        System.out.println("float: " + staticFloat);
        System.out.println("double: " + staticDouble);
        System.out.println("char: '" + staticChar + "'");
        System.out.println("boolean: " + staticBoolean);
    }
}
