package preWork;

import java.util.Scanner;

class ReverseNumber {
	public static void main(String args[]) {

		int n, reverse = 0;

		// Print initial message
		System.out.println("Enter the number to reverse, then press enter");

		// Accept input from User
		Scanner inputFromUser = new Scanner(System.in);
		n = inputFromUser.nextInt();

		/*
		 Algorithm switches the digits around for 2345
		  
		 first time: reverse = 5, n = 234 
		 second time: reverse = 5 * 10 + 4 = 54, n = 23 
		 third time: reverse = 54 * 10 + 3 = 543, n = 2 
		 fourth time: reverse = 543 * 10 + 2 = 5432, n = 0
		 
		 a. Modulus 10 extracts the rightmost digit off input number.
		 (2345 % 10) = 5
		  
		 b. Multiply reverse by 10; this exposes a zero to the right of 
		 (5).
		  
		 c. Takes that number and adds it to the new reverse.
		  
		 */

		while (n != 0) {

			reverse = reverse * 10 + n % 10;
			n = n/10; /* Divide the n by 10, (removing the rightmost integer
					   digit). (2345 / 10) = 234 
					   */
		}

		// Reveal the Reversed number
		
		System.out.println("Reverse of the entered number is " + reverse);
		inputFromUser.close();

	} // PVSM
}// class
