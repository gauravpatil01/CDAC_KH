class QuestionNine {
    public boolean isPalindrome(int abc) {
        int original = abc, reverse = 0;
        while (abc != 0) {
            int xyz = abc % 10;
            reverse = reverse * 10 + xyz;
            abc /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        QuestionNine obj = new QuestionNine();
        System.out.println(obj.isPalindrome(121));   //  true
        System.out.println(obj.isPalindrome(-121));  //  false
    }
}
