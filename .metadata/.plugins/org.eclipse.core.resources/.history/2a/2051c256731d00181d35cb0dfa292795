/*
 * Programmer: Dylan Yang
 * Date: Jan 25, 2018
 * Purpose: to create a BankAccount class with deposit(), withdraw(), reportBalance() and getAccountNumber() methods 
 */

public class BankAccount {

	protected String owner;
	protected double balance;
	private int accountNumber;

	public BankAccount() {
		owner = "DEFAULT ACCOUNT";
		balance = 0.00;
		accountNumber = 00000000;
	}

	public BankAccount(String owner) {
		this.owner = owner;
		balance = 0.00;
		accountNumber = 00000000;
	}

	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
		accountNumber = 00000000;
	}
	
	public BankAccount(String owner, double balance, int accountNumber) {
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance - amount > 0)
			balance -= amount;
	}

	public double reportBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

}
