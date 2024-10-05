package com.demo5;
//i-->1 to n
//j-->1 to i
public class IncreasingTrangle {
	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<=n;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}

	}
}
