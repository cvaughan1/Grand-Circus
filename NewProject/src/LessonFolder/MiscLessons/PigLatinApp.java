package LessonFolder.MiscLessons;

import java.util.Scanner;

public class PigLatinApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Pig Latin Translator\n");
        while (true) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter a line to be translated to Pig Latin:");
            String line = sc.nextLine();

            // parse the input into words and translate each word
            if (line.equals("")) {
                System.out.println("You didn't enter anything.");
            } else {
                String[] words = line.split(" ");
                String pigLatin = "";
                for (String word : words) {
                    pigLatin += English.translateToPigLatin(
                            word.toLowerCase()) + " ";
                }
                System.out.println();
                System.out.println(pigLatin);
            }
            System.out.println();

            System.out.print("Translate another line? (y/n): ");
            String choice = sc.nextLine();
            System.out.println();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
            sc.close();
        }
    }
}