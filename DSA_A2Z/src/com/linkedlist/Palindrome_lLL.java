package com.linkedlist;

import java.util.Stack;

import com.linkedlist.Add_1_toNumber.Node;

/*
 * https://leetcode.com/problems/palindrome-linked-list/description/
 * leetcode 234
 * 
 */
public class Palindrome_lLL {

	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Bruteforce Approach
	public static boolean isPalindrome1(Node head) {

		// we will use stack to put the element in the stack and iterate over list again
		// and check
//		if it is matching then true else false
		Stack<Node> s = new Stack<>();
		Node temp = head;
		while (temp != null) {
			s.add(temp);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			if (temp != s.pop()) {
				return false;
			}
			s.pop();
			temp = temp.next;
		}
		return true;

	}

	// optimal approach
	public static boolean isPalindrome2(Node head) {

		if (head == null || head.next == null) {
			return true;
		}
		Node fast = head;
		Node slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		Node newHead = reverseLL(slow.next);
		Node first = head;
		Node sec = newHead;
		while (sec != null) {
			if (first.data != sec.data) {
				reverseLL(newHead);
				return false;
			}
			first = first.next;
			sec = sec.next;
		}
		reverseLL(newHead);
		return true;

	}

	public static Node reverseLL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;

		}
		return prev;
	}

	// Function to print the linked list
	public static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(2);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(1);

		// Print the original linked list
		System.out.print("Original Linked List: ");
		printLinkedList(head);

		// Check if the linked list is a palindrome
		if (isPalindrome2(head)) {
			System.out.println("The linked list is a palindrome.");
		} else {
			System.out.println("The linked list is not a palindrome.");
		}
	}

}
