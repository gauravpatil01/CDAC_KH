class QuestionFive {
    public void reverseArray(int[] abc) {
        int start = 0;
        int end = abc.length - 1;
        while (start < end) {
            int temp = abc[start];
            abc[start] = abc[end];
            abc[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        QuestionFive obj = new QuestionFive();
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {7, 8, 9};
        
        obj.reverseArray(arr1);
        obj.reverseArray(arr2);

        for (int num : arr1) System.out.print(num + " ");
        System.out.println();
        for (int num : arr2) System.out.print(num + " ");
    }
}
