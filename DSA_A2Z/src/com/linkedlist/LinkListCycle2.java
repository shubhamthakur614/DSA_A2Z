
package com.linkedlist;

import com.linkedlist.LinkedListDemo.Node;

//leetcode 142
//if cycle present in linked list return the starting index node of linked list
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

		if (head == null || head.next == null) {
			return null;
		}
		Node fast = head;
		Node slow = head;
		Node temp = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				while (temp != slow) {
					temp = temp.next;
					slow = slow.next;
				}
				return slow;
			}

		}
		return null;

	}
}
