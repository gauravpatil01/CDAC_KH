class QuestionTwo {
    public boolean isPrime(int abc) {
        if (abc <= 1) return false;
        for (int xyz = 2; xyz <= abc / 2; xyz++) {
            if (abc % xyz == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        QuestionTwo obj = new QuestionTwo();
        System.out.println(obj.isPrime(29));  //  true
        System.out.println(obj.isPrime(15));  // false
    }
}
