package by.itstep.oris.workspace.leveld.task02.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(double sum, double... vector) {
		System.out.println(String.format
				("Sum of elements between first and last zero's in %s is: %.2f",
						 Arrays.toString(vector), sum));
	}
}
