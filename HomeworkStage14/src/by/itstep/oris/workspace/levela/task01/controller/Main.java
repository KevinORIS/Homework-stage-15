package by.itstep.oris.workspace.levela.task01.controller;

import by.itstep.oris.workspace.levela.task01.logic.VectorZeroCounter;
import by.itstep.oris.workspace.levela.task01.view.VectorUI;
import by.itstep.oris.workspace.user.UserSimulator;

public class Main {
	public static void main(String[] args) {
		int size = 10;
		
		int[] vector = new int[size];
		
		int maxBound = 10;
		
		int minBound = -10;
		
		vector = UserSimulator.inputRandomNumbers(maxBound, minBound, vector);
		
		int count = VectorZeroCounter.countZeroElements(vector);
		
		VectorUI.getResult(count, vector);
	}
}
