package com.recursion;

public class StackHeightLogCompairMain6 {
	public static int calPow(int x,int n) {
		if(n==0) return 1;//base 1
		if(x==0) return 0;//base 2
		
		//if n is even
		if(n%2==0) {
			return calPow(x,n/2) * calPow(x,n/2);
		}else {
			return calPow(x,n/2) * calPow(x,n/2) *x;
		}
		
		
	}
	public static void main(String[] args) {
	int ans =calPow(2,5);
	System.out.println(ans);
	}
}
