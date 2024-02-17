package by.itstep.oris.workspace.levelb.task02.view;

import java.util.Arrays;

public class VectorUI {
	public static void getResult(int count, int el, int... vector) {
		System.out.println(String.format
				("Count of elements that not equeals to %d  in %s is: %d", 
						el, Arrays.toString(vector), count));
	}
}
