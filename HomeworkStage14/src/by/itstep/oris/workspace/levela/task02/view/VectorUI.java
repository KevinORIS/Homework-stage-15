package by.itstep.oris.workspace.levela.task02.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(int count, int... vector) {
		System.out.println(String.format
				("Count of negative elements in %s is: %d", 
						Arrays.toString(vector), count));
	}
}
