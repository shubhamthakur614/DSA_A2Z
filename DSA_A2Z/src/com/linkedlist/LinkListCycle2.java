
package com.linkedlist;

import com.linkedlist.LinkedListDemo.Node;

//leetcode 142
//if linklist dont have cycle then return null;

public class LinkListCycle2 {

	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

	}

	public static Node LinkListCycleTwo(Node head) {

		if (head == null) {
			return null;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null || fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				while (head != slow) {
					head = head.next;
					slow = slow.next;

				}
				return slow;
			}

		}
		return null;

	}
}
