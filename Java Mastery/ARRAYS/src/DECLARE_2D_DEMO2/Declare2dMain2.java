package DECLARE_2D_DEMO2;

import java.util.Arrays;

public class Declare2dMain2 {
	public static void main(String[] args) {

		// Create
		int[][] arr1 = new int[2][3]; // 2-->row 3-->cols //matrix array //coloum same

		int[][] arr2;
		arr2 = new int[2][];// 2--> rows ;no coloum at start
		arr2[0] = new int[3]; // -->for arr2[0] -->3 coloum Jagged array
		arr2[1] = new int[2]; // -->for arr2[] -->2 coloum Jagged array

		// Initialization for matrix
		int[][] Initialization = new int[2][3];
		Initialization[0][0] = 10;
		Initialization[1][2] = 60;

		int[][] allDeclareCreateInitilizeAtOneForMatrix = { { 10, 20, 30 }, { 40, 50, 60 } };// {row 1} {row 2 }

		// JaggedArray
		int[][] jagged = new int[2][];
		jagged[0] = new int[4];// 4 element array at 0 row position
		jagged[1] = new int[3];// 3 element array at 1 row position

		jagged[0][0] = 10;
		jagged[0][1] = 20;
		jagged[1][2] = 70;

		int[][] jaggedcreateDeclareInitilize = { { 10, 20, 30, 40 }, { 50, 60, 70 } };

		// Print
		int[][] toPrint = { { 10, 20, 30, 40 }, { 50, 60 }, { 70, 80, 90 } };
		System.out.println("Print 2d Array ");
		for (int i = 0; i< toPrint.length;i++) {
			for (int j =0;j< toPrint[i].length;j++) {
				System.out.print(toPrint[i][j]+" ");
			}
		}

	}
}

/*
 * 
 * 
 * 
 * // Declare int[][] a; // 2d most use int[][] b; // 2d int c[][]; // 2d int[]
 * d[];// 2d
 * 
 * int[] e, f; // both 1d int g[], h; // h is variable
 * 
 * int[] i[], j; // i is 2d j is 1d array int []k[], l[]; //both 2d
 * 
 * int[] []m,n[]; //m-->2d ; n -->3d
 * 
 * // int [][] o,[]p; //o-- 2d p-->compile time error
 * 
 * 
 * //Print int [][] toPrint = {{10,20,30,40} ,{50,60} ,{70,80,90}}; //
 * System.out.println(toPrint);//[[I@59f95c5d //
 * System.out.println(toPrint[0]);//[I@5c8da962 //
 * System.out.println(toPrint[0][0]); //10 //
 * System.out.println(toPrint.length); //3 //
 * System.out.println(toPrint[0].length); //4 // //System.out.println(toPrint[0]
 * [0].length); //error
 * 
 * 
 */
