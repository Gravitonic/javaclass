package box;
/*
 * Programmer: Dylan Yang
 * Date: Jan 10, 2018
 * Purpose: to test the Box class by allowing the user to continually create boxes 
 */

import java.util.Scanner;

public class TestBox {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double length, width, height;
		String name, units, input;
		boolean repeat = true;
		Box box;

		System.out.println("MakeBox 3.0");

		while (repeat) {

			System.out.print("Enter a name for your box: ");
			name = in.nextLine();

			System.out.print("Enter a length for your box: ");
			length = in.nextDouble();
			in.nextLine();

			while (length <= 0) {
				System.out.println("Your input was not valid. Please enter a positive number.");
				length = in.nextInt();
			}

			System.out.print("Enter a width for your box: ");
			width = in.nextDouble();
			in.nextLine();

			while (width <= 0) {
				System.out.println("Your input was not valid. Please enter a positive number.");
				width = in.nextInt();
			}

			System.out.print("Enter a height for your box: ");
			height = in.nextDouble();
			in.nextLine();

			while (height <= 0) {
				System.out.print("Your input was not valid. Please enter a positive number: ");
				height = in.nextInt();
			}

			System.out.print("Enter the unit of length for your measurements: ");
			units = in.nextLine();

			box = new Box(name, length, width, height, units);

			box.printInformation();

			System.out.printf("The volume of your box is %.2f %s. %n", box.getVolume(), box.getVolumeUnits());
			// System.out.println("The volume of your box is " + box.getVolume() + " " + box.getVolumeUnits());

			System.out.printf("The surface area of the box is %.2f %s. %n", box.getSurfaceArea(), box.getSurfaceAreaUnits());
			// System.out.println("The surface area of the box is " + box.getSurfaceArea() + " " + box.getSurfaceAreaUnits());

			System.out.print("Would you like to create another box? ");
			input = in.nextLine();

			while (!input.equals("yes") && !input.equals("y") && !input.equals("no") && !input.equals("n")) {
				System.out.print("Your input was invalid. Please enter \"yes\" or \"no\": ");
				input = in.nextLine();
			}

			if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n"))
				repeat = false;

		}

		in.close();

	}

}
