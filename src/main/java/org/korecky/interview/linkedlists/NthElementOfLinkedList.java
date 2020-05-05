package org.korecky.interview.linkedlists;

public class NthElementOfLinkedList {

	// N-th Element of a Linked List (Java)
	//
	// Implement a function that finds the nth node in a linked list, counting from the end.
	// Your function should take a linked list (its head element) and n, a positive integer as its arguments.
	// Examples:
	// head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null / None)
	// The third element of head counting from the end is 3.
	// head2 = 1 -> 2 -> 3 -> 4 -> (null / None)
	// The fourth element of head2 counting from the end is 1.
	// If the given n is larger than the number of nodes in the list, return null / None.

	public static Node nthFromLast(Node head, int n) {
		Node right = head;
		Node left = head;

		for (int i = 0; i < n; i++) {
			if (right == null)
				return null;
			right = right.getChild();
		}

		while (right != null) {
			right = right.getChild();
			left = left.getChild();
		}

		return left;
	}
}
