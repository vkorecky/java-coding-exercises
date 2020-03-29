package org.korecky.interview;

public class WhereToExpandInMinesweeper {

	// Find Where to Expand in Minesweeper
	// Implement a function that turns revealed cells into -2 given a location the user wants to click.
	//
	// For simplicity, only reveal cells that have 0 in them.  If the user clicks on any other type of cell (for example, -1 / bomb or 1, 2, or 3), just ignore the click and return the original field.  If a user clicks 0, reveal all other 0's that are connected to it.
	//
	// Example 1:
	// ------------
	// Given field:
	// [[0, 0, 0, 0, 0],
	// [0, 1, 1, 1, 0],
	// [0, 1, -1, 1, 0]]
	//
	// Click location: (2, 2: row index = 2, column index = 2)
	//
	// Resulting field:
	// [[0, 0, 0, 0, 0],
	// [0, 1, 1, 1, 0],
	// [0, 1, -1, 1, 0]] (same as the given field)
	//
	//
	//
	// Example 2:
	// ------------
	// Given field:
	// [[-1, 1, 0, 0],
	// [1, 1, 0, 0],
	// [0, 0, 1, 1],
	// [0, 0, 1, -1]]
	//
	// Click location: (1, 3: row index = 1, column index = 3)
	//
	// Resulting field:
	// [[-1, 1, -2, -2],
	// [1, 1, -2, -2],
	// [-2, -2, 1, 1],
	// [-2, -2, 1, -1]]

	public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
		if (field[givenI][givenJ] == 0) {
			field[givenI][givenJ] = -2;
			for (int i = givenI - 1; i <= givenI + 1; i++) {
				if ((i >= 0) && (i < numRows)) {
					for (int j = givenJ - 1; j <= givenJ + 1; j++) {
						if ((j >= 0) && (j < numCols)) {
							if (field[i][j] == 0) {
								field = click(field, numRows, numCols, i, j);
							}
						}
					}
				}
			}
		}
		return field;
	}
}
