/*
 * Programmer: Dylan Yang
 * Date: Jan 12, 2018
 * Purpose: to create a class with one method named showCard() 
 */

public class DisplayCards {

	public void showCard(String cardColor) {

		if (cardColor.equalsIgnoreCase("red")) {
			
			System.out.println("* * * * * *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("*   RED   *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("* * * * * *");
			
		} else if (cardColor.equalsIgnoreCase("black")) {
			
			System.out.println("* * * * * *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("*  BLACK  *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("*         *");
			System.out.println("* * * * * *");
			
		} else
			System.out.println("An error occured in the program. A card of color " + cardColor + " could not be found.");

	}
	
	public void showCard(String[] cardColors) {

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
			System.out.print("┌─────────┐  "); // top of card, with two spaces to separate cards

		System.out.println();

		
		// i < 3 is hard-coded since this is for the card's design, not affected by the number of cards
		// Rows 2, 3, and 4 on the card are identical
		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < cardColorsFormatted.length; i++)
				System.out.print("│         │  ");

			System.out.println();

		}

		for (int i = 0; i < cardColorsFormatted.length; i++)
			System.out.print("│  " + cardColorsFormatted[i] + "  │  ");
		
		System.out.println();


		for (int j = 0; j < 3; j++) {

			for (int i = 0; i < cardColorsFormatted.length; i++)
				System.out.print("│         │  ");

			System.out.println();

		}
		
		for (int i = 0; i < cardColorsFormatted.length; i++)
			System.out.print("└─────────┘  ");

		System.out.println();

	}

}
