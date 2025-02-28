public class EquilibriumIndex {

    public static int findEquiIndex(int[] arr) {
        int totalSum =0, leftSum=0;
        for(int num :arr){
            totalSum=totalSum+num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum=totalSum-arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum=leftSum+arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 2 };
        System.out.println(findEquiIndex(arr));
    }
}



