public class RemoveVowelsReverse {

    public static boolean isVowels(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }

    public static void main(String[] args) {
        String str = "Gaurav";
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowels(ch)) {
                res.append(ch);
            }

        }
        res.reverse();
        System.out.println(res.toString());
    }
}