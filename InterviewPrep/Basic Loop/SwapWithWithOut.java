public class SwapWithWithOut {

public static void main(String[] args) {
    int a=10;
    int b=20;
    int c;
    System.out.println("A is ==> "+a);
    System.out.println("B is ==> "+b);
   c=a;
   a=b;
   b=c;
   System.out.println("A is ==> "+a);
   System.out.println("B is ==> "+b);

}



   public static void main1(String[] args) {
    int a=10;
    int b=16;
    System.out.println("A is ==> "+a);
    System.out.println("B is ==> "+b);
    a=b+a;
    b=a-b;
    a=a-b;
    System.out.println("A is ==> "+a);
    System.out.println("B is ==> "+b);
   } 
}
