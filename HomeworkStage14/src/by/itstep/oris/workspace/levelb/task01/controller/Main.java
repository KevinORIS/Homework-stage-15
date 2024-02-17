package by.itstep.oris.workspace.levelb.task01.controller;

import by.itstep.oris.workspace.levelb.task01.logic.VectorElCounter;
import by.itstep.oris.workspace.levelb.task01.view.VectorElUI;
import by.itstep.oris.workspace.user.UserSimulator;

public class Main {
	public static void main(String[] args) {
		int size = 10;
		
		int[] vector = new int[size];
		
		int maxBound = 10;
		
		int minBound = -10;
		
		vector = UserSimulator.inputRandomNumbers(maxBound, minBound, vector);
		
		int element = 5;
		
		int count = VectorElCounter.countElInVector(element, vector);
		
		VectorElUI.getResult(count, element, vector);
	}
}
