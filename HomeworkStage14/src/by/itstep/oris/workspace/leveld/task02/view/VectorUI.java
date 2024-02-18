package by.itstep.oris.workspace.leveld.task02.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(int sum, int... vector) {
		System.out.println(String.format
				("Sum of elements between first and last zero's in %s is: %d",
						 Arrays.toString(vector), sum));
	}
}
