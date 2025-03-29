
public class IntToFlote {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        float c = a;
        System.out.println(c);
        double d = a;
        System.out.println(d);

        double e = 12.49;
        int f = (int) Math.round(e);
        System.out.println("double converted to int " + f);

        float f1 = 12.89F;
        // int i1=(int)f1;

        int i1 = 13;
        ;
        float f2 = i1;
        System.out.println("int to float direct conversion " + f2);

        // int to short
        int i3 = 1235555;
        short s1 = (short) i3;
        System.out.println("int to short " + s1);

        // string to number
        String str = "123";
        int x = Integer.parseInt(str);
        System.out.println("String to premitive int " + x);

        String str1 = "456";
        Integer y = Integer.valueOf(str1);
        System.out.println("String to object(Wrapper) integer " + x);

        // integer to string
        int num = 1234;
        String str2 = String.valueOf(num);
        System.out.println("String to num using value of " + str2);

        float f3 = 12.45f;
        String str4 = String.valueOf(f3);
        System.out.println("float to string " + str4);

        int num2 = 4567;
        String str3 = Integer.toString(num2);
        System.out.println("String to num using toString " + str2);

        String s6 = "12.56";
        Float f6 = Float.parseFloat(s6);
        System.out.println("String to float " + f6);


        //  string to character 
        String s9="gaurav";
        char [] chArr =s9.toCharArray();
         System.out.println("String to cj=haracter "+ chArr ); //g

        //or 
        char c1=s9.charAt(0); //g

        //char to string 

        char c2 ='d';
        String sc=String.valueof(c2);
        
        
    }
}
