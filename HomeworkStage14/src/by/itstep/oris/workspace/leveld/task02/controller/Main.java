package by.itstep.oris.workspace.leveld.task02.controller;


import by.itstep.oris.workspace.leveld.task02.view.VectorUI;
import by.itstep.oris.workspace.leveld.task02.logic.VectorWorker;
import by.itstep.oris.workspace.user.UserSimulator;

public class Main {
	public static void main(String[] args) {
		int size = 10;
		
		int[] vector = new int[size];
		
		int maxBound = 1;
		
		int minBound = 0;
		
		vector = UserSimulator.inputRandomNumbers(maxBound, minBound, vector);
		
		
		int sum = VectorWorker.calcSumBetweenZeroEl(vector);
		
		VectorUI.getResult(sum, vector);
	}
}
