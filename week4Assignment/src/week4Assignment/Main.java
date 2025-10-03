package week4Assignment;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		DecimalFormat decFor = new DecimalFormat("#,##0.00");
		double userInput;
		double maxNumber = 0;
		double minNumber = 0;
		double numTotal = 0;
		double numAverage;
		
		for (int i = 1; i <=10; ++i) {
			System.out.println("Please enter grade number " + i + ": ");
			userInput = scnr.nextDouble();
			if (userInput > maxNumber) {
				maxNumber = userInput;
			}
			if (i == 1) {
				minNumber = userInput;
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
	}
}
