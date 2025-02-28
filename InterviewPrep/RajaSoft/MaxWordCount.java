// package RajaSoft;

public class MaxWordCount {

    public static int getMaxWord(String[] sentence) {
        int maxWord=0;
        String maxSentence ="";
        for (String sentence1 :sentence){
            int count =sentence1.split(" ").length;
            maxWord=Math.max(maxWord,count);
            // maxSentence=sentence1;
            
        }return maxWord;
    }

    public static void main(String[] args) {
        String[] sentence = { "we are the Avengers", "im iron man", "Avengers are in the end game" };
        System.out.println(getMaxWord(sentence));
        
    }
}
