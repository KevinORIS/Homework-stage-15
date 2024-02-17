package by.itstep.oris.workspace.levelc.task01.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(int count, int... vector) {
		System.out.println(String.format
				("Count of elements more than average in %s is: %d", 
						 Arrays.toString(vector), count));
	}
}
