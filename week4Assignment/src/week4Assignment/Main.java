package week4Assignment;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		DecimalFormat decFor = new DecimalFormat("0.00"); // Format grades to 2 decimal places 
		final int GRADE_NUMBER = 10;
		double userInput = 0; // initialize userInput for use outside of validation loop
		double numAverage = 0;
		double maxNumber = -1; // set value to compare for maximum and allow for grade of 0
		double minNumber = 101; // set value to compare to minimum and allow for grade of 100
		double numTotal = 0;
		boolean inputValid = false; // initialize to false to start
		
		for (int i = 1; i <= GRADE_NUMBER; ++i) {  // For loop for user to enter 10 grades
			inputValid = false; // reset boolean to false for each loop
			
			while(!inputValid) {  // while loop for input validation
				System.out.println("Please enter grade number " + i + ": ");
				if (scnr.hasNextDouble()) {
					userInput = scnr.nextDouble();
					if (userInput >= 0 && userInput <= 100) {
						inputValid = true;
					} else {
						System.out.println("Please enter a grade between 0 and 100.");
					}
				} else {
					System.out.println("Input not valid. Please try again.");
					scnr.next();
				}
			}
			if (userInput > maxNumber) {
				maxNumber = userInput;
			}
			if (userInput < minNumber) {
				minNumber = userInput;
			}
			numTotal = numTotal + userInput;
		}
		numAverage = numTotal / GRADE_NUMBER;
		
		System.out.println("The average score is: " + decFor.format(numAverage) + "%");
		System.out.println("The highest score is: " + decFor.format(maxNumber) + "%");
		System.out.println("The lowest score is: " + decFor.format(minNumber) + "%");
		
		scnr.close();
	}	
}