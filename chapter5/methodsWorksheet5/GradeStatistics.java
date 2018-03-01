/*
 * Programmer: Dylan Yang
 * Date: November 1, 2017
 * Purpose: to calculate the average, minimum, and maximum values of user-inputted grades
 */

import java.util.Scanner;

public class GradeStatistics {

	static Scanner in =  new Scanner(System.in);

	public static void main(String[] args) {

		int students;

		System.out.print("Please enter the number of students: ");
		students = in.nextInt();

		while (students < 1) {
			if (students == 0) {
				System.out.println("It looks like you do not wish to calculate any grade statistics. \n"
								 + "If you changed your mind, or entered an incorrect input by accident, please run the program again.");
				System.exit(0);
			}
			else {
				System.out.println("Your input was invalid. Please enter a number of at least 1.");
				students = in.nextInt();
			}
		}
		
		printGradeStats(students);
		
		in.close();

	}
	
	public static void printGradeStats(int students) {
		
		double input, min = 101, max = 0, total = 0;
		int count = 0;
		
		for (int i = 1; i <= students; i++) {

			input = getInput("the grade of student " + i, 1, 100);

			if (input < min)
				min = input;
			if (input > max)
				max = input;
			total += input;
			count++;

		}

		System.out.printf("The average is %.2f %n", total/count);
		System.out.println("The minimum is " + min);
		System.out.println("The maximum is " + max);
		
	}
	
	public static double getInput(String parameter, double min, double max) {

		double input;

		System.out.print("Please enter " + parameter + ": ");
		input = in.nextDouble();

		while (input < min || input > max) {
			System.out.println("Your input was invalid. Please enter a number between " + min + " and " + max + ": ");
			input = in.nextInt();
		}

		return input;

	}


}
