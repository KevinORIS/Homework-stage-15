package by.itstep.oris.workspace.controller.levelb;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 4, 2, 6 }, 
				{ 3, 5, 4 }, 
				{ 7, 8, 9 } 
				};
		int evenCount = MatrixManager.countEvenElAboveDiagonal(matrix);
		
		System.out.print(evenCount);
	}
}
