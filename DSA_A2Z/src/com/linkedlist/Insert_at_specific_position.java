package com.linkedlist;

/*
 *  10 12 15 17 
 *  insert at position 1 is 14 and use as start from 0
 *  10 14 12 15 17 
 */
public class Insert_at_specific_position {

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

	public static void insert_at_given_position(int data, int index) {

		Node newNode = new Node(data);
		if (head == null) {
			head=newNode;
			return;
			
			
		}
		// if i want to insert at first Position
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

	}

	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(40);
		insert(50);
		printLL();

		insert_at_given_position(14, 2);
		printLL();
	}

}
