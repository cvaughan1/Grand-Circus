package Labs;

import java.util.Scanner;
import java.text.NumberFormat;

public class Lab1Perimeter {	
	
	public static void main(String [] args){
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		Scanner scan = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			System.out.print("Enter Length: ");
			double length = scan.nextDouble();
			System.out.print("Enter Width: ");
			double width = scan.nextDouble();
			System.out.print("Enter Height: "); //Extra challenge
			double height = scan.nextDouble(); //Extra challenge
			System.out.println();
			
			double area = (length * width);
			double perimeter = (2*(length + width));
			double volume = (length * width * height);
			
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(0);
			String areaFormatted = number.format(area);
			String perimeterFormatted = number.format(perimeter);
			String volumeFormatted = number.format(volume);
			
			
			System.out.println("Perimeter: " + perimeterFormatted + " ft");
			System.out.println("Area: " + areaFormatted + " ft/-2");
			System.out.println("Volume: " + volumeFormatted + " ft/-3") ; //Extra challenge
			System.out.println("Continue? (y/n): "); //Extra challenge
			choice = scan.next(); //Extra challenge
			System.out.println();
		}
		scan.close();
		System.out.println("Bye!");
	}
	

}
