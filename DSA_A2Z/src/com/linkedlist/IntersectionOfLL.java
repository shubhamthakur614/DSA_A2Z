package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfLL {
	static class Node {
		// Data stored in the node
		int data;
		// Pointer to the next
		// node in the list
		Node next;

		// Constructor with only data as
		// a parameter, sets next to null
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

//Bruteforce Approach
	public static Node intersection1(Node h1, Node h2) {

		Set<Node> s = new HashSet<>();
		while (h1 != null) {
			s.add(h1);
			h1 = h1.next;
		}
		while (h2 != null) {
			if (s.contains(h2)) {
				return h2;
			}
			h2 = h2.next;
		}
		return null;
	}

	// optimal Approach
	public static Node intersection2(Node h1, Node h2) {

		Node t1 = h1;
		Node t2 = h2;
		while (t1 != t2) {
			t1 = t1 == null ? h2 : t1.next;
			t2 = t2 == null ? h1 : t2.next;
		}
		return t1;
	}

	public static void main(String[] args) {

	}

}
