package by.itstep.oris.workspace.user;

import java.util.Random;
import java.util.Scanner;

public class UserSimulator {

	public static final Random RANDOM;
	public static final Scanner SCANNER;

	static {
		RANDOM = new Random();
		SCANNER = new Scanner(System.in);
	}

	public static int inputRandomNumber(int maxBound, int minBound) {
		if (maxBound < minBound) {
			int t = maxBound;
			maxBound = minBound;
			minBound = t;
		}
		return RANDOM.nextInt(maxBound - minBound + 1) + minBound;
	}

	public static int[] inputRandomNumbers(int maxBound, int minBound, int[] array) {
		if (maxBound < minBound) {
			int t = maxBound;
			maxBound = minBound;
			minBound = t;
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = RANDOM.nextInt(maxBound - minBound + 1) + minBound;
		}
		return array;
	}

	public static int inputSpecificNumber() {
		return SCANNER.nextInt();
	}

	public static int[] inputSpecificNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = SCANNER.nextInt();
		}
		return array;
	}
}
