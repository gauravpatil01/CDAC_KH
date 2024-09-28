class QuestionFive {
    public int gcd(int abc, int xyz) {
        while (xyz != 0) {
            int temp = xyz;
            xyz = abc % xyz;
            abc = temp;
        }
        return abc;
    }

    public static void main(String[] args) {
        QuestionFive obj = new QuestionFive();
        System.out.println(obj.gcd(54, 24));  //6
        System.out.println(obj.gcd(17, 13));  //  1
    }
}
