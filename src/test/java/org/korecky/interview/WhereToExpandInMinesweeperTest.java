package org.korecky.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WhereToExpandInMinesweeperTest {

	@Test
	void click() {
		int[][] field1 = {{0, 0, 0, 0, 0},
				{0, 1, 1, 1, 0},
				{0, 1, -1, 1, 0}};

		int[][] field1ExpResult1 = {{0, 0, 0, 0, 0},
				{0, 1, 1, 1, 0},
				{0, 1, -1, 1, 0}};
		int[][] field1Result1 =  WhereToExpandInMinesweeper.click(field1, 3, 5, 2, 2);
		assertArrayEquals(field1ExpResult1, field1Result1);

		int[][] field1ExpResult2 = {{-2, -2, -2, -2, -2},
				{-2, 1, 1, 1, -2},
				{-2, 1, -1, 1, -2}};
		int[][] field1Result2 =  WhereToExpandInMinesweeper.click(field1, 3, 5, 1, 4);
		assertArrayEquals(field1ExpResult2, field1Result2);


		int[][] field2 = {{-1, 1, 0, 0},
				{1, 1, 0, 0},
				{0, 0, 1, 1},
				{0, 0, 1, -1}};

		int[][] field2ExpResult1 = {{-1, 1, 0, 0},
				{1, 1, 0, 0},
				{0, 0, 1, 1},
				{0, 0, 1, -1}};
		int[][] field2Result1 =  WhereToExpandInMinesweeper.click(field2, 4, 4, 0, 1);
		assertArrayEquals(field2ExpResult1, field2Result1);

		int[][] field2ExpResult2 = {{-1, 1, -2, -2},
				{1, 1, -2, -2},
				{-2, -2, 1, 1},
				{-2, -2, 1, -1}};
		int[][] field2Result2 =  WhereToExpandInMinesweeper.click(field2, 4, 4, 1, 3);
		assertArrayEquals(field2ExpResult2, field2Result2);
	}
}