//kabane algorithum

public class SubArraySumMax {
    public static void main(String[] args) {
        int a[]={4,-2,-3,4,-1,-2,1,5,-3};
        int max_so_far=Integer.MIN_VALUE;
        int max_Ending=0;

        for (int i = 0; i < a.length; i++) {
           max_Ending=max_Ending+a[i]; 

           if(max_so_far < max_Ending){
            max_so_far=max_Ending;
           }
           if(max_Ending<0){
            max_Ending=0;
           }
        }
        System.out.println(max_so_far);
    }
}
