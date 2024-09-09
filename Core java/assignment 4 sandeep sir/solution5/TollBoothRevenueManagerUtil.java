package in.solution5;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
    private TollBoothRevenueManager manager;

    // Constructor accepting the TollBoothRevenueManager instance
    public TollBoothRevenueManagerUtil(TollBoothRevenueManager manager) {
        this.manager = manager;
    }

    // Method to set vehicle counts
    public void acceptRecord() {
        manager.setCarCount(100);
        manager.setTruckCount(50);
        manager.setMotorcycleCount(150);
    }

    // Method to print the toll booth record
    public void printRecord() {
        if (manager != null) {
            System.out.println(manager.toString());
        } else {
            System.out.println("No information about vehicles available.");
        }
    }

    // Method to display the menu and perform actions
    public void menuList() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Accept Record");
            System.out.println("2. Print Record");
            System.out.println("3. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acceptRecord();
                    System.out.println("Record accepted.");
                    break;
                case 2:
                    printRecord();
                    break;
                case 3:
                    System.out.println("Exiting recORD ");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
