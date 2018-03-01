
/*
 * Programmer: Dylan Yang
 * Date: November 14, 2017
 * Purpose: to calculate the average of the values in an array named 'finalGrade'
 */

public class GradeAverages {

	public static void main(String[] args) {

		double[] finalGrade = {85.8, 93.7, 76, 88.5, 100, 91.3};
		double sum = 0;

		for (int i = 0; i < finalGrade.length; i++)
			sum += finalGrade[i];

		System.out.printf("The averave of the grades is %.2f.", sum / finalGrade.length);

	}

}
