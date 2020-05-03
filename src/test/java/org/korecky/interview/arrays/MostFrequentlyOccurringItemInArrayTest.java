package org.korecky.interview.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostFrequentlyOccurringItemInArrayTest {

	@Test
	void mostFreqent() {
		// mostFrequent(array1) should return 1.
		int[] array1 = { 1, 3, 1, 3, 2, 1 };
		Integer expResult1 = 1;
		Assertions.assertEquals(expResult1, MostFrequentlyOccurringItemInArray.mostFreqent(array1));

		// mostFrequent(array2) should return 3.
		int[] array2 = { 3, 3, 1, 3, 2, 1 };
		Integer expResult2 = 3;
		assertEquals(expResult2, MostFrequentlyOccurringItemInArray.mostFreqent(array2));

		// mostFrequent(array3) should return null.
		int[] array3 = {};
		Integer expResult3 = null;
		assertEquals(expResult3, MostFrequentlyOccurringItemInArray.mostFreqent(array3));

		// mostFrequent(array4) should return 0.
		int[] array4 = { 0 };
		Integer expResult4 = 0;
		assertEquals(expResult4, MostFrequentlyOccurringItemInArray.mostFreqent(array4));

		// mostFrequent(array5) should return -1.
		int[] array5 = { 0, -1, 10, 10, -1, 10, -1, -1, -1, 1 };
		Integer expResult5 = -1;
		assertEquals(expResult5, MostFrequentlyOccurringItemInArray.mostFreqent(array5));
	}
}