/** LoopingUserInterface
 * Task: 
 * 
 *  @author Greg Laidlaw
 *  @version 1.0
 *  
 *  changed/improved input loop
 *  * 
 */
package LessonFolder.MiscLessons;
import java.util.Scanner;
public class LoopingUserInput {
	
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String choice = "y";
	        
	        
            System.out.println("Welcome message goes here");
            
            System.out.println("Start the Loop (y/n):" );
            choice = sc.nextLine();
            
	        while (choice.equalsIgnoreCase("y")) {
	                        	
	            //Do Something

	            
	            //Display the results

	            
	            // See if the user wants to continue
	            System.out.print("Continue the Loop(y/n):");
	            choice = sc.next();
	            
	        } //while
	        sc.close();
            System.out.println("End Message goes here!");
        	
	    } //main
	} //class
