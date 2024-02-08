package by.itstep.oris.workspace.levelb.task01.view;

import java.util.Arrays;

public class VectorElUI {
	public static void getResult(int count, int el, int... vector) {
		System.out.println(String.format
				("Count of %d elements in %s is: %d", 
						el, Arrays.toString(vector), count));
	}

}
