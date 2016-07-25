package LessonFolder.MiscLessons;

public class Scope {
	// because x is declared OUTSIDE OF THE METHOD it is IN SCOPE to ALL methods
	static int x;
	
	public static void main(String[] args) {
		x = 5;
		System.out.println(x);
		
//		doSomething();
		
		System.out.println(x);
		}
	static void doSomething(){
		x = 10;
	}

//	static void doSomethingLocally(){
		

	}
	


