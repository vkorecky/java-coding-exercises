package org.korecky.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssignNumbersMinesweeperTest {

	@Test
	void mineSweeper() {
		int[][] bombs1 = {{0, 2}, {2, 0}};
		int[][] expResult1 = {{0, 1, -1}, {1, 2, 1}, {-1, 1, 0}};
		int[][] result1 = AssignNumbersMinesweeper.mineSweeper(bombs1, 3, 3);
		assertArrayEquals(expResult1, result1);

		int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
		int[][] expResult2 = {{-1, -1, 2, 1}, {2, 3, -1, 1}, {0, 1, 1, 1}};
		int[][] result2 = AssignNumbersMinesweeper.mineSweeper(bombs2, 3, 4);
		assertArrayEquals(expResult2, result2);

		int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
		int[][] expResult3 = {{1, 2, 2, 1, 0}, {1, -1, -1, 2, 0}, {1, 3, -1, 2, 0}, {0, 1, 2, 2, 1}, {0, 0, 1, -1, 1}};
		int[][] result3 = AssignNumbersMinesweeper.mineSweeper(bombs3, 5, 5);
		assertArrayEquals(expResult3, result3);
	}
}