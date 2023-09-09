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

	public Node addFirst(String data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}

	public Node addLast(String data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
		return head;
	}

	public Node deleteFirst() {

		if (head == null) {
			System.out.println("Linked List is Empty...");
			return null;
		}
		head = head.next;
		return head;
	}

	public Node deleteLast() {

		if (head == null) {
			System.out.println("Linked is Empty...");
			return null;
		}
		if (head.next == null) {
			head = null;
			return null;
		}
		Node secLast = head;
		Node lastNode = head.next;

		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secLast = secLast.next;
		}
		secLast.next = null;
		return head;

	}

	public void printLL(Node refNode) {

		if (refNode == null) {
			System.out.println("Linked List is Empty...");
			return;
		}
		Node currNode = refNode;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println(" Null");

	}

	public static void main(String[] args) {
		LinkedListDemo ll = new LinkedListDemo();
		Node addFirst = ll.addFirst("a");
		ll.printLL(addFirst);
		Node addLast = ll.addLast("z");
		ll.printLL(addLast);
		addFirst = ll.addFirst("c");
		ll.printLL(addFirst);
		Node deleteFirst = ll.deleteFirst();
		ll.printLL(deleteFirst);
		Node deleteLast = ll.deleteLast();
		ll.printLL(deleteLast);

	}

}
