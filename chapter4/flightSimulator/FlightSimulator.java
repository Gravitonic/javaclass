/*
 * Programmer: Dylan Yang
 * Date: Oct 17 2017
 * Purpose: to create a program assisting control room personnel with the NASA Vertical Motion Simulator
 */

import java.util.Scanner;

public class FlightSimulator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int input, characteristics = 0;
		boolean characteristic1 = false, characteristic2 = false, characteristic3 = false; // Tests whether characteristic has been programmed yet
		boolean characteristic4 = false, characteristic5 = false, characteristic6 = false; // Same as above
		boolean do_again = false; // Used to stay in or exit loop
		String inputStr, aircraft = "";

		// Asks which aircraft will be simulated.
		System.out.println("Welcome to the NASA VMS Control Room Assistance Program.\n"
				+ "Please enter the number of the aircraft to be simulated. Refer to the menu below.\n"
				+ "1. blimp\n"
				+ "2. helicopter\n"
				+ "3. fighter jet\n"
				+ "4. Space Shuttle");
		input = in.nextInt();

		// Error trap
		while (input < 1 || input > 4) {
			System.out.println("Your input of \"" + input + "\" was invalid. Please enter a number between one and four, inclusive.\n"
					+ "1. blimp\n"
					+ "2. helicopter\n"
					+ "3. fighter jet\n"
					+ "4. Space Shuttle");
			input = in.nextInt();
		}

		// Sets String aircraft
		switch (input) {
		case 1:
			aircraft = "blimp";
			break;
		case 2:
			aircraft = "helicopter";
			break;
		case 3:
			aircraft = "fighter jet";
			break;
		case 4:
			aircraft = "Space Shuttle";
			break;
		}

		in.nextLine(); // Clears Scanner

		// Menu of programmable characteristics.
		System.out.println("These characteristics can be programmed during a simulated flight in the VMS:\n"
				+ "1. Position Trim (Trim)\n"
				+ "2. Force Breakout (Return-to-Center Force)\n"
				+ "3. Force Gradient (Spring Force)\n"
				+ "4. Force Friction\n"
				+ "5. Damping\n"
				+ "6. Hard Stop");
		System.out.println("Do you wish to program any of these characteristics? (yes/no)");
		inputStr = in.nextLine();

		// Error trap
		while (!inputStr.equalsIgnoreCase("yes") && !inputStr.equalsIgnoreCase("no")) {
			System.out.println("You did not enter a valid input. Please enter \"yes\" or \"no\".");
			inputStr = in.nextLine();
		}

		if (inputStr.equalsIgnoreCase("yes"))
			do_again = true;

		while (do_again) {
			System.out.println("Please enter the number of one characteristic you would like to program. Refer to the menu.");
			input = in.nextInt();

			in.nextLine();

			// Error trap (not a valid integer input)
			while (input < 1 || input > 6) {
				System.out.println("Your input of \"" + input + "\" was invalid. Please enter a number between one and six.\n"
						+ "1. Position Trim (Trim)\n"
						+ "2. Force Breakout (Return-to-Center Force)\n"
						+ "3. Force Gradient (Spring Force)\n"
						+ "4. Force Friction\n"
						+ "5. Damping\n"
						+ "6. Hard Stop\n");
				input = in.nextInt();

				in.nextLine();
			}

			// Error trap (programmed same characteristic twice)
			switch (input) {
			case 1:
				if (characteristic1 == true) {
					do {
						System.out.println("You already programmed that characterisitc. Please select another.\n"
								+ "1. Position Trim (Trim)\n"
								+ "2. Force Breakout (Return-to-Center Force)\n"
								+ "3. Force Gradient (Spring Force)\n"
								+ "4. Force Friction\n"
								+ "5. Damping\n"
								+ "6. Hard Stop\n");
						input = in.nextInt();
						in.nextLine();
					} while (input == 1);
				}
				break;
			case 2:
				if (characteristic2 == true) {
					do {
						System.out.println("You already programmed that characterisitc. Please select another.\n"
								+ "1. Position Trim (Trim)\n"
								+ "2. Force Breakout (Return-to-Center Force)\n"
								+ "3. Force Gradient (Spring Force)\n"
								+ "4. Force Friction\n"
								+ "5. Damping\n"
								+ "6. Hard Stop\n");
						input = in.nextInt();
						in.nextLine();
					} while (input == 2);
				}
			case 3:
				if (characteristic3 == true) {
					do {
						System.out.println("You already programmed that characterisitc. Please select another.\n"
								+ "1. Position Trim (Trim)\n"
								+ "2. Force Breakout (Return-to-Center Force)\n"
								+ "3. Force Gradient (Spring Force)\n"
								+ "4. Force Friction\n"
								+ "5. Damping\n"
								+ "6. Hard Stop\n");
						input = in.nextInt();
						in.nextLine();
					} while (input == 3);
				}
			case 4:
				if (characteristic4 == true) {
					do {
						System.out.println("You already programmed that characterisitc. Please select another.\n"
								+ "1. Position Trim (Trim)\n"
								+ "2. Force Breakout (Return-to-Center Force)\n"
								+ "3. Force Gradient (Spring Force)\n"
								+ "4. Force Friction\n"
								+ "5. Damping\n"
								+ "6. Hard Stop\n");
						input = in.nextInt();
						in.nextLine();
					} while (input == 4);
				}
			case 5:
				if (characteristic5 == true) {
					do {
						System.out.println("You already programmed that characterisitc. Please select another.\n"
								+ "1. Position Trim (Trim)\n"
								+ "2. Force Breakout (Return-to-Center Force)\n"
								+ "3. Force Gradient (Spring Force)\n"
								+ "4. Force Friction\n"
								+ "5. Damping\n"
								+ "6. Hard Stop\n");
						input = in.nextInt();
						in.nextLine();
					} while (input == 5);
				}
			case 6:
				if (characteristic6 == true) {
					do {
						System.out.println("You already programmed that characterisitc. Please select another.\n"
								+ "1. Position Trim (Trim)\n"
								+ "2. Force Breakout (Return-to-Center Force)\n"
								+ "3. Force Gradient (Spring Force)\n"
								+ "4. Force Friction\n"
								+ "5. Damping\n"
								+ "6. Hard Stop\n");
						input = in.nextInt();
						in.nextLine();
					} while (input == 6);
				}
			}				

			switch (input) {
			case 1:
				System.out.println("Position Trim (Trim) - The position to which a flight control returns when the pilot releases it.");
				characteristic1 = true;
				break;
			case 2:
				System.out.println("Force Breakout (Return-to-Center Force) - A force that returns a control to Trim.\n"
						+ "This is constant force applied toward Trim which remains the same despite "
						+ "how far the control is moved (displacement) and how fast a control is moved (velocity).");
				characteristic2 = true;
				break;
			case 3:
				System.out.println("Force Gradient (Spring Force) - A force that returns a control to Trim, but "
						+ "one that varies with displacement. \n"
						+ "The farther the control is moved, the stronger the force applied toward Trim.");
				characteristic3 = true;
				break;
			case 4:
				System.out.println("Force Friction - A constant force that is opposite to the direction of movement.");
				characteristic4 = true;
				break;
			case 5:
				System.out.println("Damping - A force that is opposite to the direction of movement. "
						+ "Damping varies with velocity. The faster a control is moved, the stronger the force.");
				characteristic5 = true;
				break;
			case 6:
				System.out.println("Hard Stop - A force that simulates a mechanical limit of travel. "
						+ "By varying the Hard Stops, the range of travel can be adjusted.");
				characteristic6 = true;
				break;
			}
			characteristics++;

			if (characteristic1 && characteristic2 && characteristic3 && characteristic4 && characteristic5 && characteristic6) {
				do_again = false;
			} else {
				System.out.println("Do you wish to program another characteristic?");
				inputStr = in.nextLine();

				if (inputStr.equalsIgnoreCase("no"))
					do_again = false;
				else if (inputStr.equalsIgnoreCase("yes"))
					do_again = true;
				else { // Error trap
					do {
						System.out.println("Your input was not valid. Please enter  \"yes\" or \"no\".");
						inputStr = in.nextLine();
					} while (!inputStr.equalsIgnoreCase("yes") && !inputStr.equalsIgnoreCase("no"));
				}
			}


		}

		if (characteristics == 1)
			System.out.println("You have selected to simulate a " + aircraft + " flight with " + characteristics + " characteristic programmed.");
		else if (characteristics == 0)
			System.out.println("You have selected to simulate a " + aircraft + " flight with no characteristic programmed.");
		else
			System.out.println("You have selected to simulate a " + aircraft + " flight with " + characteristics + " characteristics programmed.");

		in.close();

	}
}
