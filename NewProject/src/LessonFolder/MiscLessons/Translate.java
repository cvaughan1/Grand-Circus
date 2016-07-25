package LessonFolder.MiscLessons;

import java.util.Scanner;

public class Translate {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to our Java class. Which student would you like to learn more about?");	
		String word = sc.nextLine();
	
		String postWord="";
		
		if(word.startsWith("a")|| word.startsWith ("e")|| word.startsWith("i")|| word.startsWith ("o")||
			word.startsWith("u")){		
			//starts with a vowel
			System.out.println(word + "way");
		}else{	
			//starts with a constant
           char c;
           c = word.charAt(0);
           //find first vowel to split word 
			while (c != 'a' && c != 'e' && c != 'i'
                    && c != 'o' && c != 'u' && c != 'y') {
 				word = word.substring(1);
                postWord += c;
                c = word.charAt(0);
            }
			System.out.println(word + postWord + "ay");
			sc.close();
		}
	}
}
