class QuestionSix {
    public int sqrt(int abc) {
        int xyz = 0;
        while (xyz * xyz <= abc) {
            xyz++;
        }
        return xyz - 1;
    }

    public static void main(String[] args) {
        QuestionSix obj = new QuestionSix();
        System.out.println(obj.sqrt(16));  //  4
        System.out.println(obj.sqrt(27));  // 5
    }
}
