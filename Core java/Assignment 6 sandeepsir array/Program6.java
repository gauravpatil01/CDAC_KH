package in.solution1;

public class Program6 {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9};
		int expected_count =arr.length+1;
		int total_sum = expected_count*(expected_count+1)/2;
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(total_sum -sum);
	}

}
