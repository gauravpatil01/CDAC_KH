public class ReplaceAlternate {
    public static void main(String[] args) {
        String s = "i.like.java.programming";
        System.out.println(replaceAlternate(s));
    }

    public static String replaceAlternate(String s) {
        String [] words =s.split("\\.");
        for(int i=1;i<words.length;i+=2){
            words[i]="xyz";
        }
        
        
        return String.join(".", words);
    }
}
