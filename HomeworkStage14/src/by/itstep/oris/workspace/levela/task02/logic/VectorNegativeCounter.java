package by.itstep.oris.workspace.levela.task02.logic;

public class VectorNegativeCounter {
	public static int countZeroElements(int... vector) {
		if (vector == null) {
			return -1;
		}
		
		int count = 0;
		
		for(int el : vector) {
			if (el < 0) {
				count++;
			}
		}
		
		return count;
	}
}
