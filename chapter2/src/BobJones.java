

/*
 * Programmer: Dylan Yang
 * Date: September 6 2017
 * Purpose: To use substring to reverse a name
 */

public class BobJones {
	
	public static void main(String[] args) {
		
		String name;
		
		name = "Jones, Bob";
		
		System.out.println(name.substring(7, 10) + " " + name.substring(0, 5));
		
	}
}
