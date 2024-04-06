package com.linkedlist;

/*
 * https://leetcode.com/problems/rotate-list/description/
 * leetcode 61
 * Input: head = [1,2,3,4,5], k = 2
   Output: [4,5,1,2,3]
 */
public class RotateLL {
	static class Node {
		int num;
		Node next;

		Node(int a) {
			num = a;
			next = null;
		}
	}

	static Node insertNode(Node head, int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return head;
		}
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;

		temp.next = newNode;
		return head;
	}

	// utility function to print list
	static void printList(Node head) {
		while (head.next != null) {
			System.out.print(head.num + "->");
			head = head.next;
		}
		System.out.println(head.num);

	}

	public static Node rotateLinkedList(Node head, int k) {

		if (head == null || k == 0) {
			return head;
		}
		Node temp = head;
		int length = 1;
		while (temp.next != null) {
			length++;
			temp = temp.next;

		}
		// edge case
		if (k % length == 0) {
			return head;
		}
		temp.next = head;

		k = k % length;// if i have k more than length

		Node newHead = findkthNode(head, length - k);
		head = newHead.next;
		newHead.next = null;
		return head;

	}

	public static Node findkthNode(Node temp, int k) {
		int cnt = 1;
		while (temp != null) {
			if (k == cnt) {
				return temp;
			}
			temp = temp.next;
			cnt++;
		}
		return temp;
	}

	public static void main(String args[]) {
		Node head = null;
		// inserting Node
		head = insertNode(head, 1);
		head = insertNode(head, 2);
		head = insertNode(head, 3);
		head = insertNode(head, 4);
		head = insertNode(head, 5);

		System.out.println("Original list: ");
		printList(head);

		int k = 2;
		Node newHead = rotateLinkedList(head, k);// calling function for rotating right
//	    of the nodes by k times

		System.out.println("After " + k + " iterations: ");
		printList(newHead);// list after rotating nodes

	}
}
