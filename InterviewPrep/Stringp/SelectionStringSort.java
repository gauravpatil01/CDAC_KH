public class SelectionStringSort {
    public static void main(String[] args) {
        String[] str = { "deepak", "rahul", "amit", "vironika", "deepesh", "rohit" };
        int min;
        int temp;
        for (int i = 0; i < str.length; i++) {
            min = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[min]) < 0) {
                    min = j;
                }
            }
            temp = str[i];
            str[i] = str[min];
            str[min] = temp;
        }
    }for(int i=0;i<=str.length-1;i++){
        System.out.println(str[i]+" ");
    }
}
