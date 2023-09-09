package com.linkedlist;

public class LinkedListDemo {

	Node head;

	static class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}

	}

	public void addFirst(String data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(String data) {

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

	public void deleteFirst() {

		if (head == null) {
			System.out.println("Linked List is Empty...");
			return;
		}
		head = head.next;
	}

	public void deleteLast() {

		if (head == null) {
			System.out.println("Linked is Empty...");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node secLast = head;
		Node lastNode = head.next;

		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secLast = secLast.next;
		}
		secLast.next = null;

	}

	public void printLL() {

		if (head == null) {
			System.out.println("Linked List is Empty...");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println(" Null");

	}

	public static void main(String[] args) {
		LinkedListDemo ll = new LinkedListDemo();
		ll.addFirst("a");
		ll.printLL();
		ll.addLast("z");
		ll.printLL();
		ll.addFirst("c");
		ll.printLL();
		ll.deleteFirst();
		ll.printLL();
		ll.deleteLast();
		ll.printLL();

	}

}
