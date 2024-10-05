package com.recursion;

//sum of n number 
public class SumMain3 {
	static void printSum(int i ,int n,int sum) {/*i in which number we are ; n tells base condition ;sum  */
		//base case 
		if(i==n) {
			sum=sum+i;
			
			System.out.println(sum);
			return;
		}
		sum =sum+i;
		printSum(i+1,n,sum);
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		printSum(1,5,0);
	}
}


/*
  main     --> i=1  n=5  sum =0
  printsum --> i=1  n=5  sum =0   sum =sum+i= 0+1=1
           --> i=2  n=5  sum =1   2+1=3
           --> i=3  n=5  sum =3   3+3=6
           --> i=4  n=5  sum =6   6+4=10
           --> i=5  n=5  sum =10  10+5=15
          
 


*/