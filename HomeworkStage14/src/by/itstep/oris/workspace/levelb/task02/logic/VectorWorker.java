package by.itstep.oris.workspace.levelb.task02.logic;

public class VectorWorker {
	public static int countAllExeptElInVector(int el, int... vector) {
		if (vector == null) {
			return -1;
		}

		int count = 0;

		for (int element : vector) {
			if (el != element) {
				count++;
			}
		}

		return count;
	}
}

