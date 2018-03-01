
/*
 * Programmer: Dylan Yang
 * Date: November 14, 2017
 * Purpose: to store 10 random integers in an array, print the array backwards, and display the number of even integers.
 */

public class RandomIntegers {

	public static void main(String[] args) {

		int[] randInts = new int[10];
		int numEvens = 0;

		for (int i = 0; i < randInts.length; i++) {
			randInts[i] = (int)(Math.random() * 10);
			System.out.print(randInts[i]);
			if (randInts[i] % 2 == 0)
				numEvens++;
		}

		System.out.println();
		
		for (int i = randInts.length - 1; i >= 0; i--) {
			System.out.print(randInts[i]);
		}

		System.out.println();
		
		System.out.println("Number of even numbers: " + numEvens);
		
	}

}
