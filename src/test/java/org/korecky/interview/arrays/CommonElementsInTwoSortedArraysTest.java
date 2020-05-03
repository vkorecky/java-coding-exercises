package org.korecky.interview.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CommonElementsInTwoSortedArraysTest {

	@Test
	public void commonElements() {
		int[] array1A = { 1, 3, 4, 6, 7, 9 };
		int[] array2A = { 1, 2, 4, 5, 9, 10 };
		Integer[] arrayExpA = { 1, 4, 9 };
		// commonElements(array1A, array2A) should return [1, 4, 9] (an array).
		assertArrayEquals(arrayExpA, CommonElementsInTwoSortedArrays.commonElements(array1A, array2A));

		int[] array1B = { 1, 2, 9, 10, 11, 12 };
		int[] array2B = { 0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15 };
		Integer[] arrayExpB = { 1, 2, 9, 10, 12 };
		// commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).
		assertArrayEquals(arrayExpB, CommonElementsInTwoSortedArrays.commonElements(array1B, array2B));

		int[] array1C = { 0, 1, 2, 3, 4, 5 };
		int[] array2C = { 6, 7, 8, 9, 10, 11 };
		Integer[] arrayExpC = {};
		// common_elements(array1C, array2C) should return [] (an empty array).
		assertArrayEquals(arrayExpC, CommonElementsInTwoSortedArrays.commonElements(array1C, array2C));
	}
}