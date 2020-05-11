package org.korecky.interview.trees;

import java.util.HashMap;

public class BinarySearchTree {

	// Is This a Binary Search Tree? (Java)
	// Write a function that takes a binary tree and returns true if it is a binary search tree, and false if not.
	//
	// In our test code, we're going to use the following examples:
	//
	// head1 = 0
	// 		  / \
	// 		 1   2
	//		/\   /\
	//		3  4 5  6
	// head1 is NOT a binary search tree.
	//
	//		head2 = 3
	// 		      /   \
	//		     1     4
	//		    /\    / \
	//		   0  2  5   6
	// head2 is NOT a binary search tree.
	//
	//		head3 = 3
	//		      /   \
	//		     1     5
	//		    /\    / \
	//		   0  2  4   6
	// head3 is a binary search tree.
	//
	// head4 = 3
	//		 /   \
	//		1     5
	//	   /\
	//	  0  4
	// head4 is NOT a binary search tree.
	public static boolean isBST(TreeNode node) {
		return isBST(node, null, null);
	}

	private static boolean isBST(TreeNode node, Integer loverLimit, Integer upperLimit) {
		boolean isBstLeft = true;
		boolean isBstRight = true;
		if (node.getLeft() != null) {
			if (node.getLeft().getValue() > node.getValue())
				return false;
			if (((loverLimit != null) && (node.getLeft().getValue() < loverLimit)))
				return false;
			isBstLeft = isBST(node.getLeft(), loverLimit, node.getValue());
		}
		if (node.getRight() != null) {
			if (node.getRight().getValue() < node.getValue())
				return false;
			if ((upperLimit != null) && (node.getRight().getValue() > upperLimit))
				return false;
			isBstRight = isBST(node.getRight(), node.getValue(), upperLimit);
		}
		return isBstLeft && isBstRight;
	}
}
