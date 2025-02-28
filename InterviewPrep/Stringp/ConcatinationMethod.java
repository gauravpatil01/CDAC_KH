public class ConcatinationMethod {

public static void main(String[] args) {
    String s1="this is done";
    System.out.println(s1.subSequence(1,9));


    System.out.println(s1.substring(3));
    System.out.println(s1.substring(1,9));


}


    public static void main1(String[] args) {
        String s1 = "deepak ";
        String s2 = "Java ";

        System.out.println("using + operator " + s1 + s2);
        System.out.println("Concate method   " + s1.concat(s2));
        System.out.println("Concate method   " + s2.concat(s1));

        System.out.println("Join method      " + String.join(";", s1, s2));
    }
}
