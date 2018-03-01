package calculation;
/*
 * Programmer: Dylan Yang
 * Date: Jan 19, 2018
 * Purpose: to extend the Calculation class and add multiply() and divide() methods 
 */

public class MyCalculation extends Calculation {

	public int multiply(int x, int y) {
		return x * y;
	}

	public float divide(int x, int y) {
		return (float)x / y;
	}
	
	public int add(int x, int y) { // doesn't actually add
		System.out.print("This add() method is in the MyCalculation class. ");
		return x * x * y;
	}
	
}
