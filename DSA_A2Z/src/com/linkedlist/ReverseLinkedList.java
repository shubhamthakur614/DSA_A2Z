package com.linkedlist;

public class ReverseLinkedList {

	private static Node head;

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
		return;

	}

	public static void printLL(Node head) {

		if (head == null) {
			System.out.println("Linked List is Empty!!!");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	public static void reverseLL() {

		if (head == null || head.next == null) {
			return;
		}
		Node prevNode = null;
		Node currNode = head;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;

	}

	public static Node reverseLLRecursive(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseLLRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;

	}

	public static void main(String[] args) {

		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		printLL(head);
//		reverseLL();
		ReverseLinkedList ll = new ReverseLinkedList();
		Node reverseLLRecursive = reverseLLRecursive(head);
		printLL(reverseLLRecursive);
	}

}
