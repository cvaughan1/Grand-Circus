package LessonFolder.ObjectPractice;

import java.util.Scanner;

public class OtherClass {


public void enterName(){
	String name;
	Scanner sc = new Scanner(System.in);//Names scanner, readies keyboard for input
	
	ClassVariablesMain sendName = new ClassVariablesMain();//establishes connection: labels letter and gets State
	
	System.out.println("Enter your name");
	name = sc.nextLine();//Accepts input to scanner
	sendName.printName(name);
	
	sc.close();
	}
		}
