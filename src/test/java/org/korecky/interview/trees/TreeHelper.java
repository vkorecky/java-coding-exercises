package org.korecky.interview.trees;

import java.util.HashMap;

public class TreeHelper {
	// A function for creating a tree.
	// Input:
	// - mapping: a node-to-node mapping that shows how the tree should be constructed
	// - headValue: the value that will be used for the head ndoe
	// Output:
	// - The head node of the resulting tree
	public static TreeNode createTree(HashMap<Integer, int[]> mapping, int headValue) {
		TreeNode head = new TreeNode(headValue, null, null);
		HashMap<Integer, TreeNode> nodes = new HashMap<Integer, TreeNode>();
		nodes.put(headValue, head);
		for(Integer key : mapping.keySet()) {
			int[] value = mapping.get(key);
			TreeNode leftChild = new TreeNode(value[0], null, null);
			TreeNode rightChild = new TreeNode(value[1], null, null);
			nodes.put(value[0], leftChild);
			nodes.put(value[1], rightChild);
		}
		for(Integer key : mapping.keySet()) {
			int[] value = mapping.get(key);
			nodes.get(key).setLeft(nodes.get(value[0]));
			nodes.get(key).setRight(nodes.get(value[1]));
		}
		return head;
	}
}
