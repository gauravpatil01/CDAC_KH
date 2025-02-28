public class BubbleStringSort {
    public static void main(String[] args) {
        String[] str = { "deepak", "rahul", "amit", "vironika", "deepesh", "rohit" };
        String temp;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
       for(int i=0;i<str.length;i++){
        System.out.print(str[i]+ " ");
       }
    }
}
