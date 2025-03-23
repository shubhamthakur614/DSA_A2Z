package com.string;

public class Test {

	private static Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		return;
	}

	public static void insertLast(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		return;
	}

	public static void removeFirst() {

		if (head == null || head.next == null) {
			head = null;
			return;
		}
		head = head.next;
		return;
	}

	public static void removeLast() {

		if (head == null || head.next == null) {
			head = null;
			return;
		}
		Node prev = head;
		Node curr = head.next;
		while (curr.next != null) {
			curr = curr.next;
			prev = prev.next;
		}
		prev.next = null;
		return;
	}

	public static void insert_at_index(int data, int index) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		int count = 1;
		Node curr = head;
		if (index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		while (index > count) {
			curr = curr.next;
			count++;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return;
	}

	public static void delete_at_index(int index) {

		if (head == null || head.next == null) {
			head = null;
			return;
		}
		int count = 1;
		Node curr = head;
		if (index == 0) {
			head = head.next;
			return;
		}
		while (index > count) {
			curr = curr.next;
			count++;
		}
		curr.next = curr.next.next;
		return;
	}

	public static Node reverseLL() {

		if (head == null || head.next == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node endNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = endNode;
		}
		head.next = null;

		return prev;
	}

	public static Node reverseLLRecursive(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseLLRecursive(head.next);
		Node front = head.next;
		front.next = head;
		head.next = null;
		return newHead;

	}

	public static void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		return;

	}

	public static void printLL() {
		if (head == null) {
			System.out.println("Linekd list is empty!!!!");
			return;
		}
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("NULL");
	}
	
	public static Node middleLL(Node head) {
		int n=length(head);
		int mid=n/2;
		int count=0;
		Node temp=head;
		while(count<mid) {
			count++;
			temp=temp.next;
		}
		return temp;
	}
	public static int length(Node head) {
		
		int count=0;
		Node temp=head;
		while(temp!=null) {

			temp=temp.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		printLL();
//		insertFirst(5);
//		insertLast(50);
//		printLL();
//		removeFirst();
//		printLL();
//		removeLast();
//		printLL();
//		insert_at_index(70, 2);
//		printLL();
//		delete_at_index(4);
//		printLL();
//		head = reverseLL();
//		printLL();
//		head = reverseLLRecursive(head);
//		printLL();
		head=middleLL(head);
		printLL();

	}

}
