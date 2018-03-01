package checkingAccountStatic;
/*
 * Programmer: Dylan Yang
 * Date: Dec 13, 2017
 * Purpose: to design a class with the methods getBalance(), processDeposit(), and processCheck() 
 */

public class CheckingAccount {

	// data
	private static double balance = 0.0;
	
	// methods
	public static double getBalance(){
		return balance;
	}
	public static void processDeposit(double amount) {
		balance += amount;
	}
	public static void processCheck(double amount) {
		balance -= amount;
	}
	
}
