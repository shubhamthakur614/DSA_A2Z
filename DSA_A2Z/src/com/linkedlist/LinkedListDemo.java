   
package com.linkedlist;

public class LinkedListDemo {

	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void addFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		return;

	}

	public static void addLast(int data) {
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

	public static void removeFirst() {
		if (head == null) {
			System.out.println("Linked List is Empty so we cant delete at First Element");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		head = head.next;
		return;
	}

	public static void removeLast() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node prevNode = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			prevNode = prevNode.next;
			lastNode = lastNode.next;
		}
		prevNode.next = null;
		return;

	}

	public static void add_at_index(int data, int index) {
		Node newNode = new Node(data);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		int count = 1;
		Node currNode = head;
		while (count < index) {
			currNode = currNode.next;
			count++;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return;

	}

	public static void remove_at_index(int index) {
		if (head == null) {
			return;
		}
		if (index == 0) {
			head = head.next;
			return;
		}
		Node currNode = head;
		int count = 2;
		if (count < index) {
			currNode = currNode.next;
			count++;
		}
		currNode.next = currNode.next.next;
		return;

	}

	public static void printLL() {
		if (head == null) {
			System.out.println("Linked list is Emprty!!!!");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");

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

	public static void main(String[] args) {
		// printLL();
		// addFirst(1);
		// printLL();
		// addLast(5);
		// printLL();
		// addFirst(2);
		// printLL();
		// addLast(4);
		// printLL();
		// removeFirst();
		// printLL();
		// removeLast();
		// printLL();
		// add_at_index(7,1);
		// printLL();
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		printLL();
		remove_at_index(0);
		printLL();

	}

}
