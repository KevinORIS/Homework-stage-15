package by.itstep.oris.workspace.levela.task01.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(int count, int... vector) {
		
		
		System.out.println(String.format
				("Count of zero elements in %s is: %d", 
						Arrays.toString(vector), count));
	}
}
