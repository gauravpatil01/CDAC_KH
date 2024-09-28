class QuestionEight {
    public int arrayManipulation(int n, int[][] queries) {
        int[] abc = new int[n + 1];
        for (int[] query : queries) {
            abc[query[0] - 1] += query[2];
            abc[query[1]] -= query[2];
        }
        int max = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += abc[i];
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        QuestionEight obj = new QuestionEight();
        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
        
        System.out.println(obj.arrayManipulation(5, queries1));
        System.out.println(obj.arrayManipulation(4, queries2));
    }
}
