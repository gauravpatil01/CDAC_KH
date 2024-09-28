class QuestionSeven {
    public int reverseNumber(int abc) {
        int xyz = 0;
        while (abc != 0) {
            xyz = xyz * 10 + abc % 10;
            abc /= 10;
        }
        return xyz;
    }

    public static void main(String[] args) {
        QuestionSeven obj = new QuestionSeven();
        System.out.println(obj.reverseNumber(12345));
        System.out.println(obj.reverseNumber(-9876));
    }
}
