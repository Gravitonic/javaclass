package checkingaccount;

/*
 * Programmer: Dylan Yang
 * Date: Dec 11, 2017
 * Purpose: TODO
 */

public class CheckingAccount {
	
	// CheckingAccount data
	private double myBalance;
	private String myAccountNumber;
	
	// CheckingAccount constructors
	public CheckingAccount() {
		myBalance = 0;
		myAccountNumber = "NEW";
	}
	
	public CheckingAccount(double initialBalance, String acctNum) {
		myBalance = initialBalance;
		myAccountNumber = acctNum;
	}
	
	// CheckingAccount methods
	public double getBalance() {
		return myBalance;
	}
	
	public void processDeposit(double amount) {
		myBalance += amount;
	}
	
	public void processCheck(double amount) {
		myBalance -= amount;
	}
	
	// Custom methods (not in textbook)
	public String getAccountNumber() {
		return myAccountNumber;
	}
	
}