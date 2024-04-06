package com.linkedlist;

/*
 * https://leetcode.com/problems/add-two-numbers/description/
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
  Output: [7,0,8]
  Explanation: 342 + 465 = 807.
 */
public class AddTwoNumber {
	static Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node addTwoNo(Node head1, Node head2) {

		Node dummy = new Node(0);
		Node curr = dummy;
		int carry = 0;
		while (head1 != null || head2 != null) {
			int sum = carry;
			if (head1 != null) {
				sum = sum + head1.data;
				head1 = head1.next;
			}
			if (head2 != null) {
				sum = sum + head2.data;
				head2 = head2.next;
			}
			Node newNode = new Node(sum % 10);
			carry = sum / 10;
			curr.next = newNode;
			curr = curr.next;
		}
		if (carry > 0) {
			curr.next = new Node(carry);
		}
		return dummy.next;
	}

	public static void main(String[] args) {

	}

}
