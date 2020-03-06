package org.korecky.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsOneArrayRotationOfAnotherTest {

	@Test
	void isRotation() {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array2a = { 4, 5, 6, 7, 8, 1, 2, 3 };
		// isRotation(array1, array2a) should return false.
		assertFalse(IsOneArrayRotationOfAnother.isRotation(array1, array2a));

		int[] array2b = { 4, 5, 6, 7, 1, 2, 3 };
		// isRotation(array1, array2b) should return true.
		assertTrue(IsOneArrayRotationOfAnother.isRotation(array1, array2b));

		int[] array2c = { 4, 5, 6, 9, 1, 2, 3 };
		// isRotation(array1, array2c) should return false.
		assertFalse(IsOneArrayRotationOfAnother.isRotation(array1, array2c));

		int[] array2d = { 4, 6, 5, 7, 1, 2, 3 };
		// isRotation(array1, array2d) should return false.
		assertFalse(IsOneArrayRotationOfAnother.isRotation(array1, array2d));

		int[] array2e = { 4, 5, 6, 7, 0, 2, 3 };
		// isRotation(array1, array2e) should return false.
		assertFalse(IsOneArrayRotationOfAnother.isRotation(array1, array2e));

		int[] array2f = { 1, 2, 3, 4, 5, 6, 7 };
		// isRotation(array1, array2f) should return true.
		assertTrue(IsOneArrayRotationOfAnother.isRotation(array1, array2f));
	}
}