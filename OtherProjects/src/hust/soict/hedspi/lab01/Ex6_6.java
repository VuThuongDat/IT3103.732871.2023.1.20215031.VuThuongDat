/*6.6-Write a Java program to add two matrices of the same size.
 * Vu Thuong Dat-20215031*/
package hust.soict.hedspi.lab01;

public class Ex6_6 {
	public static void main(String[] args) {
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
		int rows = matrix1.length;
		int columns = matrix1[0].length;
		
		int[][] sumMatrix = new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("Sum of matrices:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(sumMatrix[i][j] + " ");
		    }
			System.out.println();
		}
	}
}
