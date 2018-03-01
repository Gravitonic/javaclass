/*
 * Programmer: Dylan Yang
 * Date: September 8 2017
 * Purpose: To print the number of teams of 7 and the remainder for an user-entered number.
 */

import java.util.Scanner;

public class VolleyballTeams {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int players;
		
		System.out.println("Please enter the number of players.");
		players = in.nextInt();
		
		System.out.println("There will be " + players / 7 + " teams with " + players % 7 + " players left over.");
		
		in.close();

	}
	
}
