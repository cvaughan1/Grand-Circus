package LessonFolder.ObjectPractice;

public class ClassVariablesMain {

	public static void main(String[] args) {
	 
		OtherClass callClass = new OtherClass();//establishes connection: labels letter and gets State
		callClass.enterName();//gets information by reading method. reads letters and does what they say
	}
	
	public void printName(String receivedName){
		System.out.print("You entered: " + receivedName);
	}

	}
