package bankAccountWithCustomer;
/*
 * Programmer: Dylan Yang
 * Date: Jan 25, 2018
 * Purpose: to create a SavingsAccount class with payInterest() and setInterestRate() methods 
 */

public class SavingsAccount extends BankAccount {

	private double interestRate;

	protected SavingsAccount() {
		interestRate = 0.01;
	}
	
	protected SavingsAccount(Customer owner) {
		super(owner);
	}
	
	protected SavingsAccount(Customer owner, double interestRate) {
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
