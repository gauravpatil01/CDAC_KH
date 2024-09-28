class QuestionFour {
    public void fibonacci(int abc) {
        int x = 0, y = 1, z;
        System.out.print(x + " " + y);
        for (int i = 2; i < abc; i++) {
            z = x + y;
            System.out.print(" " + z);
            x = y;
            y = z;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuestionFour obj = new QuestionFour();
        obj.fibonacci(5);  // Output: 0 1 1 2 3
        obj.fibonacci(8);  // Output: 0 1 1 2 3 5 8 13
    }
}
