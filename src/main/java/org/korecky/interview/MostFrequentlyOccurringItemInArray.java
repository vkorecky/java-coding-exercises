package org.korecky.interview;

import java.util.HashMap;

// Most Frequently Occurring Item in an Array (Java)
// Find the most frequently occurring item in an array.
// Example: The most frequently occurring item in [1, 3, 1, 3, 2, 1] is 1.
// If you're given an empty array, you should return null (in Java)
public class MostFrequentlyOccurringItemInArray {

	// Implement your solution below.
	public static Integer mostFreqent(int[] givenArray) {
		Integer maxItem = null;
		Integer maxValue = null;
		HashMap<Integer, Integer> intCounts = new HashMap<>();
		for (Integer number : givenArray) {
			if (intCounts.containsKey(number)){
				intCounts.replace(number, intCounts.get(number) + 1);
			} else {
				intCounts.put(number, 1);
			}
		}

		for (Integer number : intCounts.keySet()){
			if ((maxValue == null) || (maxValue < intCounts.get(number))) {
				maxValue = intCounts.get(number);
				maxItem = number;
			}
		}
		return maxItem;
	}
}
