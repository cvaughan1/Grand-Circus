package CircumferenceLab;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		double radius= 0;
		int count = 0;
		String choice = "y";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Circle Tester!");
				
	while(choice.equalsIgnoreCase("y")){
		System.out.println("Enter Radius: ");
		radius = scan.nextDouble();
		
		System.out.println("Circumference: " + Circle.getformattedCircumference());
		System.out.println("Area: " + Circle.getformattedArea()););
		
		count = Circle.getObjectCount();
		
		System.out.println("Another circle? (y/n):");
		
	}

	}

}
