public class Q8 {
    public static void main(String[] args) {
        // Initialize variables of each primitive type with user-defined values
        int a = 42;
        double b = 3.14;
        float c = 9.81f;
        long d = 123456789L;
        boolean e = true;
        char f = 'A';
        byte g = 127;
        short h = 32000;


        String aStr = Integer.toString(a);
        System.out.println("Integer to String using toString(): " + aStr);

        String bStr = Double.toString(b);
        System.out.println("Double to String using toString(): " + bStr);

        String cStr = Float.toString(c);
        System.out.println("Float to String using toString(): " + cStr);

        String dStr = Long.toString(d);
        System.out.println("Long to String using toString(): " + dStr);

        String eStr = Boolean.toString(e);
        System.out.println("Boolean to String using toString(): " + eStr);

        String fStr = Character.toString(f);
        System.out.println("Char to String using toString(): " + fStr);

        String gStr = Byte.toString(g);
        System.out.println("Byte to String using toString(): " + gStr);

        String hStr = Short.toString(h);
        System.out.println("Short to String using toString(): " + hStr);


        String aStr2 = String.valueOf(a);
        System.out.println("Integer to String using valueOf(): " + aStr2);

        String bStr2 = String.valueOf(b);
        System.out.println("Double to String using valueOf(): " + bStr2);

        String cStr2 = String.valueOf(c);
        System.out.println("Float to String using valueOf(): " + cStr2);

        String dStr2 = String.valueOf(d);
        System.out.println("Long to String using valueOf(): " + dStr2);

        String eStr2 = String.valueOf(e);
        System.out.println("Boolean to String using valueOf(): " + eStr2);

        String fStr2 = String.valueOf(f);
        System.out.println("Char to String using valueOf(): " + fStr2);

        String gStr2 = String.valueOf(g);
        System.out.println("Byte to String using valueOf(): " + gStr2);

        String hStr2 = String.valueOf(h);
        System.out.println("Short to String using valueOf(): " + hStr2);
    }
}
