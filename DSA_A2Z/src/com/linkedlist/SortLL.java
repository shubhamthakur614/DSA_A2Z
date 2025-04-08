package com.linkedlist;

public class SortLL {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static void printLL(Node head) {
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

	public static void main(String[] args) {

		Node head=new Node(5);
		head.next=new Node(2);
		head.next.next=new Node(1);
		head.next.next.next=new Node(3);
		printLL(head);
		head=sortList(head);
		printLL(head);
		
	}

	public static Node sortList(Node head) {
		// Write your code here
		if (head == null || head.next == null) {
			return head;
		}
		Node mid = findMiddle(head);
		Node left = head;
		Node right = mid.next;
		mid.next = null;
		left = sortList(left);
		right = sortList(right);
		return mergeTwoLL(left, right);

	}

	public static Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public static Node mergeTwoLL(Node left, Node right) {

		Node dummy = new Node(-1);
		Node temp = dummy;
		while (left != null && right != null) {
			if (left.data < right.data) {
				temp.next = left;
				temp = left;
				left = left.next;
			} else {
				temp.next = right;
				temp = right;
				right = right.next;
			}
		}
		if (left != null) {
			temp.next = left;
		} else {
			temp.next = right;
		}
		return dummy.next;
	}

}
