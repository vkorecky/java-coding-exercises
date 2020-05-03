package org.korecky.interview.linkedlists;

public class Node {
	private final int value;
	private final Node child;

	public Node(int value, Node child) {
		this.value = value;
		this.child = child;
	}

	public int getValue() {
		return value;
	}

	public Node getChild() {
		return child;
	}
}
