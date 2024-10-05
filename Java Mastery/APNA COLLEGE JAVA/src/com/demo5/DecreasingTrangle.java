package com.demo5;

//i-->1 to n
//j-->i to n
public class DecreasingTrangle {
	public static void main(String[] args) {
		int n = 5;
		for (int i=1 ;i<n;i++) {
			for (int j =i;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
