
 /*
steps == take year ;
switch  inside it condition and use ternary operator 
condation ?  true :faluse 
*/

public class LeapYearSwitch {
    public static void main(String[] args) {
        int year = 2024;
      

        switch (year % 4 ==0 && (year % 100 !=0 || year %400 ==0) ? 1:0) { 
            case 1:
            System.out.println("year is leap year ");

            break;

            case 0:
            System.out.println("year is not a kleap year ");

            break;
              
        }
    }
}