public class FibonacciN{
    public static void main(String[ ]args){
        int a=0;
        int b=1;
        System.out.print(a + " " + b + " ");
        
        int c;

        for (int i =2;i<10;i++){
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
            

    }  
  }
}