package by.itstep.oris.workspace.controller.leveld;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 4, 0, 6 }, 
				{ -3, 5, -4 }, 
				{ 7, -8, 9 } 
				};
		int zeroCount = MatrixManager.countZeroElAboveDiagonal(matrix);
		
		System.out.print(zeroCount);
	}
}
