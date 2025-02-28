public class StringCompairMethod {
public static void main(String[] args) {
    String s1 = "a";
    String s2 = "A";
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));
}

    public static void main1(String[] a) {
        String s1 = "deepak";
        String s2 = "Deepak";

        System.out.println("case not check ==> " + s1.equals(s2));
        System.out.println("case check     ==> " + s1.equalsIgnoreCase(s2));

    }
}
