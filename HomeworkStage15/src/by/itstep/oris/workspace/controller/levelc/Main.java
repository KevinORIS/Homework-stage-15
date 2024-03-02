package by.itstep.oris.workspace.controller.levelc;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 4, 2, 6 }, 
				{ -3, 5, -4 }, 
				{ 7, -8, 9 } 
				};
		int positiveCount = MatrixManager.countPositiveElAboveDiagonal(matrix);
		
		System.out.print(positiveCount);
	}
}
