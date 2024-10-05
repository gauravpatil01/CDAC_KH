package com.recursion;
//print x^n(Stack height is n)
public class StackHeightMain5 {
	public static int claculateX(int x,int n) {
		//base case 1
		if(n==0  ) return 1;
		//base case 2
		if(x==0) return 0;
		//what we want to do
		int xPowMinOne=claculateX(x,n-1); //kaam
		int xPowN=x* xPowMinOne;
		
		return xPowN;
	}
public static void main(String[] args) {
	int ans =claculateX(2,5);
	System.out.println(ans);
}
}
