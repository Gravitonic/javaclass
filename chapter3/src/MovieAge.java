/*
 * Programmer: Dylan Yang
 * Date: September 26 2017
 * Purpose: To determine whether the user is old enough to watch a movie.
 */

import java.util.Scanner;

public class MovieAge {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int age;
		String name, first;

		System.out.println("What is your name?");
		name = in.nextLine();
		
		// Extracts last name and capitalizes first letter of both first and last name.
		name = name.substring(0,1).toUpperCase() + name.substring(1); 						 // Capitalizes first letter
		if (name.indexOf(" ") > 1) {
			name = name.substring(0, name.indexOf(" ")+1) 									 // Maintains first name up to space
					+ name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase()  // Finds first letter of last name after space
					+ name.substring(name.indexOf(" ") + 2); 								 // Maintains rest of last name
			first = name.substring(0,name.indexOf(" ")); 									 // Sets variable to first name
		}
		else
			first = name;
		
		System.out.println("What is your age?");
		age = in.nextInt();

		if (age < 17)
			System.out.println("Sorry, this movie is rated \"R\". Admission denied.");
		else
			System.out.println(first + ", welcome to the movie!");

		in.close();

	}
}
