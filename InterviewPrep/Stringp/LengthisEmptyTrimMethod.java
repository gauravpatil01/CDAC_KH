public class LengthisEmptyTrimMethod {
    public static void main(String[] args) {
        String name = "  abc  ";
        String email = "abc@gmail.com";
        String pass = "abc123";

        System.out.println("length " + name.length());
        System.out.println("isEmpty " + name.isEmpty());
        String s = name.trim();
        System.out.println("trim " + s);

        System.out.println("length " + name.length());
    }
}
