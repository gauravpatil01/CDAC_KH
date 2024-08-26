

public class Q2 {
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue;  // if it true then skip 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
}