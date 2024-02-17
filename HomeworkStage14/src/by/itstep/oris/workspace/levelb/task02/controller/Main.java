package by.itstep.oris.workspace.levelb.task02.controller;

import by.itstep.oris.workspace.levelb.task02.logic.VectorWorker;
import by.itstep.oris.workspace.levelb.task02.view.VectorUI;
import by.itstep.oris.workspace.user.UserSimulator;

public class Main {
	public static void main(String[] args) {
		int size = 10;
		
		int[] vector = new int[size];
		
		int maxBound = 5;
		
		int minBound = -5;
		
		vector = UserSimulator.inputRandomNumbers(maxBound, minBound, vector);
		
		int element = 5;
		
		int count = VectorWorker.countAllExeptElInVector(element, vector);
		
		VectorUI.getResult(count, element, vector);
	}
}
