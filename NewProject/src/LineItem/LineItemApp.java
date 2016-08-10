/* 
 * This homework assignment is meant to give us hands-on debugging experience. 
This should help me identify logic errors. I'm glad that I got a chance to 
practice debugging using Eclipse because that's what we will be expected to do 
on the job. 
*  
*/
package LineItem;

import java.util.Scanner;
import LineItem.ProductDB;
import LineItem.LineItem;
import LineItem.Product;

public class LineItemApp {

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
			
		ProductDB db = new ProductDB();	
		Product product = ProductDB.getProduct(productCode);	
		
		LineItem lineItem = new LineItem(product, quantity);	
			
		

		String message = "\nLINE ITEM\n" + 
		"Code:	    		" + product.getCode() + "\n" + 
		"Description:		" + product.getDescription() + "\n" +
		"Price:			" + product.getPriceFormatted() + "\n" +
		"Quantity:	 	" + lineItem.getQuantity() + "\n" + 
		"Total:	    		" + lineItem.getTotalFormatted() + "\n";
		
		System.out.println(message);
		
		// see if the user wants to continue)
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		sc.nextLine();
		}
	
	
	System.out.println("Bye!");
	sc.close();
	}// pvsm
}// class
	
	
	


