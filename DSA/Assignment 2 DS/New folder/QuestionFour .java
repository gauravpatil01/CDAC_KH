class QuestionFour {
    public String reverseString(String abc) {
        StringBuilder xyz = new StringBuilder(abc);
        return xyz.reverse().toString();
    }

    public static void main(String[] args) {
        QuestionFour obj = new QuestionFour();
        System.out.println(obj.reverseString("hello"));
        System.out.println(obj.reverseString("Java"));
    }
}
