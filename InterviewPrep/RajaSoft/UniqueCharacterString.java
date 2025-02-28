import java.util.HashMap;

public class UniqueCharacterString{
    public static void main(String[] args) {
        String str="Nitin";
        str=str.toLowerCase();
        HashMap<Character,Integer> freq =new HashMap<>();

        for(char ch:str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0 )+1);

        }

        for(char ch :str.toCharArray()){
            if(freq.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}