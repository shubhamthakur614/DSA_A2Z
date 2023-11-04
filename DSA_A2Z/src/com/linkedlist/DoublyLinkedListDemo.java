package com.linkedlist;

public class DoublyLinkedListDemo {

	static Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static void printLL() {
		if (head == null) {
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print( currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	public static void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev=null;
		if (head!= null) {
			head.prev = newNode;
		}
		head = newNode;
	}

	public static void main(String[] args) {
		addFirst(10);
		printLL();

	}

}
