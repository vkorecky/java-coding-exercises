package org.korecky.interview;

public class OneAwayStrings {

	// One Away Strings (Python)
	// Write a function that takes two strings and returns True if they are one away from each other.
	// They are one away from each other if a single operation (changing a character, deleting a character or adding a character) will change one of the strings to the other.
	// Examples:
	//   - "abcde" and "abcd" are one away (deleting a character).
	//   - "a" and "a" are one away (changing the only character 'a' to the equivalent character 'a').
	//   - "abc" and "bcc" are NOT one away. (They are two operations away.)
	public static Boolean isOneAway(String s1, String s2) {
		if (Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}

		char[] longerArray;
		char[] shorterArray;

		if (s1.length() > s2.length()) {
			longerArray = s1.toCharArray();
			shorterArray = s2.toCharArray();
		} else {
			longerArray = s2.toCharArray();
			shorterArray = s1.toCharArray();
		}

		boolean operationApplied = false;
		int offset = 0;
		for (int i = 0; i < shorterArray.length; i++) {
			char firstChar = longerArray[i + offset];
			char secondChar = shorterArray[i];
			if (firstChar != secondChar) {
				if (operationApplied)
					return false;
				if (secondChar == longerArray[i+1]) {
					// add/delete operation
					operationApplied = true;
					offset = 1;
				} else if (longerArray[i+1] == shorterArray[i+1]){
					operationApplied = true;
				} else
					return false;
			}
		}
		return true;
	}
}
