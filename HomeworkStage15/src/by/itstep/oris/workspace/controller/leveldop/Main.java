package by.itstep.oris.workspace.controller.leveldop;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 4, 0, 6 }, 
				{ 12, 15, 10 }, 
				{ 7, -8, 9 } 
				};
		int saddleCount = MatrixManager.countSaddlePoints(matrix);
		
		System.out.print(saddleCount);
	}
}
