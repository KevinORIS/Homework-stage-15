package by.itstep.oris.workspace.leveld.task02.logic;

public class VectorWorker {
	public static double calcSumBetweenZeroEl(int... vector) {
		if (vector == null) {
			return -1;
		}

		int indexFirst = findFirstZero(vector);
		int indexSecond = findLastZero(vector);
		
		if(indexFirst == -1 || indexSecond == -1) {
			return -1;
		}
		
		double sum = 0;

		for (int i = indexFirst + 1; i < indexSecond; i++) {
			sum += vector[i];
		}
		return sum;
	}

	private static int findFirstZero(int... vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	private static int findLastZero(int... vector) {
		for (int i = vector.length; i < vector.length; i--) {
			if (vector[i] == 0) {
				return i;
			}
		}
		return -1;
	}
}
