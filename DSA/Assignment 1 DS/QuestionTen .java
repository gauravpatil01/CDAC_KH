class QuestionTen {
    public boolean isLeapYear(int abc) {
        if (abc % 4 == 0) {
            if (abc % 100 == 0) {
                return abc % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        QuestionTen obj = new QuestionTen();
        System.out.println(obj.isLeapYear(2020));  //true
        System.out.println(obj.isLeapYear(1900));  
    }
}
