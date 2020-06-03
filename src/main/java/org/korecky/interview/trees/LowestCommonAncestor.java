package org.korecky.interview.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestCommonAncestor {
	// Lowest Common Ancestor (Java)
	// Find the lowest common ancestor of two items in a binary tree.
	//
	// Assumptions:
	// Each value in the tree is unique (there are no two nodes with the same value).
	// Each node has at most two children, left and right.
	// You do not have a level attribute in each of your node (for example, 1st layer, 2nd layer, and so on).
	// Each node has pointers to left and right children, but there's no back link (a child node does not point back to its parent node).
	// Example:
	//
	// head = 5
	//       / \
	//      1   4
	//     /\   /\
	//    3  8 9  2
	//   /\
	//  6  7
	// LCA of 8 and 7 is 1.
	// LCA of 4 and 2 is 4.
	// NOTE: In our test code, the following two trees will be used.
	//
	// head1 = 0
	//        / \
	//       1   2
	//      /\   /\
	//     3  4 5  6
	// head2 = 5
	//       /   \
	//      1     4
	//     /\    / \
	//    3  8  9  2
	//   /\
	//  6  7

	public static TreeNode lca(TreeNode root, int j, int k) {
		List<TreeNode> jPath = getNodePath(root, j);
		List<TreeNode> kPath = getNodePath(root, k);

		Integer lca = null;
		if ((jPath != null) && (kPath != null)) {
			for (TreeNode jNode : jPath) {
				for (TreeNode kNode : kPath) {
					if (jNode.getValue() == kNode.getValue()) {
						return jNode;
					}
				}
			}
		}
		return null;
	}

	private static List<TreeNode> getNodePath(TreeNode root, int nodeValue) {
		if (root == null)
			return null;

		if (root.getValue() == nodeValue) {
			return new ArrayList<>(Arrays.asList(root));
		}

		List<TreeNode> leftPath = getNodePath(root.getLeft(), nodeValue);
		if (leftPath != null) {
			leftPath.add(root);
			return leftPath;
		}

		List<TreeNode> rightPath = getNodePath(root.getRight(), nodeValue);
		if (rightPath != null) {
			rightPath.add(root);
			return rightPath;
		}

		return null;
	}
}
