package org.korecky.interview;

public class Rotating2DArrayBy90Degrees {

	// Rotating a 2D Array by 90 Degrees
	// A 2-dimensional array is an array of arrays.
	//
	// Implement a function that takes a square 2D array (# columns = # rows) and rotates it by 90 degrees.
	//
	// Example: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
	//
	// When you are done, try implementing this function so that you can solve this problem in place.
	// Solving it in place means that your function won't create a new array to solve this problem.
	// Instead, modify the content of the given array with O(1) extra space.

	public static int[][] rotate(int[][] a, int n) {
		int[][] rotated = new int[n][n];
		return rotated;
	}

	public static int[][] rotateInPlace(int[][] a, int n) {
		return a;
	}
}
