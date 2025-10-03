package week4Assignment;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		DecimalFormat decFor = new DecimalFormat("0.00"); // Format grades to 2 decimal places 
		double userInput, maxNumber, minNumber, numTotal, numAverage;
		
		System.out.println("Please enter grade number 1: "); // Assign value to variables  
		userInput = scnr.nextDouble();
		numTotal = userInput;
		minNumber = userInput;
		maxNumber = userInput;
		
		for (int i = 2; i <=10; ++i) {  // Start for loop with grade 2 after variables have value
			System.out.println("Please enter grade number " + i + ": ");
			userInput = scnr.nextDouble();
			if (userInput > maxNumber) {
				maxNumber = userInput;
			}
			if (userInput < minNumber) {
				minNumber = userInput;
			}
			numTotal = numTotal + userInput;
		}
		numAverage = numTotal / 10;
		
		System.out.println("The average score is: " + decFor.format(numAverage));
		System.out.println("The highest score is: " + decFor.format(maxNumber));
		System.out.println("The lowest score is: " + decFor.format(minNumber));
		
		scnr.close();
	}
	
}
