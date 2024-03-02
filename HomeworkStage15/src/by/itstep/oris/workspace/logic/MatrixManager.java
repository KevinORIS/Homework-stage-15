package by.itstep.oris.workspace.logic;

public class MatrixManager {
	// O(N*N)
	public static int findMaxAboveDiagonal(int[][] matrix) {
		int max = matrix[0][1];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	// O(N*N)
	public static int countEvenElAboveDiagonal(int[][] matrix) {
		int count = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				if (matrix[i][j] % 2 == 0) {
					count++;
				}
			}
		}
		return count;
	}
	//O(N*N)
	public static int countPositiveElAboveDiagonal(int[][] matrix) {
		int count = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				if (matrix[i][j] >= 0) {
					count++;
				}
			}
		}
		return count;
	}
}
