class QuestionEight {
    public char firstNonRepeatedChar(String abc) {
        for (int i = 0; i < abc.length(); i++) {
            boolean found = true;
            for (int j = 0; j < abc.length(); j++) {
                if (i != j && abc.charAt(i) == abc.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found)
                return abc.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        QuestionEight obj = new QuestionEight();
        System.out.println(obj.firstNonRepeatedChar("stress")); // Output: t
        System.out.println(obj.firstNonRepeatedChar("aabbcc"));
    }
}
