package org.korecky.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NonRepeatingCharacter {

	// Non-Repeating Character (Java)
	// Implement a function that takes a string and returns the first character that does not appear twice or more.
	// Example:
	//   - "abacc" -> 'b' ('a' appears twice, and so does 'c')
	//   - "xxyzx" -> 'y' ('y' and 'z' are non-repeating characters, and 'y' appears first)
	//
	// If there is no non-repeating character, return null.
	public static Character nonRepeating(String s) {
		HashMap<Character, Integer> charMap = new LinkedHashMap<>();
		for (Character character : s.toCharArray()) {
			if (charMap.containsKey(character)) {
				charMap.replace(character, charMap.get(character) + 1);
			} else {
				charMap.put(character, 1);
			}
		}
		for (Character character : charMap.keySet()) {
			if (charMap.get(character) == 1) {
				return character;
			}
		}
		return null;
	}
}
