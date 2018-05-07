package cardgame;
/*
 * Programmer: Dylan Yang
 * Date: Jan 12, 2018
 * Purpose: to create a program that allows the user to play the card game until they choose to exit 
 */

import java.util.Scanner;

public class Game {


	public String[] playGame(int numCards) {

		Flip flipper = new Flip();
		DisplayCards printer = new DisplayCards();

		String[] results = new String[numCards];

		for (int i = 0; i < numCards; i++)
			results[i] = flipper.turnOverCard();

		printer.showCard(results);
		
		return results;

	}

	public int calculateTurnScore(String[] results) {

		int redCount = 0, blackCount = 0;

		for (int i = 0; i < results.length; i++) {
			if (results[i].equalsIgnoreCase("red"))
				redCount++;
			else if (results[i].equalsIgnoreCase("black"))
				blackCount++;
		}

		if (redCount == 0 || blackCount == 0)
			return 5;
		else if (redCount == blackCount)
			return 1;
		else
			return 0;

	}

	public int calculateGameScore(int gameScore, int turnScore) {

		gameScore += turnScore;

		return gameScore;

	}

	public int calculateGameScore(int gameScore, String[] results) {

		gameScore += calculateTurnScore(results);

		return gameScore;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] cards = new String[4];
		int gameScore = 0, turnScore = 0;
		boolean repeat = true;
		String input;
		Game game = new Game();

		System.out.println("CARD GAME PRO\n");

		while (repeat) {

			repeat = false;

			cards = game.playGame(4);

			turnScore = game.calculateTurnScore(cards);
			gameScore = game.calculateGameScore(gameScore, turnScore);

			if (turnScore == 1)
				System.out.println("You earned 1 point this turn.");
			else
				System.out.println("You earned " + turnScore + " points this turn.");

			if (gameScore == 1)
				System.out.println("Your overall score is 1 point.");
			else
				System.out.println("Your overall score is " + gameScore + " points.");

			System.out.print("Would you like to play again? ");
			input = in.nextLine();

			while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("y")
					&& !input.equalsIgnoreCase("no") && !input.equalsIgnoreCase("n")) {

				System.out.println("Your input of \"" + input + "\" was invalid. Please enter \"yes\" or \"no\".");
				input = in.nextLine();
				
			}
			
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"))
				repeat = true; // repeat is false by default

		}
		
		System.out.println("Thank you for playing CARD GAME PRO.");
		
		in.close();

	}

}
