class TargetSumArray {

    public static void findValue(int arr[], int target) {
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("Target hit by pairs " + arr[i]+" " +arr[j]+ " ");
                }
            }
        }
        System.out.println("no pair found ");
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 10;
        findValue(arr, target);

    }



}
