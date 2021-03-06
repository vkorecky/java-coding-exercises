package org.korecky.interview.arrays2D;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Rotating2DArrayBy90DegreesTest {

	int[][] a1 = { { 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 } };
	int[][] r1 = { { 7, 4, 1 },
			{ 8, 5, 2 },
			{ 9, 6, 3 } };

	int[][] a2 = { { 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 },
			{ 13, 14, 15, 16 } };
	int[][] r2 = { { 13, 9, 5, 1 },
			{ 14, 10, 6, 2 },
			{ 15, 11, 7, 3 },
			{ 16, 12, 8, 4 } };

	@Test
	public void rotate() {
		assertArrayEquals(r1, Rotating2DArrayBy90Degrees.rotate(a1, 3));
		assertArrayEquals(r2, Rotating2DArrayBy90Degrees.rotate(a2, 4));
	}

	@Test
	public void rotateInPlace() {
		assertArrayEquals(r1, Rotating2DArrayBy90Degrees.rotateInPlace(a1, 3));
		assertArrayEquals(r2, Rotating2DArrayBy90Degrees.rotateInPlace(a2, 4));
	}
}