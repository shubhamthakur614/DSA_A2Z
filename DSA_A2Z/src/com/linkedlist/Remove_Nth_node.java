package com.linkedlist;

/*
 *  19.Remove Nth Node From End of List(Leet code)
 *  https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *  Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]

 */
public class Remove_Nth_node {
	public static void main(String[] args) {

		Node addElement = addElement(1);
		addElement.next = addElement(2);
		addElement.next.next = addElement(3);
		addElement.next.next.next = addElement(4);
		addElement.next.next.next.next = addElement(5);
		printLL(addElement);
		Node removeAtNode = removeAtNode(addElement, 2);
		printLL(removeAtNode);
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
			System.out.println("Linked List Is Empty...");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println(" Null ");
	}

	public static Node removeAtNode(Node head, int n) {
		if (head.next == null) {
			head = null;
			return head;
		}

//		find the size
		int size = 0;
		Node currNode = head;
		while (currNode != null) {
			currNode = currNode.next;
			size++;
		}

		if (size == n) {
			head = head.next;
			return head;
		}
		int findIndex = size - n;
		int i = 1;
		Node prev = head;
		while (i < findIndex) {
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return head;
	}

	// sec solution by using two pointer approach
	/*
	 * Here we take two pointer at head slow and fast and check if my asking idx is
	 * greater than zero then iterate your fast ptr greater than upto zero check if
	 * my fast is equal to null if yes then head.next if not then iterater unless my
	 * fast.next equal to null and move both the ptr once fast reaches to null then
	 * slow next connect to its next.next and return head
	 */
	public static Node removeAtLastNode(Node head, int idx) {
		if (head == null) {
			head = null;
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (idx > 0) {
			fast = fast.next;
			idx--;
		}
		// edge case when idx is equal to size then move head pointer to next
		if (fast == null) {
			head = head.next;
			return head;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return head;
	}

}
