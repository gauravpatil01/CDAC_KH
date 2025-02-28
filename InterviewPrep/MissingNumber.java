public class MissingNumber {
    public static void main(String[] args) {
        int num [] ={1,2,3,4,6};
        int sum=0;
        int expected_no_element =num.length+1;
        int total_no_sum =expected_no_element*(expected_no_element+1)/2;
        // System.out.println(total_no_sum);

        for(int add:num){
            sum=sum+add;
        }
        System.out.println( total_no_sum-sum );
    }
}
