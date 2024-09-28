class QuestionTen {
    public void leftRotate(int[] abc, int d) {
        d = d % abc.length;
        reverseArray(abc, 0, d - 1);
        reverseArray(abc, d, abc.length - 1);
        reverseArray(abc, 0, abc.length - 1);
    }

    private void reverseArray(int[] abc, int start, int end) {
        while (start < end) {
            int temp = abc[start];
            abc[start] = abc[end];
            abc[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        QuestionTen obj = new QuestionTen();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40};

        obj.leftRotate(arr1, 2);
        obj.leftRotate(arr2, 1);

        for (int num : arr1) System.out.print(num + " ");
        System.out.println();
        for (int num : arr2) System.out.print(num + " ");
    }
}
