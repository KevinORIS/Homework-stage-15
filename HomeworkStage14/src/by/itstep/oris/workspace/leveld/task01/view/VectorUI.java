package by.itstep.oris.workspace.leveld.task01.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(int sum, int... vector) {
		System.out.println(String.format
				("Sum of elements between min and max elements in %s is: %d", 
						 Arrays.toString(vector), sum));
	}
}
