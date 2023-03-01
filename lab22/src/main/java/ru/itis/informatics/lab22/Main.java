package ru.itis.informatics.lab22;

import java.util.*;

public class Main {
	private static int count(final String string, final char chr) {
		int count = 0;
		for (char c : string.toCharArray()) {
			if (c == chr) {
				count++;
			}
		}
		return count;
	}

	private static int maxElementInTheCollection(Collection<Integer> integers) {
		int max = -1;

		for (Integer integer : integers) {
			if (integer > max) {
				max = integer;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		final String input = "Hello, world!";
		final Map<Character, Integer> charEntries = new TreeMap<>();

		final char[] symbols = input.toCharArray();

		for (char symbol : symbols) {
			if (("" + symbol).matches("[A-Za-z0-9.,!?:-;()]")) {
				charEntries.put(symbol, count(input, symbol));
			}
		}

		final int height = maxElementInTheCollection(charEntries.values());

		for (int i = 0; i < height; i++) {
			for (char symbol : charEntries.keySet()) {
				if (height - i <= charEntries.get(symbol)) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

		charEntries.keySet().forEach(System.out::print);

	}
}