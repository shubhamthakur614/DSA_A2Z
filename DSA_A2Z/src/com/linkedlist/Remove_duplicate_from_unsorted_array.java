package com.linkedlist;

import java.util.HashSet;

public class Remove_duplicate_from_unsorted_array {

	static Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}

	public static void printLL(Node head) {
		if (head == null) {
			return;
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		insert(4);
		insert(2);
		insert(5);
		insert(4);
		insert(4);
		insert(2);
		insert(2);
		insert(-1);
		printLL(head);
		head = removeDuplicate_unsorted(head);
		printLL(head);

	}

	public static Node removeDuplicate_unsorted(Node head) {
		// we can solve either by using map or set both the way by set first then map
		HashSet<Integer> s = new HashSet<>();
		Node curr = head;
		Node prev = null;
		// why upto null if we have 2 node then its required
		while (curr != null) {

			if (s.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				s.add(curr.data);
				prev = curr;
			}
			curr = curr.next;
		}
		return head;

	}
	// just replace set with hashmap and use containsKey method with boolean value

}
