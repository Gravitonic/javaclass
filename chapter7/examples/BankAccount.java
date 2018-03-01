
/*
 * Programmer: Dylan Yang
 * Date: Dec 12, 2017
 * Purpose: TODO 
 */

public class BankAccount {

	// Data
	private double balance;
	private int accountNumber;
	private String password;
	
	// Constructors
	public BankAccount() {
		balance = 0;
		accountNumber = 0;
		password = "NONE";
	}
	
	public BankAccount(double initialDeposit, int acctNum, String pwd) {
		balance = initialDeposit;
		accountNumber = acctNum;
		password = pwd;
	}
	
	// Methods
	public double getBalance(String input) {
		if (input.equals(password))
			return balance;
	}
	
}
