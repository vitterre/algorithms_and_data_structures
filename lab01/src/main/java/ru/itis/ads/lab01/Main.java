package ru.itis.ads.lab01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

public class Main {
	private static int validateJSONFile(final String pathToJSONFile) throws IOException {
		return validateJSONString(new String(Files.readAllBytes(Paths.get("lab01/src/main/resources/transport.json"))));
	}

	private static int validateJSONString(final String jsonRaw) {
		final Stack<Character> stack = new Stack<>();

		for (int i = 0; i < jsonRaw.length(); i++) {
			switch (jsonRaw.charAt(i)) {
			case '"':
				if (!stack.isEmpty() && stack.peek().equals('"')) {
					stack.pop();
				} else {
					stack.push(jsonRaw.charAt(i));
				}
				break;
			case '{':
			case '[':
				if (!stack.isEmpty() && stack.peek().equals('"')) {
					break;
				}
				stack.push(jsonRaw.charAt(i));
				break;
			case '}':
				if (!stack.isEmpty() && stack.peek().equals('{')) {
					stack.pop();
				} else {
					return i;
				}
				break;
			case ']':
				if (!stack.isEmpty() && stack.peek().equals('[')) {
					stack.pop();
				} else {
					return i;
				}
				break;
			default:
				continue;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(validateJSONFile("lab01/src/main/resources/transport.json"));
	}
}