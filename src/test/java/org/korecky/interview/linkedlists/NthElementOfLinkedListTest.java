package org.korecky.interview.linkedlists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NthElementOfLinkedListTest {

	@Test
	void nthFromLast() {

		// head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
		Node current = new Node(1, null);
		for (int i = 2; i < 8; i++) {
			current = new Node(i, current);
		}
		Node head = current;

		// head2 = 1 -> 2 -> 3 -> 4 -> (null)
		Node current2 = new Node(4, null);
		for (int i = 3; i > 0; i--) {
			current2 = new Node(i, current2);
		}
		Node head2 = current2;


		assertEquals(1, NthElementOfLinkedList.nthFromLast(head, 1));
		assertEquals(5, NthElementOfLinkedList.nthFromLast(head, 5));
		assertEquals(3, NthElementOfLinkedList.nthFromLast(head2, 2));
		assertEquals(1, NthElementOfLinkedList.nthFromLast(head2, 4));
		assertEquals(null, NthElementOfLinkedList.nthFromLast(null, 5));
		assertEquals(null, NthElementOfLinkedList.nthFromLast(null, 1));
	}
}