/*  
prime number 

eg 7 if seven is devisibal by any number other than 1 and 7 itself then its not a prime number 

so we need to check if % ==0 then it not prime 

steps
take number 
make one temp variable for testing ===>
for loop start

i=2 beacus condition 
i<n==>number should 1less 

if n% i==0
then temp=temp+1
close if 

outside 
if temp ==o in any condition numbe is not prime then
else prime


 */

public class Prime {
    public static void main(String[] args) {
        int number =15;
        int temp=0;

        for(int i=2;i<number;i++){

            if(number % i ==0){
                
                temp =temp+1;
            }
        }
        if (temp>0) {
            System.out.println("not a prime");

        }else{
            System.out.println("prime number ");
        }
    }


    
}
