public class ReplaceMethod {
    public static void main(String[] args) {
        String s = "this is demo";
        System.out.println(s);
        System.out.println(s.replace("is", "was"));
        System.out.println(s.replaceFirst("is", "was"));
        System.out.println(s.replaceAll("is", "was"));
        System.out.println(s.replaceAll("regex spaces remove   .* "+"is(.)", "was"));
        System.out.println(s.replaceAll("regex remove   .* "+"is(.*)", "was"));
    }
}

