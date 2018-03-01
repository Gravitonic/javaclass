package checkingAccount;
/*
 * Programmer: Dylan Yang
 * Date: Dec 13, 2017
 * Purpose: to test the CheckingAccount class 
 */

import java.util.Scanner;

public class TestCheckingAccount {

	public static void main(String[] args) {

		// BASIC FUNCTIONALITY

		/*
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();

		System.out.printf("Account 1 has a balance of $%.2f %n", account1.getBalance());
		account1.processDeposit(100);
		System.out.printf("Account 1 has a balance of $%.2f %n", account1.getBalance());

		account2.processDeposit(1000);
		System.out.printf("Account 2 has a balance of $%.2f %n", account2.getBalance());
		account2.processCheck(500);
		System.out.printf("Account 2 has a balance of $%.2f %n", account2.getBalance());
		 */


		// USER INTERFACE

		Scanner in = new Scanner(System.in);
		int input;
		boolean repeat = true;
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();
		CheckingAccount account;

		// Print header
		System.out.println("* * * * * * * * * * * * *");
		System.out.println("* We welcome you to the *");
		System.out.println("*    JAVA WORLD BANK    *");
		System.out.println("* * * * * * * * * * * * *");

		do {

			System.out.println("Which account do you wish to use?\n"
					+ "\t1. Account 1\n"
					+ "\t2. Account 2\n"
					+ "\t3. Exit\n"
					+ "Please enter either 1, 2, or 3."); 
			input = in.nextInt();
			while (input < 1 || input > 3) {
				System.out.println("Sorry, I didn't get that. Please enter either 1, 2, or 3.");
				input = in.nextInt();
			}
			if (input == 1)
				account = account1;
			else if (input == 2)
				account = account2;
			else
				break;
			System.out.println("How can I help you?\n"
					+ "\t1. View balance\n"
					+ "\t2. Deposit money\n"
					+ "\t3. Process a check\n"
					+ "Please enter the corresponding number.");
			input = in.nextInt();
			while (input < 1 || input > 3) {
				System.out.println("Sorry, I didn't get that. Please enter a number from one to three, inclusive.");
				input = in.nextInt();
			}

			switch (input) {
			case 1:
				System.out.printf("Your account balance is $%.2f. %n", account.getBalance());
				break;
			case 2:
				System.out.print("How much money would you like to deposit? ");
				input = in.nextInt();
				while (input <= 0) {
					System.out.println("Sorry, I didn't get that. Please enter a positive number.");
					input = in.nextInt();
				}
				account.processDeposit(input);
				System.out.printf("Your account balance is now $%.2f. %n", account.getBalance());
				break;
			case 3:
				System.out.print("How much money is the check worth? ");
				input = in.nextInt();
				while (input <= 0) {
					System.out.println("Sorry, I didn't get that. Please enter a positive number.");
					input = in.nextInt();
				}
				if (account1.getBalance() - input >= 0) {
					account1.processCheck(input);
					System.out.printf("Your account balance is now $%.2f. %n", account.getBalance());
				} else {
					System.out.println("You do not have enough money in your account.");
					System.out.printf("Your account balance is only $%.2f. %n", account.getBalance());
				}

			}

			/*
			System.out.println("Is there anything else that I can help you with?\n"
					+ "\t1. Yes\n"
					+ "\t2. No\n"
					+ "Please enter the corresponding number.");
			input = in.nextInt();
			while (input < 1 || input > 2) {
				System.out.println("Sorry, I didn't get that. Please enter either one or two.");
				input = in.nextInt();
			}

			if (input == 1)
				repeat = true; // repeat was false by default when this was written
			 */

		} while (repeat);

		System.out.println("Thank you for choosing the Java World Bank. We hope to see you again soon.");

		in.close();

	}

}
