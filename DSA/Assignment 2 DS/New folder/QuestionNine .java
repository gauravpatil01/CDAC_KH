class QuestionNine {
    public boolean isPalindrome(String abc) {
        int start = 0;
        int end = abc.length() - 1;
        while (start < end) {
            if (abc.charAt(start) != abc.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        QuestionNine obj = new QuestionNine();
        System.out.println(obj.isPalindrome("madam"));
        System.out.println(obj.isPalindrome("hello"));
    }
}
