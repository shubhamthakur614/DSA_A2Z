package com.linkedlist;

/*
 
 *https://www.naukri.com/code360/problems/add-one-to-a-number-represented-as-linked-list_920557?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    i/p:143 
    0/p :144
    
    i/p 99
    o/p 100
 */
public class Add_1_toNumber {
	static Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
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

//bruteforce approach O(3N)
	public static Node add1Method1(Node head) {

		// we will reverse the LL and add the one to it
		if (head == null) {
			return head;
		}
		Node temp = reverseLL(head);
		int carry = 1;
		while (temp != null) {
			temp.data += carry;
			if (temp.data < 10) {
				carry = 0;
				break;
			} else {
				temp.data = 0;
				carry = 1;
			}
			temp = temp.next;
		}
		if (carry == 1) {
			Node newNode = new Node(carry);
			head = reverseLL(head);
			newNode.next = head;
			head = newNode;
		}
		return reverseLL(head);

	}

	// optimal solution
	public static Node add1Method2(Node head) {
		// we will use recursive stack without reversing
		int carry = helpClass(head);
		if (carry == 1) {
			Node newNode = new Node(carry);
			head = reverseLL(head);
			newNode.next = head;
			head = newNode;
		}
		return head;

	}

	public static int helpClass(Node head) {
		if (head == null) {
			return 0;
		}
		int carry = helpClass(head.next);
		head.data += carry;
		if (head.data < 10) {
			return 0;
		}
		head.data = 0;
		return 1;
	}

	public static void main(String[] args) {

	}

}
