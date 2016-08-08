package CircumferenceLab;

import java.util.Scanner;
import CircumferenceLab.Circle;

public class Lab9CircumferencePractice {

	public static void main(String[] args) {

		double radius = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Circle Tester!");
		System.out.print("Enter the radius: ");
		radius = scan.nextDouble();

		// Area = PI*radius*radius

		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is: " + area);
		// Circumference = 2*PI*radius
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of the circle is:" + circumference);
	}
}
