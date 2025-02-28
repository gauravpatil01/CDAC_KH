public class Divisor {
    public static void main(String[] args) {
        int num=12;
        System.out.print("Divisors of " + num + " are: ");
        for (int i = 1; i <=num; i++) {
            if(num %i ==0){
                System.out.print(i+" ");
            }
        }
    }
}
