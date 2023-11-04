package com.linkedlist;

import com.linkedlist.Insert_at_specific_position.Node;

public class MiddleOfLinkedList {

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
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;

	}

	public static Node findMiddle(Node head) {

		Node slow = head;
		Node fast = head.next;

		while (fast != null || fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;

	}

	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		
		System.out.println(findMiddle(head));
	}
}
