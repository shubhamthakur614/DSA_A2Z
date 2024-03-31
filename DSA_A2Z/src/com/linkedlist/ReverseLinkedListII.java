package com.linkedlist;

/*
 * Leetcode 92
 * https://leetcode.com/problems/reverse-linked-list-ii/description/
 * 
 * Input: head = [1,2,3,4,5], left = 2, right = 4
   Output: [1,4,3,2,5]
 */
public class ReverseLinkedListII {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static Node ReverseLinkedListBetween(Node head, int left, int right) {

		if (head == null || left == right) {
			return head;
		}

		// create new Dummy Node and put into the before of head;
		Node dummy = new Node(0);
		dummy.next = head;
		Node prevLeft = dummy;

		Node curr = head;
		// set the prevNode and curr to its position by iterating upto left-1
		for (int i = 0; i < left - 1; i++) {
			curr = curr.next;
			prevLeft = prevLeft.next;
		}

		// do normal reversing the linked list by iterative approach
		Node subNode = curr;
		Node prev = null;
		for (int i = 0; i < right - left; i++) {

			Node last = curr.next;
			curr.next = prev;
			prev = curr;
			curr = last;

		}
		subNode.next = curr;
		prevLeft.next = prev;
		return dummy.next;

	}

	public static void main(String[] args) {

	}

}
