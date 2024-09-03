// steps for leap year
// 1 == assign a year variable int type
//in if condition check if year%4 ==0 or year %100 !=0 and year%400 ==0
//print year


public class LeapYear {
    public static void main(String[]args){
        int year=2024;
          if(year % 4==0 && year % 100 !=0 || year %400 ==0){
            System.out.println("leap year");
          }
          else {
            System.out.println("not a leap year");
          }
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

public class LeapYear {

    public static void main(String[] args) {
        int year =2024;
        int a=year %4;
        int b=year %100;
        int c=year %400;

        if(a==0 && b!=0 ||c==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
    */