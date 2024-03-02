package by.itstep.oris.workspace.logic;

public class MatrixManager {
	// O(N*N)
	public static int findMaxAboveDiagonal(int[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return -1;
		}
		
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
		if(matrix == null || matrix.length == 0) {
			return -1;
		}
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

	// O(N*N)
	public static int countPositiveElAboveDiagonal(int[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return -1;
		}
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

	// O(N*N)
	public static int countZeroElAboveDiagonal(int[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return -1;
		}
		int count = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					count++;
				}
			}
		}
		return count;
	}
	//O(N*(N+M))
	public static int countSaddlePoints(int[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return -1;
		}
		int count = 0;

		for (int i = 0; i < matrix.length; i++) {
			int rowMinValue = Integer.MAX_VALUE;
			int minIndex = -1;

			
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < rowMinValue) {
					rowMinValue = matrix[i][j];
					minIndex = j;
				}
			}

			boolean isSaddlePoint = true;
			
			for (int k = 0; k < matrix.length; k++) {
				if (matrix[k][minIndex] > rowMinValue) {
					isSaddlePoint = false;
					break;
				}
			}

			if (isSaddlePoint) {
				count++;
			}
		}

		return count;
	}

}
