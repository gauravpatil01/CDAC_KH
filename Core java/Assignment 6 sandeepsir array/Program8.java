package in.solution1;
import java.util.Scanner;

class Data {
    private int[] arr; // Declare a single-dimensional array

    // Constructor to initialize the array with a given size
    public Data(int size) {
        arr = new int[size];
    }

    // Setter method to accept values for the array
    public void setArr(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

    // Getter method to retrieve a value from the array
    public int getArr(int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            System.out.println("Invalid index");
            return -1; // Return an invalid value to indicate error
        }
    }

    // Method to print the entire array
    public void printArray() {
        System.out.println("Array elements are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        Data data = new Data(size); // Instantiate the class and array

        // Setting values in the array using setter method
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element for index " + i + ":");
            data.setArr(i, sc.nextInt());
        }

        // Printing values of the array using getter method
        System.out.println("Array elements using getter:");
        for (int i = 0; i < size; i++) {
            System.out.print(data.getArr(i) + " ");
        }
        System.out.println();

        // Alternatively, print the entire array at once
        data.printArray();
    }
}
