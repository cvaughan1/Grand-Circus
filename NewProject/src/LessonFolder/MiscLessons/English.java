package LessonFolder.MiscLessons;

public class English {
    public static String translateToPigLatin(String word) {
        char c = word.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            //word += "way";
		word=word+"way";
        } else {
            if (c == 'y') {
                word = word.substring(1);
                //word += c;
		word=word+c;
                c = word.charAt(0);
            }
            while (c != 'a' && c != 'e' && c != 'i'
                    && c != 'o' && c != 'u' && c != 'y') {
                word = word.substring(1);
            //    word += c;
		word=word+c;
                c = word.charAt(0);
            }
  	    word=word+"ay";         
// word += "ay";
        }
        return word;
    }    
}