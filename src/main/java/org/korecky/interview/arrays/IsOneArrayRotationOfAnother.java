package org.korecky.interview.arrays;

public class IsOneArrayRotationOfAnother {

	//Is One Array a Rotation of Another? (Java)
	//Write a function that returns true if one array is a rotation of another.
	//NOTE: There are no duplicates in each of these arrays.
	//
	//Example: [1, 2, 3, 4, 5, 6, 7] is a rotation of [4, 5, 6, 7, 1, 2, 3].
	public static Boolean isRotation(int[] array1, int[] array2) {
		if (array1.length != array2.length)
			return false;
		int offset = -1;
		int startingNum = array1[0];
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == startingNum) {
				offset = i;
				break;
			}
		}
		if (offset < 0) {
			return false;
		}

		for (int i = 0; i < array1.length; i++) {
			int secondArrayIndex = (i + offset) % array1.length;
			if (array1[i] != array2[secondArrayIndex]) {
				return false;
			}
		}
		return true;
	}
}
