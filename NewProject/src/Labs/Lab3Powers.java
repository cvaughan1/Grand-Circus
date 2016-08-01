package Labs;
import java.util.Scanner;

public class Lab3Powers {

		public static void main(String[] args) {
			
	        System.out.println("Learn your squares and cubes");
	        System.out.println();
	       
	        Scanner sc = new Scanner(System.in);
	      
       	         
	        String choice = "y";
	        while(choice.equalsIgnoreCase("y"))
	        {
	                // input from the user
	                System.out.println("Enter an Integer: ");
	                int integerNext = sc.nextInt();     
	                 
	                
	                System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");       
	                System.out.println("======" + "  " + "======"+ "  " + "======");
			  for (int i = 1; i <= integerNext; i++)
		        {      
		        int numberSquared = (int) Math.pow(i, 2);
		        int numberCubed = (int) Math.pow (i, 3); 
		        String message = i + "\t" + numberSquared + "\t" + numberCubed;
		         
		        System.out.println(message);
		        System.out.println();
		        }
		        //Continue?
		        System.out.print("Continue? (y/n): ");
		        choice = sc.next();
		        System.out.println();
		        sc.close();
		        }
	        }
	}


