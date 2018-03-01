package bankAccount;
/*
 * Programmer: Dylan Yang
 * Date: Jan 25, 2018
 * Purpose: TODO 
 */

public class Customer {
	
	String name;
	CheckingAccount checking;
	SavingsAccount savings;
	
	public Customer() {
		checking = new CheckingAccount(); // TODO pass this class as owner?
		savings = new SavingsAccount();
	}
	
	public Customer(String name) {
		this.name = name;
		checking = new CheckingAccount();
		savings = new SavingsAccount();
	}
	
	
	
	/*
	BankAccount[] accounts;
	
	public Customer() {
		accounts = new BankAccount[2];
	}
	
	public Customer(int accounts) {
		this.accounts = new BankAccount[accounts];
	}
	
	public boolean hasSavingsAccount() {
		for (BankAccount account : accounts)
			if (account instanceof SavingsAccount)
				return true;
		return false;
	}
	
	public boolean hasCheckingAccount() {
		for (BankAccount account : accounts)
			if (account instanceof CheckingAccount)
				return true;
		return false;
	}
	
	public SavingsAccount getSavingsAccount() {
		for (BankAccount account : accounts)
			if (account instanceof SavingsAccount)
				return (SavingsAccount) account;
		return null; 
	}
	
	public CheckingAccount getCheckingAccount() {
		for (BankAccount account : accounts)
			if (account instanceof CheckingAccount)
				return (CheckingAccount) account;
		return null;
	}
*/	
}
