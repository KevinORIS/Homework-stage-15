package by.itstep.oris.workspace.levela.task01.logic;

public class VectorZeroCounter {
	public static int countZeroElements(int... vector) {
		int count = 0;
		
		for(int el : vector) {
			if (el == 0) {
				count++;
			}
		}
		
		return count;
	}
}
