package org.korecky.interview.trees;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Test
	void isBST() {
		// NOTE: The following input values will be used for testing your solution.
		// The mapping we're going to use for constructing a tree.
		// For example, {0: [1, 2]} means that 0's left child is 1, and its right
		// child is 2.
		HashMap<Integer, int[]> mapping1 = new HashMap<Integer, int[]>();
		int[] childrenA = {1, 2};
		int[] childrenB = {3, 4};
		int[] childrenC = {5, 6};
		mapping1.put(0, childrenA);
		mapping1.put(1, childrenB);
		mapping1.put(2, childrenC);

		TreeNode head1 = TreeHelper.createTree(mapping1, 0);
		// This tree is:
		// head1 = 0
		//        / \
		//       1   2
		//      /\   /\
		//     3  4 5  6


		HashMap<Integer, int[]> mapping2 = new HashMap<Integer, int[]>();
		int[] childrenD = {1, 4};
		int[] childrenE = {0, 2};
		int[] childrenF = {5, 6};
		mapping2.put(3, childrenD);
		mapping2.put(1, childrenE);
		mapping2.put(4, childrenF);

		TreeNode head2 = TreeHelper.createTree(mapping2, 3);
		// This tree is:
		//  head2 = 3
		//        /   \
		//       1     4
		//      /\    / \
		//     0  2  5   6


		HashMap<Integer, int[]> mapping3 = new HashMap<Integer, int[]>();
		int[] childrenG = {1, 5};
		int[] childrenH = {0, 2};
		int[] childrenI = {4, 6};
		mapping3.put(3, childrenG);
		mapping3.put(1, childrenH);
		mapping3.put(5, childrenI);

		TreeNode head3 = TreeHelper.createTree(mapping3, 3);
		// This tree is:
		//  head3 = 3
		//        /   \
		//       1     5
		//      /\    / \
		//     0  2  4   6



		HashMap<Integer, int[]> mapping4 = new HashMap<Integer, int[]>();
		int[] childrenJ = {1, 5};
		int[] childrenK = {0, 4};
		mapping4.put(3, childrenJ);
		mapping4.put(1, childrenK);

		TreeNode head4 = TreeHelper.createTree(mapping4, 3);
		// This tree is:
		//  head4 = 3
		//        /   \
		//       1     5
		//      /\
		//     0  4

		assertEquals(false, BinarySearchTree.isBST(head1));
		assertEquals(false, BinarySearchTree.isBST(head2));
		assertEquals(true, BinarySearchTree.isBST(head3));
		assertEquals(false, BinarySearchTree.isBST(head4));
	}
}