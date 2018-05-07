package cardgame;
/*
 * Programmer: Dylan Yang
 * Date: Jan 12, 2018
 * Purpose: to create a class with one method named turnOverCard() 
 */

public class Flip {
	
	public Flip() {
		
	}

	public String turnOverCard() {
		
		if (2 * Math.random() > 1)
			return "red";
		else
			return "black";
		
	}
	
}
