class QuestionThree {
    public int factorial(int abc) {
        int xyz = 1;
        for (int i = 1; i <= abc; i++) {
            xyz *= i;
        }
        return xyz;
    }

    public static void main(String[] args) {
        QuestionThree obj = new QuestionThree();
        System.out.println(obj.factorial(5));  //  120
        System.out.println(obj.factorial(0));  //  1
    }
}
