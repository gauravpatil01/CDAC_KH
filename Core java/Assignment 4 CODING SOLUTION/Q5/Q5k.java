public class Q5k {
    public static void main(String[] args) {
        long value =7;
        String binary =Long.toBinaryString(value);
        String octal =Long.toOctalString(value);
        String hexadecimal =Long.toHexString(value);
        System.out.println("value is binary :" + binary);
        System.out.println("value is octal :" + octal);
        System.out.println("value is  hexadecimal:" + hexadecimal);
    }
}
