package dice;
/*
 * Programmer: Dylan Yang
 * Date: Jan 4, 2018
 * Purpose: to create a dice that can generate a random number from 1 to its number of sides 
 */

public class Dice {

	private int mySides;
	private int myRolls;

	public Dice() {
		mySides = 6;
		myRolls = 0;
	}

	public Dice(int sides) {
		mySides = sides;
		myRolls = 0;
	}

	public int roll() {
		myRolls++;
		return (int)(Math.random() * mySides + 1);
	}

	public int getRolls() {
		return myRolls;
	}

}
