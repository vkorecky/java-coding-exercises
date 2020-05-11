package org.korecky.interview.trees;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class LowestCommonAncestorTest {

	@Test
	void lca() {
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
		int[] childrenE = {3, 8};
		int[] childrenF = {9, 2};
		int[] childrenG = {6, 7};
		mapping2.put(5, childrenD);
		mapping2.put(1, childrenE);
		mapping2.put(4, childrenF);
		mapping2.put(3, childrenG);

		TreeNode head2 = TreeHelper.createTree(mapping2, 5);
		// This tree is:
		//  head2 = 5
		//        /   \
		//       1     4
		//      /\    / \
		//     3  8  9  2
		//    /\
		//   6  7


		assertEquals(0, LowestCommonAncestor.lca(head1, 1, 5));
		assertEquals(1, LowestCommonAncestor.lca(head1, 3, 1));
		assertEquals(1, LowestCommonAncestor.lca(head1, 1, 4));
		assertEquals(0, LowestCommonAncestor.lca(head1, 0, 5));
		assertEquals(5, LowestCommonAncestor.lca(head2, 4, 7));
		assertEquals(3, LowestCommonAncestor.lca(head2, 3, 3));
		assertEquals(1, LowestCommonAncestor.lca(head2, 8, 7));
		assertEquals(null, LowestCommonAncestor.lca(head2, 3, 0));
	}
}