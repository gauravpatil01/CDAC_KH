package in.question5;

import java.util.Scanner;


class TollBoothRevenueManager {

 double carRate;
 double truckRate;
 double motorcycleRate;
 int carCount;
 int truckCount;
 int motorcycleCount;


 public void setTollRates(double carRate, double truckRate, double motorcycleRate) {
     this.carRate = carRate;
     this.truckRate = truckRate;
     this.motorcycleRate = motorcycleRate;
 }


 public void acceptRecord(int carCount, int truckCount, int motorcycleCount) {
     this.carCount = carCount;
     this.truckCount = truckCount;
     this.motorcycleCount = motorcycleCount;
 }


 public double calculateRevenue() {
     double totalRevenue = (carRate * carCount) + (truckRate * truckCount) + (motorcycleRate * motorcycleCount);
     return totalRevenue;
 }


 public void printRecord() {
     int totalVehicles = carCount + truckCount + motorcycleCount;
     double totalRevenue = calculateRevenue();
     System.out.println("Total number of vehicles: " + totalVehicles);
     System.out.println("Total revenue collected: ₹" + totalRevenue);
 }
}



public class Program {
 public static void main(String[] args) {
    
     TollBoothRevenueManager obj = new TollBoothRevenueManager();

   
     obj.setTollRates(50.0, 100.0, 30.0);


     obj.acceptRecord(10, 5, 8);

     
     obj.printRecord();
 }
}

