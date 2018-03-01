package vehicle;
/*
 * Programmer: Dylan Yang
 * Date: Jan 23, 2018
 * Purpose: to extend the Vehicle class 
 */

public class Truck extends Vehicle {

	private int towingWeight, cargoArea, wheels;
	private float originalPrice;

	public Truck() {
		super();
		towingWeight = 0;
		cargoArea = 0;
		wheels = 0;
		originalPrice = 0;
	}

	public Truck(String manufacturer, int year, int doors, int passengers, int towingWeight, int cargoArea, int wheels, float originalPrice) {
		super(manufacturer, year, doors, passengers);
		this.towingWeight = towingWeight;
		this.cargoArea = cargoArea;
		if (wheels == 4 || wheels == 6)
			this.wheels = wheels;
		else
			wheels = 0;
		this.originalPrice = originalPrice;
	}

	public int getTowingWeight() {
		return towingWeight;
	}

	public void setTowingWeight(int towingWeight) {
		this.towingWeight = towingWeight;
	}

	public int getWheels() {
		return wheels;
	}

	public int setWheels(int wheels) {
		if (wheels == 4 || wheels == 6) {
			this.wheels = wheels;
			return 1;
		} else
			return 0;
	}

	public int getCargoArea() {
		return cargoArea;
	}

	public void setCargoArea(int cargoArea) {
		this.cargoArea = cargoArea;
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Towing Weight: " + towingWeight);
		System.out.println("Cargo Area: " + cargoArea);
		System.out.println("Wheels: " + wheels);
		System.out.println("Original Price: " + originalPrice);
	}

	public float calculateValue() {
		if (manufacturer == "Volvo")
			return (float) (originalPrice * Math.pow(0.8, 2018 - year)
					+ (float)5 * doors * passengers / 2
					+ 10 * wheels
					+ (float)50 * towingWeight / cargoArea);
		else
			return (float) (originalPrice * Math.pow(0.75, 2018 - year)
					+ 10 * wheels
					+ (float)500 * towingWeight / cargoArea);
	}

}
