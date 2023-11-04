package com.linkedlist;

public class Delete_At_Specific_position {
	private static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
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

	public static void printLL() {
		if (head == null) {
			System.out.println("LL is Empty ...");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println(" Null");

	}

	public static void deleteAtPosition(int position) {

		// if LL is empty
		if (head == null) {
			return;
		}
		if (position == 0) {
			head = head.next;
			return;
		}
		
		Node currNode = head;
		int count = 1;
		while (count < position) {
			currNode = currNode.next;
			count++;
		}
		currNode.next = currNode.next.next;

	}

	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		printLL();
		deleteAtPosition(2);
		printLL();
	}

}
