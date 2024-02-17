package by.itstep.oris.workspace.levelc.task01.logic;

public class VectorWorker {
	public static int countElMoreThanAvrg(int... vector) {
		if(vector == null) {
			return -1;
		}
		
		double average = findAvrg(vector);
				
		int count = 0;
		
		for(int el : vector) {
			if(el > average) {
				count++;
			}
		}
		return count;
	}
	
	private static double findAvrg(int... vector) {
		double average = 0;
		
		for (int el : vector) { 
			  average += el; 
		} 
		return average / vector.length;
	}
}
