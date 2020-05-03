package org.korecky.interview.arrays2D;

import org.javatuples.Pair;

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
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Pair<Integer, Integer> newCoordinates = calculateNewCoordinates(i, j, n);
				rotated[newCoordinates.getValue0()][newCoordinates.getValue1()] = a[i][j];
			}
		}
		return rotated;
	}

	public static int[][] rotateInPlace(int[][] a, int n) {
		int x = n / 2;
		int y = x;
		if (x != (float) n / 2) {
			x++;
		}
		for (int row = 0; row < y; row++) {
			for (int column = 0; column < x; column++) {
				int i = row;
				int j = column;

				boolean stop = false;
				int newValue = a[i][j];
				while (!stop) {
					Pair<Integer, Integer> newCoordinates = calculateNewCoordinates(i, j, n);
					int originalValue = a[newCoordinates.getValue0()][newCoordinates.getValue1()];
					a[newCoordinates.getValue0()][newCoordinates.getValue1()] = newValue;

					i = newCoordinates.getValue0();
					j = newCoordinates.getValue1();
					newValue = originalValue;

					if ((i == row) && (j == column)) {
						stop = true;
					}
				}
			}
		}
		return a;
	}

	private static Pair<Integer, Integer> calculateNewCoordinates(int i, int j, int n) {
		return new Pair<>(j, (n - 1) - i);
	}
}
