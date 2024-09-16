package in.solution1;
//Write a program to find the intersection of two single-dimensional arrays.

public class Program5 {
	public static void main(String[] args) {
		int arr1[] = { 4, 3, 7, 9, 2 };
		int arr2[] = { 5, 1, 4, 8, 3 };

		// traverse arr1
		for (int i = 0; i < arr1.length; i++) {
			// traverse arr2
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
//				System.out.print("common element found 	"+ arr1[i]);
					System.out.print("First number " + arr1[i] + " and second number " + arr2[j] + " are common. ");
				}
			}
		}
	}
}