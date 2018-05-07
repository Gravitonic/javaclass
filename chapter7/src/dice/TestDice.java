package dice;
import util.Arrays;

/*
 * Programmer: Dylan Yang
 * Date: Jan 4, 2018
 * Purpose: to generate two die with 6 and 10 sides, and roll each 10 times 
 */

public class TestDice {

	public static void main(String[] args) {

		Dice dice6 = new Dice();
		Dice dice100 = new Dice(100);
		int[] frequencies6 = {0, 0, 0, 0, 0, 0}; // frequencies of rolling 1, 2, 3, 4, 5, and 6
		int[] frequencies100 = new int[100];
		
		// six-sided dice
		
		for (int i = 0; i < 100000; i++)
			frequencies6[dice6.roll() - 1]++;
		
		System.out.println("SIX-SIDED DICE");
		for (int i = 0; i < frequencies6.length; i++)
			System.out.println("A " + (i + 1) + " was rolled " + frequencies6[i] + " times.");
		
		System.out.printf("On average, each number was rolled %.2f times.", Arrays.average(frequencies6));
		
		
		// hundred-sided dice
		
		for (int i = 0; i < frequencies100.length; i++)
			frequencies100[i] = 0; // initialize elements of frequencies100 to zero
		
		for (int i = 0; i < 100000; i++)
			frequencies100[dice100.roll() - 1]++;
		
		System.out.println();
		
		System.out.println("HUNDRED-SIDED DICE");
		for (int i = 0; i < frequencies100.length; i++)
			System.out.println("A " + (i + 1) + " was rolled " + frequencies100[i] + " times.");
		
		System.out.printf("On average, each number was rolled %.2f times.", Arrays.average(frequencies100));
		
			
		/* ORIGINAL CODE
		Dice Dice6 = new Dice();
		Dice Dice100 = new Dice(100);

		System.out.println("SIX-SIDED DICE");
		for (int i = 0; i < 10; i++)
			System.out.println("Roll " + (i + 1) + ": " + Dice6.roll());
		System.out.println("This dice has been rolled " + Dice6.getRolls() + " times.");

		System.out.println();

		System.out.println("HUNDRED-SIDED DICE");
		for (int i = 0; i < 10; i++)
			System.out.println("Roll " + (i + 1) + ": " + Dice100.roll());
		System.out.println("This dice has been rolled " + Dice100.getRolls() + " times.");
		 */

	}

}
