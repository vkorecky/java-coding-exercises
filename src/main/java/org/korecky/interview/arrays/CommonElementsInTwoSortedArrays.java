package org.korecky.interview.arrays;

import java.util.ArrayList;
import java.util.List;

// Common Elements in Two Sorted Arrays (Java)
// Write a function that returns the common elements (as an array)&nbsp;between two&nbsp;sorted&nbsp;arrays of integers (ascending order).
// Example: The common elements between&nbsp;[1, 3, 4, 6, 7, 9] and&nbsp;[1, 2, 4, 5, 9, 10] are&nbsp;[1, 4, 9].
public class CommonElementsInTwoSortedArrays {

	// Implement your solution below.
	// NOTE: Remember to return an Integer array, not an int array.
	public static Integer[] commonElements(int[] array1, int[] array2) {
		List<Integer> resultInArray = new ArrayList<>();
		int lastNumIndex = 0;
		for (int firstArrayNum : array1) {
			if (!resultInArray.contains(firstArrayNum)) {
				for (int i = lastNumIndex; i < array2.length; i++) {
					Integer secArrayNum = array2[i];
					if (firstArrayNum == secArrayNum) {
						resultInArray.add(firstArrayNum);
					}
					if (firstArrayNum <= secArrayNum) {
						lastNumIndex = i;
						break;
					}
				}
			}
		}
		return resultInArray.toArray(Integer[]::new);
	}
}
