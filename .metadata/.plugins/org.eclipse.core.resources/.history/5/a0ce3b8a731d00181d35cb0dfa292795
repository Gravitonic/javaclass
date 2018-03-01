/*
 * Programmer: Dylan Yang
 * Date: Jan 22, 2018
 * Purpose: to test the Vehicle class 
 */

import java.util.Scanner;

public class VehicleTester {

	public static void main(String[] args) {

		int input;
		String manufacturer;
		int year, doors, passengers, towingWeight = 0, cargoArea = 0, wheels = 0;
		float originalPrice = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Would you like to create a new vehicle or truck?\n"
				+ "\t1. Vehicle\n"
				+ "\t2. Truck\n"
				+ "Please enter either 1 or 2.");
		input = in.nextInt();

		while (input != 1 && input != 2) {
			System.out.println("Your input of " + input + " was invalid. Please enter either 1 or 2.");
			input = in.nextInt();
		}

		in.nextLine();

		System.out.println("Please complete the form below.\n");

		System.out.print("Manufacturer: ");
		manufacturer = in.nextLine();

		System.out.print("Year: ");
		year = in.nextInt();

		while (year < 1886 || year > 2018) {
			System.out.println("Your input was invalid. Please enter a number between 1886 and 2018.");
			year = in.nextInt();
		}

		System.out.print("Doors: ");
		doors = in.nextInt();

		while (doors < 0) {
			System.out.println("Your input was invalid. Please enter a non-negative number.");
			doors = in.nextInt();
		}

		System.out.print("Passengers: ");
		passengers = in.nextInt();

		while (passengers < 0) {
			System.out.println("Your input was invalid. Please enter a non-negative number.");
			passengers = in.nextInt();
		}

		if (input == 2) {

			System.out.print("Towing Weight: ");
			towingWeight = in.nextInt();

			while (towingWeight < 0) {
				System.out.println("Your input was invalid. Please enter a non-negative number.");
				towingWeight = in.nextInt();
			}

			System.out.print("Cargo Area: ");
			cargoArea = in.nextInt();

			while (cargoArea < 0) {
				System.out.println("Your input was invalid. Please enter a non-negative integer.");
				cargoArea = in.nextInt();
			}

			System.out.print("Wheels: ");
			wheels = in.nextInt();

			while (wheels != 4 && wheels != 6) {
				System.out.println("Your input was invalid. Please enter either 4 or 6.");
				wheels = in.nextInt();
			}

			System.out.print("Original Price: ");
			originalPrice = in.nextFloat();

			while (originalPrice < 0) {
				System.out.println("Your input was invalid. Please enter a non-negative number.");
				originalPrice = in.nextFloat();
			}

		}

		if (input == 1) {
			System.out.println("\nHere's your new vehicle's specifications:");
			Vehicle v = new Vehicle(manufacturer, year, doors, passengers);
			v.displayInfo();
		}
		else if (input == 2) {
			System.out.println("\nHere's your new truck's specifications:");
			Truck t = new Truck(manufacturer, year, doors, passengers, towingWeight, cargoArea, wheels, originalPrice);
			t.displayInfo();
		}

		in.close();

	}

	/*public static void main(String[] args) {

		System.out.println("VEHICLE\n");

		Vehicle car = new Vehicle("Toyota", 2017, 4, 5);

		System.out.println("Manufacturer: " + car.getManufacturer());
		car.setManufacturer("Honda");
		System.out.println("Manufacturer changed to Honda.");
		System.out.println("Manufacturer: " + car.getManufacturer());

		System.out.println("Year: " + car.getYear());
		car.setYear(2016);
		System.out.println("Year changed to 2016.");
		System.out.println("Year: " + car.getYear());

		System.out.println("Doors: " + car.getDoors());
		car.setDoors(5);
		System.out.println("Doors changed to 5.");
		System.out.println("Doors: " + car.getDoors());

		System.out.println("Passengers: " + car.getPassengers());
		car.setPassengers(7);
		System.out.println("Passengers set to 7.");
		System.out.println("Passengers: " + car.getPassengers());

		System.out.println("\n\nTRUCK\n");

		Truck truck = new Truck("Toyota", 2018, 4, 5, 9400, 13898, 4, (float)50475.00);

		System.out.println("Manufacturer: " + truck.getManufacturer());
		truck.setManufacturer("Honda");
		System.out.println("Manufacturer changed to Honda.");
		System.out.println("Manufacturer: " + truck.getManufacturer());

		System.out.println("Year: " + truck.getYear());
		truck.setYear(2016);
		System.out.println("Year changed to 2016.");
		System.out.println("Year: " + truck.getYear());

		System.out.println("Doors: " + truck.getDoors());
		truck.setDoors(5);
		System.out.println("Doors changed to 5.");
		System.out.println("Doors: " + truck.getDoors());

		System.out.println("Passengers: " + truck.getPassengers());
		truck.setPassengers(7);
		System.out.println("Passengers set to 7.");
		System.out.println("Passengers: " + truck.getPassengers());


		System.out.println("Towing Weight: " + truck.getTowingWeight());
		truck.setTowingWeight(9500);
		System.out.println("Towing weight changed to 9500.");
		System.out.println("Towing Weight: " + truck.getTowingWeight());

		System.out.println("Cargo Area: " + truck.getCargoArea());
		truck.setCargoArea(14000);
		System.out.println("Cargo area changed to 14000.");
		System.out.println("Cargo Area: " + truck.getCargoArea());

		System.out.println("Wheels: " + truck.getWheels());
		truck.setWheels(6);
		System.out.println("Wheels changed to 6.");
		System.out.println("Wheels: " + truck.getWheels());

		System.out.println("Original Price: " + truck.getOriginalPrice());
		truck.setOriginalPrice((float)50750.00);
		System.out.println("Original price set to 50750.00.");
		System.out.println("Original Price: " + truck.getOriginalPrice());

	}*/

}
