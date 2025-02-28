public class MaxAndMin {









public static void main(String[] args) {
    int [] arr={1,4,2,6,8,9,10};
int max=arr[0];
    for(int i=1;i<=arr.length-1;i++){
        if(max > arr[i]){
            max=arr[i];
        }
    }System.out.println(max);
}




    public static void main1(String[] args) {
        int [] a= {4,3,5,2,1,6};
        int max=a[0];
        for(int i =1;i<a.length;i++){
            if(a[i] < max){
               max=a[i];
            }
        }System.out.println("Max value is "+max);
    }
}
