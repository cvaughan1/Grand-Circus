package Labs;

import java.util.Random;
import java.util.Scanner;

public class Lab5DiceRoll {

	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n):");
		Scanner scan = new Scanner(System.in);

		String roll;
		String rollAgain;

		int value;
		int value2;

		Random randomValue = new Random();
		roll = scan.nextLine();

		do {
			if (roll.equalsIgnoreCase("y")) {

				value = randomValue.nextInt(6);
				value2 = randomValue.nextInt(6);
				System.out.println("Roll: " + (value + 1) + " and " + (value2 + 1));

			} else if (roll.equalsIgnoreCase("n")) {
				System.out.println("Out!");

			}

			System.out.println("Roll Again? (y/n)");
			rollAgain = scan.nextLine();
		}

		while (rollAgain.equals("y"));
		System.out.println("Loser!!!");
		scan.close();

	}

}
