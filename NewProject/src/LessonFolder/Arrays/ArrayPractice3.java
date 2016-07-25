package LessonFolder.Arrays;

import java.util.Arrays;

public class ArrayPractice3 
{
/*
{

	    public static void main(int[] args) {
        // declares an array of integers
	    	int [] [] numbersTable = {{1,2}, {3,4}, {5,6}};
	    	for (int [] row : numbersTable);
	    		for (int [] column : row) {
	    			System.out.print(column + "  ");
	    		};
	    		System.out.print("\n");	
	    		
}
}
*/

	  public static void main(String[] args) {


int rows = 10;
int cols = 10;

int[] multD = new int[rows * cols];
{

for (int r = 1; r < rows; r++)
{
  for (int c = 1; c < cols; c++)
  {
     int index = r * cols + c;
     multD[index] = index * 2;
     System.out.print(index + "  ");
     System.out.print("\n");	
  }
}}
}}



