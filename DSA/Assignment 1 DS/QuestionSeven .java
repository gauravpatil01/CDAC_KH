class QuestionSeven {
    public void findRepeatedChars(String abc) {
        for (int i = 0; i < abc.length(); i++) {
            for (int j = i + 1; j < abc.length(); j++) {
                if (abc.charAt(i) == abc.charAt(j)) {
                    System.out.print(abc.charAt(i) + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuestionSeven obj = new QuestionSeven();
        obj.findRepeatedChars("programming");  // Output: r g m
        obj.findRepeatedChars("hello");        // Output: l
    }
}
