package by.itstep.oris.workspace.leveld.task01.controller;


import by.itstep.oris.workspace.leveld.task01.logic.VectorWorker;
import by.itstep.oris.workspace.leveld.task01.view.VectorUI;
import by.itstep.oris.workspace.user.UserSimulator;

public class Main {
	public static void main(String[] args) {
		int size = 10;
		
		double[] vector = new double[size];
		
		vector = UserSimulator.inputSpecificNumbers(vector);
		
		
		double sum = VectorWorker.calcSumBetweenMaxAndMinEl(vector);
		
		VectorUI.getResult(sum, vector);
		
	}
}
