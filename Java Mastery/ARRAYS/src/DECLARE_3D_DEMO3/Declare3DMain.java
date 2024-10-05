package DECLARE_3D_DEMO3;

/*
1D array: {}

2D array: { {}, {} }

3D array: { { {}, {} }, { {}, {} } }
 
 */
public class Declare3DMain {
	public static void main(String[] args) {
		// Declare
		int[][][] arr = new int[2][3][2];
		// Initialization
		arr[0][0][1] = 14;

		int[][][] a = { { { 10, 20 }, { 30, 40, 50, 60 }, { 70, 80, 90 } } };
		System.out.println(a[0][0][1]);
		// FORLopp
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.println(a[i][j][k]);
				}
			}
		}

	}
}
