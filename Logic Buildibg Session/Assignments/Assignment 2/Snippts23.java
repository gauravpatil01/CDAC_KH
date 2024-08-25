public class Snippts23 {
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
                break;
            case 2: 
                System.out.println("Value is 2"); 
                break;
            case 3: 
                System.out.println("Value is 3"); 
                break;
            default: 
                System.out.println("Default case");  // add break 
        } 
    } 
}
/*Snippet 23:  
public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 
 Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case? 
 */