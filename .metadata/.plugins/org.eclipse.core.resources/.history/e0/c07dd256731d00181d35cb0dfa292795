/*
 * Programmer: Dylan Yang
 * Date: Jan 25, 2018
 * Purpose: to create a  CheckingAccount class that overrides the withdraw() method of BankAccount 
 */

public class CheckingAccount extends BankAccount {

	public CheckingAccount() {
	}
	
	public CheckingAccount(String owner) {
		super(owner);
	}

	public void withdraw(double amount) {
		if (balance - amount >= 0)
			balance -= amount;
	}

	public void withdraw(double amount, SavingsAccount account) {
		if (balance - amount < 0)
			account.withdraw(amount);
		else
			super.withdraw(amount);
	}
	
	public void withdraw(double amount, BankAccount[] accounts) {
		if (balance - amount < 0) {
			for (BankAccount account : accounts)
				if (account instanceof SavingsAccount)
					account.withdraw(amount);
		} else {
			super.withdraw(amount);
		}

	}
}
