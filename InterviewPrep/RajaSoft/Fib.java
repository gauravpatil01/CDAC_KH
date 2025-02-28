
public class Fib{
    public static void main(String[] args) {
        int number=10;
        int first=0;
        int second=1;
        System.out.print(first + " " + second + " ");
        for(int i=2;i<=number;i++){
            int next =first+second;
            System.out.print(next+ " ");
            first=second;
            second=next;
        }
    }
}

 