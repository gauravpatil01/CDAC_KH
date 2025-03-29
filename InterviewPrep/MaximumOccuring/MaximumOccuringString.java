
public class MaximumOccuringString {
    public static void main(String[] args) {
        String str = "aa bb   cc  dd  ee sss";
        str = str.replaceAll("\\s", "");
        int[] arr = new int[256];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1; // add value at index position

        }
        int max = -1;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        System.out.println("Max repeat character is  " + ch);

    }
}
