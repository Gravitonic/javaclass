package bankAccountWithCustomer;
/*
 * Programmer: Dylan Yang
 * Date: Jan 25, 2018
 * Purpose: to create a BankAccount class with deposit(), withdraw(), reportBalance() and getAccountNumber() methods 
 */

public class BankAccount {

	protected Customer owner;
	protected double balance;
	private int accountNumber;

	protected BankAccount() {
		owner = null;
		balance = 0.00;
		accountNumber = 00000000;
	}

	protected BankAccount(Customer owner) {
		this.owner = owner;
		balance = 0.00;
		accountNumber = 00000000;
	}

	protected BankAccount(Customer owner, double balance) {
		this.owner = owner;
		this.balance = balance;
		accountNumber = 00000000;
	}
	
	protected BankAccount(Customer owner, double balance, int accountNumber) {
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	protected void setOwner(Customer owner) {
		this.owner = owner;
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
