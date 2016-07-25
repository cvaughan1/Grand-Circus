package Labs;

import java.util.Scanner;

public class Lab2Adventure {
	
	public static void main(String[] args) {
		
	//Enter name into variable
	Scanner sc = new Scanner(System.in);	
	System.out.println("Welcome! What is your name?(enter your name)");
	String enteredName = sc.nextLine();
	
	//Enter game answer into variable
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Would you like to play a game?(enter yes or no)");
	String enteredGameAnswer = sc1.nextLine();
	
	
	switch (enteredGameAnswer){
	
			case "no":
			System.out.println("You coward!! Go home.");	
			break;
	
			case "yes":
			System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What would you do??(enter \"face the beast\" or \"run away\")");
			String faceOrRun = sc1.nextLine();
	
	
	
	switch (faceOrRun){
	
			case "run away":
			System.out.println("You coward!! Go home.");	
			break;
			
			case "face the beast":
			System.out.println("You approach the dragon. You see that he has __ heads! (enter\"1\" or \"2\" or \"3\"):");
			int headsNumber = sc1.nextInt();				
			System.out.println("No one has ever faced a " + headsNumber + "-headed dragon before!");
			System.out.println("Choose your weapon!(enter \"slingshot\" or \"sword\" or \"bow and arrow\")");
	}
			
			
			Scanner sc3 = new Scanner(System.in);
			String yourWeapon = sc3.nextLine();	
			System.out.println("Armed with your " + yourWeapon + ", you approach the dragon.");
			System.out.println("It stares at you with its ______ eyes. (enter \"red\" or \"blue\")");
			
			Scanner sc4 = new Scanner(System.in);
			String dragonEye = sc4.nextLine();
		
	switch (dragonEye){
			
			case "red":
			System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends. You name the dragon _______.(enter a name)");	
			Scanner sc5 = new Scanner(System.in);
			
			
			String dragonName = sc5.nextLine();
			System.out.println( enteredName + " and " + dragonName + " live happily ever after.");
	
			
			sc.close();
			sc1.close();
			sc3.close();
			
	}
			
	}	
	}
}
	


	