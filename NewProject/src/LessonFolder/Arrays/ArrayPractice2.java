package LessonFolder.Arrays;

import java.util.Random;

public class ArrayPractice2 {
	
	public static void main(String[] args) {
	
	int height;
	int width;
	
	int cols = width;
	int rows = height;

	// Declare 2D array
	
	int[][] myArray = new int[cols][rows];
	Random random = new Random();
	// Initialize 2D array values
	for (int i = 0; i < cols; i++) {
	  for (int j = 0; j < rows; j++) {
	    myArray[i][j] = int(random(255));
	  }
	}

	// Draw points
	for (int i = 0; i < cols; i++) {
	  for (int j = 0; j < rows; j++) {
	    stroke(myArray[i][j]);
	    
	  }
	}
}
}
