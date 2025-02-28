public class FindmaxMinAtKthLocation {
    public static void main(String[] args) {
        int[] a = { 5, 8, 12, 7, 6, 2, 4 };
        int temp;
        int k=2;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                
                System.out.println(k+ " Largest Element is "+a[i]);
                break;    //if this write then only kth position solve 
            }
        }System.out.println("----------------------");
        for(int b:a){
            System.out.println(b);
        }

    }

    public static void main2(String[] args) {
        int[] a = { 12, 4, 3, 5, 2, 1, 6 };
        int largest = Integer.MIN_VALUE;
        int second_Largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second_Largest = largest;
                largest = a[i];
            } else if (a[i] > second_Largest && a[i] != largest) {
                second_Largest = a[i];
            }

        }
        System.out.println("Second largest " + second_Largest);
    }

    public static void main1(String[] args) {

        int[] a = { 12, 4, 3, 5, 2, 1, 6 };
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest element is " + a[1]);
    }
}