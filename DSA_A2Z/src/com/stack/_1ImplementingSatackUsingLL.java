package com.stack;

/*
 * Implementing Stack using Linked List
 */
public class _1ImplementingSatackUsingLL {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class Stack {
		public static Node head;
		static int count = 0;

		public static boolean isEmpty() {
			return head == null;
		}

		public static void push(int data) {
			count++;
			Node newNode = new Node(data);
			if (isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}

		public static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}

		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return head.data;
		}

		public static int size() {
			return count;
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println("Size of Stack is: " + s.size());
	}

}
