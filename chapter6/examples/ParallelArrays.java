
/*
 * Programmer: Dylan Yang
 * Date: Dec 5, 2017
 * Purpose: to
 */

public class ParallelArrays {

	public static void main(String[] args) {

		String[] titles = {"The Fellowship of the Ring", "The Two Towers", "The Return of the King", "The Hobbit", "The Silmarillion"};
		int[] numPages  = {423, 352, 440, 330, 365};
		
		System.out.printf("%-30s | %-5s %n", "BOOK TITLE", "PAGES");
		System.out.printf("%38s %n", "-------------------------------|------");
		for (int i = 0; i < titles.length; i++)
			System.out.printf("%-30s | %-5d %n", titles[i], numPages[i]);

	}

}
