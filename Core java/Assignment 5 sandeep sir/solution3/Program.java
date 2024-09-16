package in.solution3;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	private static int totalEmployees = 0;
	private static double totalSalaryExpense = 0;
	int id;
	private String name;
	private double salary;

	// Constructor to initialize Employee details and update static fields
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		totalEmployees++;
		totalSalaryExpense += salary;
	}

	// Getter for total number of employees
	public static int getTotalEmployees() {
		return totalEmployees;
	}

	// Method to apply a percentage raise to the salary of all employees
	public static void applyRaise(double percentage, ArrayList<Employee> employees) {
		for (Employee emp : employees) {
			double raise = emp.salary * (percentage / 100);
			emp.salary += raise;
			totalSalaryExpense += raise;
		}
	}

	// Getter for total salary expense
	public static double calculateTotalSalaryExpense() {
		return totalSalaryExpense;
	}

	// Method to update the salary of an individual employee
	public void updateSalary(double newSalary) {
		totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
		this.salary = newSalary;
	}

	// Getter for individual employee's salary
	public double getSalary() {
		return salary;
	}

	// Override toString() method to represent Employee data
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Salary: ₹" + salary;
	}
}

public class Program {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("\nMenu:");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Total Employees");
			System.out.println("3. Apply Raise to All Employees");
			System.out.println("4. Update Employee Salary");
			System.out.println("5. Calculate Total Salary Expense");
			System.out.println("6. Display All Employees");
			System.out.println("7. Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Employee ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Employee Name: ");
				String name = sc.next();
				System.out.println("Enter Employee Salary: ");
				double salary = sc.nextDouble();
				employees.add(new Employee(id, name, salary));
				break;

			case 2:
				System.out.println("Total Employees: " + Employee.getTotalEmployees());
				break;

			case 3:
				System.out.println("Enter raise percentage: ");
				double percentage = sc.nextDouble();
				Employee.applyRaise(percentage, employees);
				break;

			case 4:
				System.out.println("Enter Employee ID to update salary: ");
				int empId = sc.nextInt();
				System.out.println("Enter new salary: ");
				double newSalary = sc.nextDouble();
				for (Employee emp : employees) {
					if (empId == emp.id) {
						emp.updateSalary(newSalary);
						break;
					}
				}
				break;

			case 5:
				System.out.println("Total Salary Expense: ₹" + Employee.calculateTotalSalaryExpense());
				break;

			case 6:
				for (Employee emp : employees) {
					System.out.println(emp);
				}
				break;

			case 7:
				exit = true;
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
		sc.close();
	}
}
