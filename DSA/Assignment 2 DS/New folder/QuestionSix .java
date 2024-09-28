class QuestionSix {
    public String reverseWords(String abc) {
        String[] words = abc.split(" ");
        StringBuilder xyz = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            xyz.append(words[i]).append(" ");
        }
        return xyz.toString().trim();
    }

    public static void main(String[] args) {
        QuestionSix obj = new QuestionSix();
        System.out.println(obj.reverseWords("Hello World"));
        System.out.println(obj.reverseWords("Java Programming"));
    }
}
