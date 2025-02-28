public class FirstDuplicate {
   

    public static void main1(String[] args) {
        int []a={6,5,3,2,5,1,2,4};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[i] && (i != j)){
                System.out.println("First duplicate elenmet is "+a[j]);
                temp=temp+1;
                break;
                }
            }if(temp>0)

            {
                break;
            }
        }
    }
    
}
