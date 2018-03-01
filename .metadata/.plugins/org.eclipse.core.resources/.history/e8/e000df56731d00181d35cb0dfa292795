/*
 * Programmer: Dylan Yang
 * Date: Jan 25, 2018
 * Purpose: to create a SavingsAccount class with payInterest() and setInterestRate() methods 
 */

public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount() {
		interestRate = 0.01;
	}
	
	public SavingsAccount(String owner, double interestRate) {
		super(owner);
		this.interestRate = interestRate;
	}

	public void payInterest() {
		balance += balance * interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
