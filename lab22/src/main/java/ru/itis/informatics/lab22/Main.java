package ru.itis.informatics.lab22;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		final String input = "Hello, world!";
		final Map<Character, Integer> charEntries = new TreeMap<>();

		for (char symbol : input.toCharArray()) {
			charEntries.put(symbol, charEntries.getOrDefault(symbol, 0) + 1);
		}

		final int height = Collections.max(charEntries.values());

		for (int i = height; i > 0; i--) {
			for (char symbol : charEntries.keySet()) {
				System.out.print(charEntries.get(symbol) >= i ? '#' : ' ');
			}
			System.out.println();
		}

		charEntries.keySet().forEach(System.out::print);
		System.out.println();
	}
}