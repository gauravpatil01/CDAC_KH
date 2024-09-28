class QuestionTwo {
    public int removeDuplicates(int[] abc) {
        if (abc.length == 0) return 0;
        int xyz = 1;
        for (int i = 1; i < abc.length; i++) {
            if (abc[i] != abc[i - 1]) {
                abc[xyz] = abc[i];
                xyz++;
            }
        }
        return xyz;
    }

    public static void main(String[] args) {
        QuestionTwo obj = new QuestionTwo();
        int[] arr1 = {1, 1, 2};
        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
        
        System.out.println(obj.removeDuplicates(arr1));
        System.out.println(obj.removeDuplicates(arr2));
    }
}
