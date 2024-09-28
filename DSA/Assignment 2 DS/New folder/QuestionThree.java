class QuestionThree {
    public String removeSpaces(String abc) {
        return abc.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        QuestionThree obj = new QuestionThree();
        System.out.println(obj.removeSpaces("Hello World"));
        System.out.println(obj.removeSpaces("  Java   Programming  "));
    }
}
