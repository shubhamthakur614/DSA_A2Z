package com.linkedlist;

public class MiddleOfLinkedList {
	private static Node head;

	static class Node {

		private int data;
		private Node next;

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

	public static void printLL() {
		if (head == null) {
			System.out.println("Linked List is Empty!!!");
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	// Bruteforce Approach(N+n/2=N)
	public static int length(Node head) {
		Node currNode = head;
		int count = 0;
		while (currNode != null) {
			currNode = currNode.next;
			count++;
		}
		return count;

	}

	public static Node findMiddle(Node head) {
		int n = length(head);
		int mid = n / 2;
		int cnt = 0;
		Node temp = head;
		while (cnt < mid) {
			temp = temp.next;
			cnt++;
		}
		return temp;
	}

	// to find the midddle of first if it is even one way
	public static Node findMiddleFirst(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;

	}

	// to find middle of sec if it is even
	public static Node findMiddleSec(Node head) {
		if (head == null || head.next == null) {
			return head;
		
		
		
		}

		// when we have only two element and we have to return sec one in even
		if (head.next.next == null) {
			return head.next;
		}
		Node slow = head;
		Node fast = head.next;

		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
			}
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
//		insert(6);
		printLL();
//		head = findMiddle(head);
//		printLL();

		// when we need to get first even mid use this
//		head = findMiddleFirst(head);
//		printLL();
		// when we need sec middle of even hide above and get
		head = findMiddleSec(head);
		printLL();

	}
}
