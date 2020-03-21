package org.korecky.interview;

import java.util.Arrays;

public class AssignNumbersMinesweeper {

	//	Assign Numbers in Minesweeper (Java)
	//	Implement a function that assigns correct numbers in a field of Minesweeper, which is represented as a 2 dimensional array.
	//
	//	Example: The size of the field is 3x4, and there are bombs at the positions [0, 0] (row index = 0, column index = 0) and [0, 1] (row index = 0, column index = 1).
	//
	//	Then, the resulting field should be:
	//			[[-1, -1, 1, 0],
	//			[2, 2, 1, 0],
	//			[0, 0, 0, 0]]
	//
	//	Your function should return the resulting 2D array after taking the following three arguments:
	//	1) bombs: A list of bomb locations.  Given as an array of arrays.  Example: [[0, 0], [0, 1]] ([row index = 0, column index = 0], [row index = 0, column index = 1].  Assume that there are no duplicates.
	//	2) num_rows: The number of rows in the resulting field.
	//	3) num_columns: The number of columns in the resulting field.

	//	In the resulting field:
	//	- (-1) represents that there is a bomb in that location.
	//  - (1, 2, 3...) etc. represents that there are 1, 2, 3... etc. bombs in the surrounding cells (including diagonally adjacent cells).
	//	- (0) represents that there are no bombs in the surrounding cells.

	public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
		// Create field with 0 value
		int[][] field = new int[numRows][numCols];
		for (int[] row : field)
			Arrays.fill(row, 0);

		// Fill bombs
		for (int[] bomb : bombs) {
			field[bomb[0]][bomb[1]] = -1;
		}
		return field;
	}
}
