 class QuestionOne {
    public boolean isArmstrong(int abc) {
        int original = abc, sum = 0;
        while (abc != 0) {
            int xyz = abc % 10;
            sum += Math.pow(xyz, 3);
            abc /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        QuestionOne obj = new QuestionOne();
        System.out.println(obj.isArmstrong(153));  //  true
        System.out.println(obj.isArmstrong(123));  // false
    }
}


 