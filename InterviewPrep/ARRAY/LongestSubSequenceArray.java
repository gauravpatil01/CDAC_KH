import java.util.HashSet;

public class LongestSubSequenceArray {
    public static void main(String[] args) {
        int a[] = { 3, 9, 1, 10, 4, 20, 2 };

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }


        int longest_length=0;

        for (int i = 0; i < a.length; i++) {

            if(!hs.contains(a[i]-1)){
                int no =a[i];
                while(hs.contains(no)){
                    no++;
                }
                if(longest_length<no-a[i]){
                    longest_length=no-a[i];
                }
            }
        }
        System.out.println("longest subsequence "+longest_length);

    }
}
