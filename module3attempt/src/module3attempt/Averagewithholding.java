package module3attempt;
import java.util.Scanner;

public class Averagewithholding {

	public static void main(String[] args) {
		// Entering an income amount and calculating the withheld taxes through if statements and tax percentages.
		double taxRate;
		int totalIncome;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter your income:");
		totalIncome = scnr.nextInt();
				
		if (totalIncome < 500) {
			taxRate = (totalIncome * .10);
			System.out.println(taxRate);
			
		}
		
		if ((totalIncome >= 500) && (totalIncome < 1500)) {
			taxRate = (totalIncome * .15);
			System.out.println(taxRate);
			
		}
		
		if ((totalIncome >= 1500) && (totalIncome < 2500)) {
			taxRate = (totalIncome * .20);
			System.out.println(taxRate);
		}
		
		if (totalIncome > 2500) {
			taxRate = (totalIncome * .30);
			System.out.println(taxRate);
		}
	}

}
