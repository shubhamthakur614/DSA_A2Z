package com.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node addElement = addElement(1);
		addElement.next = addElement(2);
		addElement.next.next = addElement(3);
		addElement.next.next.next = addElement(4);
		addElement.next.next.next.next = addElement(5);

		printLL(addElement);
		Node reverseLL = reverseLL(addElement);
		printLL(reverseLL);

	}

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node addElement(int data) {
		return new Node(data);
	}

	public static void printLL(Node head) {

		if (head == null) {
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println(" Null");
	}

	public static Node reverseLL(Node head) {

		if (head == null || head.next == null) {
			return null;
		}
		Node prevNode = head;
		Node currNode = head.next;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
		return head;

	}

}
