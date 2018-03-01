/*
 * Programmer: Dylan Yang
 * Date: Jan 16, 2018
 * Purpose: TODO 
 */

public class ShowCardTester {

	public static void showCard(String[] cardColors) {

		String[] cardColorsFormatted = new String[cardColors.length];

		for (int i = 0; i < cardColors.length; i++) {

			if (cardColors[i].equalsIgnoreCase("red"))
				cardColorsFormatted[i] = " RED ";
			else if (cardColors[i].equalsIgnoreCase("black"))
				cardColorsFormatted[i] = "BLACK";
			else
				System.out.println("An error occured in the program. A card of color " + cardColors[i] + " could not be found.");

		}

		for (int i = 0; i < cardColorsFormatted.length; i++)
			System.out.print("* * * * * *  ");

		System.out.println();

		for (int j = 0; j < 3; j++) { // i < 3 is hard-coded since this is for the card's design, not affected by the number of cards

			for (int i = 0; i < cardColorsFormatted.length; i++)
				System.out.print("*         *  ");

			System.out.println();

		}

		for (int i = 0; i < cardColorsFormatted.length; i++)
			System.out.print("*  " + cardColorsFormatted[i] + "  *  ");
		
		System.out.println();


		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < cardColorsFormatted.length; i++)
				System.out.print("*         *  ");

			System.out.println();

		}
		
		for (int i = 0; i < cardColorsFormatted.length; i++)
			System.out.print("* * * * * *  ");

		System.out.println();

	}

	public static void main(String[] args) {

		String[] cards = {"red", "black", "red", "red"};

		showCard(cards);

	}

}
