package by.itstep.oris.workspace.leveld.task01.logic;

public class VectorWorker {
	public static double calcSumBetweenMaxAndMinEl(double... vector) {
		if (vector == null) {
			return -1;
		}

		int indexMax = findIndexOfMax(vector);
		int indexMin = findIndexOfMin(vector);
		
		if(indexMax < indexMin) {
			int t = indexMax;
			indexMax = indexMin;
			indexMin = t;
		}
		
		double sum = 0;

		for (int i = indexMin + 1; i < indexMax; i++) {
			sum += vector[i];
		}
		return sum;
	}

	private static int findIndexOfMax(double... vector) {
		int index = 0;
		double max = vector[0];
		
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] > max) {
				max = vector[i];
				index = i;
			}
		}

		return index;
	}

	private static int findIndexOfMin(double... vector) {
		int index = 0;
		double min = vector[0];

		for (int i = 1; i < vector.length; i++) {
			if (vector[i] < min) {
				min = vector[i];
				index = i;
			}
		}

		return index;
	}
}
