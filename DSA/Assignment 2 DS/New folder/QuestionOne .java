class QuestionOne {
    public void printPattern(int abc) {
        for (int i = 1; i <= abc; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QuestionOne obj = new QuestionOne();
        obj.printPattern(3);
        obj.printPattern(5);
    }
}
