/*
 * Programmer: Dylan Yang
 * Date: Jan 10, 2018
 * Purpose: to create a Box class that takes length, width, height, units, and a name. 
 */

public class Box {

	private double length;
	private double width;
	private double height;
	private String units;
	private String name;

	public Box() {
		name = "myBox";
		length = 1;
		width = 1;
		height = 1;
		units = "centimeters";
	}

	public Box(String name, double length, double width, double height, String units) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.units = units;
	}

	public void printInformation() {
		System.out.println("Name: " + name);
		System.out.println("Length: " + length + " " + units);
		System.out.println("Width: " + width + " " + units);
		System.out.println("Height: " + height + " " + units);
	}

	public double getVolume() {
		return length * width * height;
	}

	public String getVolumeUnits() {
		return "cubic " + units;
	}

	public double getSurfaceArea() {
		return 2 * (length * width + length * height + width * height);
	}

	public String getSurfaceAreaUnits() {
		return "square " + units;
	}

}
