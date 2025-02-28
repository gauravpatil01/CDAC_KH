public class ReverseStringtwo {
    public static void main(String[] args) {
        String s="gaurav";

        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
    }
    public static void main1(String[] args) {

        String s = "Nayan";
        String rev = "";
        int length = s.length();

        System.out.println("Reverse a String");

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("palendrom");
        } else {
            System.out.println("not a palendrom");
        }

    }
}
