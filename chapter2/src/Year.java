/*
 * Programmer: Dylan Yang
 * Date: August 29 2017
 * Purpose: To display the current year in scores
 */
import java.util.Scanner;

public class Year {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter the current year below");
		num = in.nextInt();
		
		System.out.println(num/20 + " score and " + num%20 + " years");
		
		in.close();
	}
}
