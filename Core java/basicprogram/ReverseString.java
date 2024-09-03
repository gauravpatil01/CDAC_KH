/*
we have to use string method 
1) length()==>total number of character in String
2)charAt()==>charAt(i)get ith position value

steps
first assign name variable
then assign reversed variable for string which is empty first
then take length of str using lenghth method

in for loop 
assign i length-1 because index value starty from 0
then 
i>=0;i--;
revrsedstr= reversedstr + name.charAt(i)
print number
ok



*/

public class ReverseString {

    public static void main(String[] args) {
        String name="gaurav";
        String reversed ="";
        int lengthofname=name.length();

        for (int i = lengthofname-1; i>=0; i--) {
            reversed=reversed+name.charAt(i);
            
        }
        System.out.println("reversed "+reversed);
    }
}

