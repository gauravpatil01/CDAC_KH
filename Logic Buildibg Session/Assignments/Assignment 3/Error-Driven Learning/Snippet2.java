public class Snippet2 {
    public static void main(String[] args) { 
        int count = 5; 
        while (count > 0) { //count = 0, which is an assignment, not a comparison. This will always evaluate to false
            System.out.println(count); 
            count--; 
        } 
    }
    
}

/*
 Snippet 2:  
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
// Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop? 
 */