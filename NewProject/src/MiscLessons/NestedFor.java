package MiscLessons;

public class NestedFor {

	public static void main(String[] args) {
		int[][] numbersTable = {{1,2}, {3,4}, {5,6}};
		for (int[] row: numbersTable){ 
			for (int column : row){
				System.out.print(column + "   ");
			}
			System.out.print("\n");	
	}

	}
}