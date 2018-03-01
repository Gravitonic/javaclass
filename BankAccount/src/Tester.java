/*
 * Programmer: Dylan Yang
 * Date: Jan 29, 2018
 * Purpose: TODO 
 */

public class Tester {

	public static void main(String[] args) {

		CheckingAccount c = new CheckingAccount();
		SavingsAccount s = new SavingsAccount();
		BankAccount[] accounts = {c, s};

		c.deposit(1000);
		System.out.printf("Checking Account Balance: %.2f%n", c.reportBalance());
		
		s.deposit(2000);
		System.out.printf("Savings Account Balance: %.2f%n", s.reportBalance());

		System.out.println("\nCalling: c.withdraw(15000, accounts);\n");
		c.withdraw(1500, accounts);
		
		System.out.printf("Checking Account Balance: %.2f%n", c.reportBalance());
		System.out.printf("Savings Account Balance: %.2f%n", s.reportBalance());
		
		System.out.println("\nCalling: s.payInterest();\n");
		s.payInterest();
		System.out.printf("Checking Account Balance: %.2f%n", c.reportBalance());
		
		System.out.println("\nCalling: s.setInterestRate(0.02);\n");
		s.setInterestRate(0.02);
		
		System.out.println("\nCalling: s.payInterest();\n");
		s.payInterest();
		System.out.printf("Savings Account Balance: %.2f%n", s.reportBalance());
		

	}

}
