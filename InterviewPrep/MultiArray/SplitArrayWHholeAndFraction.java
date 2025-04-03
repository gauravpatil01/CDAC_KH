public class SplitArrayWHholeAndFraction {
    public static void main(String[] args) {
      double arr[]={4.5,9.65,68.4,14.45,0.16};
        long whole[]=new long[arr.length];
        double fraction []=new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            whole[i] =(long)arr[i];
            fraction[i]=arr[i]- whole[i];
        }
        for( long w:whole){
            System.out.println(w);
        }
        System.out.println();
        for (double f:fraction){
            System.out.println(f);
        }
    }
}
