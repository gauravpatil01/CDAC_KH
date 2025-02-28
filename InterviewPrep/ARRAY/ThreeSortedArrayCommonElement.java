public class ThreeSortedArrayCommonElement {
    public static void main(String[] args) {
        int a[]={2,4,8};
        int b[]={2,3,4,8,10,16};
        int c[]={2,4,14,40};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int j2 = 0; j2 < c.length; j2++) {
                    if (a[i] == b[j] && b[j] == c[j2])
                    {
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
