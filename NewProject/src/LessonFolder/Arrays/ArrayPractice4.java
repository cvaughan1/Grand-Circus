package LessonFolder.Arrays;

import java.util.Scanner;

public class ArrayPractice4 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows:");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns:");
		Scanner sc1 = new Scanner(System.in);
		int columns = sc1.nextInt();
		
		
		int [][] twoDim = new int [rows][columns];

		int a = (twoDim.length);
		int b = (twoDim[0].length);

for(int i = 0; i < a; i++){ // 
    for(int j = 0; j <b; j++) { // 
        int x = (i+1)*(j+1);
        twoDim[i][j] = x;
        if (x<10) {
            System.out.print(" " + x + " ");
        } else {
            System.out.print(x + " ");
            
            sc.close();    
            sc1.close();
        }
    }//end of for J
    System.out.println();
}//end of for i



	}
	

}

