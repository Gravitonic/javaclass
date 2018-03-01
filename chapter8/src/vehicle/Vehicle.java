package vehicle;
/*
 * Programmer: Dylan Yang
 * Date: Jan 22, 2018
 * Purpose: to create a vehicle class 
 */

public class Vehicle {

	protected String manufacturer;
	protected int year, doors, passengers;

	public Vehicle() {
		manufacturer = "Default Vehicle";
		year = 0000;
		doors = 0;
		passengers = 0;
	}

	public Vehicle(String manufacturer, int year, int doors, int passengers) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.doors = doors;
		this.passengers = passengers;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public void displayInfo() {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Year: " + year);
		System.out.println("Doors: " + doors);
		System.out.println("Passengers: " + passengers);
	}

}
