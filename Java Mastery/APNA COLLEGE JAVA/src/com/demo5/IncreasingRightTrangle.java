package com.demo5;
//i 1 to n
//j spaces --> i to n
//k  1 to i
public class IncreasingRightTrangle {
public static void main(String[] args) {
	int n=5;
	for (int i =1;i<=n;i++) {
		for (int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for (int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}


/*

----*
---**   
--***
-****
*****



*/