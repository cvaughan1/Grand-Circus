package Labs;

import java.util.Scanner;

public class Lab4Factorial {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number fron 1 to 10");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("here: ");
		long num = sc.nextLong();
	
		
	int result = 1;
			       for (int i = 1; i <= num; i++) {
			           result = result * i;
			       }
			       System.out.println("The factorial of " + num + " is " + result);
			   }
			}
		
