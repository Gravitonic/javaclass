package calculation;
/*
 * Programmer: Dylan Yang
 * Date: Jan 19, 2018
 * Purpose: to test the Calculation class 
 */

public class CalculationTester {

	public static void main(String[] args) {
		
		MyCalculation calculator = new MyCalculation();
		
		System.out.println("Add: " + calculator.add(2, 3));
		System.out.println("Subtract: " + calculator.subtract(2, 3));
		
		System.out.println("Multiply: " + calculator.multiply(2, 3));
		System.out.println("Divide: " + calculator.divide(2, 3));
		
	}
	
}
