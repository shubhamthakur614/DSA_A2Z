package com.linkedlist;

class LinkedList {

}

public class PrintLLInReverseOrder {
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

	public static void print() {
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

	public static void reversePrintLL(Node head) {
		if (head == null) {
			return;
		}
		reversePrintLL(head.next);
		System.out.print(head.data + " -> ");
		return;

	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		print();
		reversePrintLL(PrintLLInReverseOrder.head);

	}

}
