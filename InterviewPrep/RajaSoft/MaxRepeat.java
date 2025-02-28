public class MaxRepeat {
    public static void main(String[] args) {
        String binarayStr = "1110001111011100";
        int maxCount = 0;
        int count = 0;

        for (int a : binarayStr.toCharArray()) {
            if (a == '1') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;

            }

        }

        System.out.println(maxCount);

    }

}
