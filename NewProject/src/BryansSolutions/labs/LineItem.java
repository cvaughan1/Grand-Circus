package BryansSolutions.labs;

import java.text.NumberFormat;
import java.util.Scanner;

public class LineItem {

	public static void main(String args[]) {

		System.out.println("Welcome to the Line Item Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// get input from user
			
			System.out.print("Enter Product Code:   ");
			String productCode = sc.nextLine();
			
			
			System.out.print("Enter quantity:    	");
			int quantity = Integer.parseInt(sc.nextLine());
			// set product price based on product code
			
			String productDescription = null;
			double price;
			
			if (productCode.equalsIgnoreCase("java")) {
				productDescription = "Murach's Java Programming";
				price = 57.50;
			} else if (productCode.equalsIgnoreCase("jsp")) {
				price = 57.50;
			} else if (productCode.equalsIgnoreCase("mysql")) {
				price = 54.50;
			} else if (productCode.equalsIgnoreCase("android")) {
				productDescription = "Android Description";
				price = 30;	
			} else {
				price = 0;
			}

		// calculate total

		double total = price * quantity;
		
		// format and display output
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceFormatted = currency.format(price);
		String totalFormatted = currency.format(total);
		
		
		String message = "\nLINE ITEM\n" + 
		"Code:	    		" + productCode + "\n" + 
		"Description:		" + productDescription + "\n" +
		"Price:			" + priceFormatted + "\n" +
		"Quantity:	 	" + quantity + "\n" + 
		"Total:	    		" + totalFormatted + "\n";

		System.out.println(message);
		
		// see if the user wants to continue)
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		sc.nextLine();
		}
	
	sc.close();
	System.out.println("Bye!");
	
	}// pvsm
}// class
	
	
	


