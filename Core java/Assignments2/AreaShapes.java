/* area
  circle= pi * r2
  square = side2;
  rectangle =l *w;
  trangle =0.5 * base of tran *h

  take user inpute which you want
  scanner 
  then switch
  inside switch write formula
  


 */

import java.util.Scanner;

public class AreaShapes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");

        int select =sc.nextInt();

        switch (select) {
            
        
            case 1:
            System.out.println("whats is radius of circle");
            double radius=sc.nextDouble();
            double areaofcircle= 3.14 * (radius*radius);
            System.out.println(areaofcircle);
                
                break;
            case 2:

            System.out.println(" side of square ");
            double side=sc.nextDouble();
            double areasquare =side*side;
            System.out.println(areasquare);
                
                break;
        
            case 3:
            System.out.println("whats is length and width  of Rectangle");
            double length=sc.nextDouble();
            double width=sc.nextDouble();
            double areaofractangle =length*width;
            System.out.println(areaofractangle);
                
                break;
        
            case 4:
            System.out.println("whats is base and height of trangle ");
            double base=sc.nextDouble();
            double height=sc.nextDouble();
            double areaOfTrangle = 0.5* base *height;
            System.out.println(areaOfTrangle);
                
                break;
        


            default:
            System.out.println("please provide right shape");
                break;
        }
    }

}
