package by.itstep.oris.workspace.controller.levela;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 4, 2, 6 }, 
				{ 3, 5, 1 }, 
				{ 7, 8, 9 } 
				};
		int maxEl = MatrixManager.findMaxAboveDiagonal(matrix);
		
		System.out.print(maxEl);
	}
}
