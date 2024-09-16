package org.solution;

//Create a base class BankAccount with methods like deposit() and withdraw(). 

//Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount.
//Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.

class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
			System.out.println("deposited :  " + amount);
		} else {
			System.out.println(amount + " not valid to add ");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("withrow :" + amount);
		} else {
			System.out.println(" your account not have that much balance  ");
		}
	}

	public double getBalance() {
		return balance;
	}
}

class SavingsAccount extends BankAccount {
	private Double withdrawLimit;

	public SavingsAccount(Double balance, Double withdrawLimit) {
		super(balance);
		this.withdrawLimit = withdrawLimit;
	}

	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			System.out.println(" account balance exeeds ");
		} else {
			super.withdraw(amount);
		}
	}

	public String getAccountdetails() {
		return " Savings Account Balance: " + getBalance() + ", Withdrawal Limit: " + withdrawLimit;
	}
}

public class Program {
	public static void main(String[] args) {
		SavingsAccount sobj = new SavingsAccount(10000.0, 5000.0);
		// sobj.deposit(5000);
		sobj.withdraw(2000);
		sobj.withdraw(2000);

		sobj.withdraw(2000);
		sobj.withdraw(1000);

		System.out.println(sobj.getAccountdetails());

	}
}
