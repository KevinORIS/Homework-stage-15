package by.itstep.oris.workspace.levelc.task02.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(int count, int... vector) {
		System.out.println(String.format
				("Count of elements more than geometric average in %s is: %d", 
						 Arrays.toString(vector), count));
	}
}
