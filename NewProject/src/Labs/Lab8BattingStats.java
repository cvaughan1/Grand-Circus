package Labs;

import java.util.Scanner;

public class Lab8BattingStats {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Batting Average Calculator!");
		System.out.println();
		String contin = "y";

		while (contin.equalsIgnoreCase("y")) {

			int atBatTotal = 0;
			int sum = 0;
			double battingAverage = 0.000;
			double sluggingPercentage = 0.000;
			int bCount = 0;

			while (contin.equalsIgnoreCase("y")) {
				sum = 0;
				bCount = 0;

				// Asks the user for the number of at bats for each player

				System.out.println("Please enter the player's TOTAL times at-bat for one game: ");

				atBatTotal = scanner.nextInt();
				// Create an array object to store the results of each at-bat
				int[] atBatsResults = new int[atBatTotal];
				// choices for at bat results
				System.out.println("\n 0 = out,\n 1 = single,\n 2 = double,\n 3 = triple,\n 4 = home run");
				// this for loop stores the user inputs for each at bat result
				// in an array called atBatResults
				for (int i = 0; i < atBatTotal; i++) {
				System.out.println("  Result for at-bat " + i + ": ");
					atBatsResults[i] = scanner.nextInt(); 
					
				// if the user enters a number less than 0 or greater than 5, this while loop asks them for valid input
				while (atBatsResults[i] < 0 || atBatsResults[i] > 5) {
				System.out.println("No. Way. THAT is not a valid option. Enter an at-Bat result between 0 and 4");
				atBatsResults[i] = scanner.nextInt(); 
																
					}

					sum = sum + atBatsResults[i]; // calculation for the sum of
													// the # of bases earned
					if (atBatsResults[i] > 0)
						bCount++; // counts the number of at bats where bases
									// were earned
				}

				battingAverage = (double) bCount / (double) atBatTotal; // calculates
																		// batting
																		// average;
																		
				System.out.println("Batting Average: ");
				System.out.printf("%.3f", battingAverage); // keeps result to 3
															// decimal places
				System.out.println();

				sluggingPercentage = (double) sum / (double) atBatTotal; // calculates the slugging percentage;
																		
				System.out.println("Slugging Percentage: ");
				System.out.printf("%.3f", sluggingPercentage); // keeps results to 3 decimal places
																
				System.out.println();//Skip line

				System.out.println("Would you like to enter stats for another batter? (y/n) :"); // Another Player?
				contin = scanner.next();

			}
			if (contin.equalsIgnoreCase("n")) { 
												
				System.out.println("Enjoy the game!");

			}

		}
		scanner.close();
	}

}