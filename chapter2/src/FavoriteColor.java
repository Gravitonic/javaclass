/*
 * Programmer: Dylan Yang
 * Date: August 31 2017
 * Purpose: To tell the user their name and favorite color.
 */

import java.util.Scanner;

public class FavoriteColor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name;
		String color;
		
		System.out.println("What is your name?");
		name = in.nextLine();
		System.out.println("What is your favorite color?");
		color = in.nextLine();
		
		System.out.println(name + ", your favorite color is " + color + ".");
		
		in.close();
		
	}	
}
