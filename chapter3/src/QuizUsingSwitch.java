/*
 * Programmer: Dylan Yang
 * Date: October 4, 2017
 * Purpose: To perform an operation on two positive integers.
 */

import java.util.Scanner;

public class QuizUsingSwitch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num1, num2, input;
		
		System.out.println("Please enter a positive integer.");
		num1 = in.nextInt();
		System.out.println("Please enter another positive integers.");
		num2 = in.nextInt();
		
		if (num1>0 && num2>0) {
			System.out.println("Please enter the number of the operation you want.");
			System.out.println("1. add\n2. substract\n3. multiply\n4. divide");
			input = in.nextInt();
			switch (input) {
				case 1:
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break; //continued on reverse side
				case 2:
					System.out.println(num1 + " – " + num2 + " = " + (num1-num2));
					break;
				case 3:
					System.out.println(num1 + " × " + num2 + " = " + (num1*num2));
					/* original: System.out.println(num1 + " x " + num2 + " = " + (num1*num2)); */
					break;
				case 4:
					System.out.println(num1 + " ÷ " + num2 + " = " + ((double)num1/num2));
					/* original: System.out.println(num1 + " ÷ " + num2 + " = " + ((double)num1/num2)); */
					break;
				default:
					System.out.println("Please enter an integer between 1 and 4 to "
									 + "select an operation.");
					break;
			} // Closing bracket was not originally present.
		}
		else {
			System.out.println("Your numbers were invalid.");
		}
		
		in.close();
		
	}
}
