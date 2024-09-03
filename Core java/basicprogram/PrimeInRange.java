/*
 print prime in range
 for 1 t0 100 
 for 2 to n-1
 if 2for loop j% i==0
 then temp variable=temp +1 
 opu for loop
 if temp!=0{
 prime}
 else we have to temp=0 again assign for next iteratiojn
 */

public class PrimeInRange {
    public static void main(String[] args) {
        int temp=0;
        for (int i = 1; i <=100; i++) {
            for(int j=2 ;j<i;j++){
                if (i%j==0) {
                    temp=temp+1;
                }
                
            }
            if (temp ==0) {
                System.out.println(i);
            }else{
                temp=0;
            }
           
        }

    }
}
