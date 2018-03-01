/*
 * Programmer: Dylan Yang
 * Date: October 4, 2017
 * Purpose: to create a program to assist investigators in assigning "cruelty" fines
 */

import java.util.Scanner;

public class ComputerAbuse {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String investigator, offender; // names of investigator and offender
		int input;
		double fine;

		System.out.println("F.B.I.\n"
						 + "Federal Bureau of Investigation\n");
		System.out.print("Investigator Name: ");
		investigator = in.nextLine();
		System.out.print("Offender Name: ");
		offender = in.nextLine();

		System.out.println("\n\tWhat cruelty offense did you observe?   Here are the choices: \n"
						   + "\t     1. Name calling at the computer.       ( $49.95)         \n"
						   + "\t     2. Finger shaking at the computer.     ( $99.95)         \n"
						   + "\t     3. Yelling loudly at the computer.     ($149.95)         \n"
						   + "\t     4. Physically attacking the computer.  ($499.95)         \n");
		System.out.print("Offense Number: ");
		input = in.nextInt();

		if (investigator.equalsIgnoreCase("Mickey") && offender.equalsIgnoreCase("Minnie") && (input == 3 || input == 4)) {
			System.out.println("\nFines over $100 cannot be issued against a spouse.");
		}
		else {
			switch (input) {
			case 1:
				System.out.println("\n" + offender + " is to be charged $49.95, as reported by " + investigator + ".");
				break;
			case 2:
				System.out.println("\n" + offender + " is to be charged $99.95, as reported by " + investigator + ".");
				break;
			case 3:
				System.out.println("\n" + offender + " is to be charged $149.95, as reported by " + investigator + ".");
				break;
			case 4:
				fine = 499.95;
				if (offender.equalsIgnoreCase("Donald")) {
					fine = fine * 1.45;
				}
				System.out.printf("\n" + offender + " is to be charged $%.2f, as reported by " + investigator + ".", fine);
				break;
			default:
				System.out.println("You did not enter an appropriate repsonse. The program is ending.");
			}
		}

		in.close();
		
	}

}
