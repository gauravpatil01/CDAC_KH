// package RajaSoft;

import java.util.*;

public class FindStartingPoint {

    public static String getStartingPoint(String[][] paths) {

        Set <String> destination =new HashSet<>();
        Set <String> sourse =new HashSet<>();

       
        for (String[] path : paths) {
            sourse.add(path[0]); 
            destination.add(path[1]); 
        }

        for(String src : sourse){
           if(!destination.contains(src)){
            return src;
           } 
        }

        return null;
    }

    public static void main(String[] args) {
        String[][] paths = { { "b", "c" }, { "a", "b" }, { "c", "d" } };

        System.out.println(getStartingPoint(paths));
    }
}
