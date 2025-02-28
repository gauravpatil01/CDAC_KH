package interview.com;

public class AlternateNumberPrintArray {
	public static void main1(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i = i + 2) {

			System.out.print(arr[i] + " ");
		}
	}
}
