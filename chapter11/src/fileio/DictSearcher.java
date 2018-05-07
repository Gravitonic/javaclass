package fileio;
/*
 * Programmer: Dylan Yang
 * Date: 4 May 2018
 * Purpose: to search for a word selected by the user in words.txt
 */

import java.io.File;
import java.util.Scanner;

public class DictSearcher {
	public static void main(String[] args) {
		Scanner fileScanner, consoleScanner;
		final String FILE_LOCATION = "words.txt";
		File file;
		String key;
		boolean keyFound = false, repeat = true;
		String input;

		consoleScanner = new Scanner(System.in);


		while (repeat) {
			System.out.print("Enter a word: ");
			key = consoleScanner.nextLine();

			try {

				file = new File(FILE_LOCATION);
				fileScanner = new Scanner(file);

				while (fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					if (line.equalsIgnoreCase(key)) {
						keyFound = true;
						break;
					}
					keyFound = false;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			if (keyFound)
				System.out.println("That's a word!");
			else
				System.out.println("That is NOT a word!!!");

			System.out.print("Would you like to enter another word? ");
			input = consoleScanner.nextLine();
			if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no"))
				repeat = false;
		}

	}

}
