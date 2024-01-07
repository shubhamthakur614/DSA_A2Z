package com.test;

public class Test {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
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
			int temp = head.data;
			head = head.next;
			return temp;
		}

		public static int peek() {
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
//		s.pop();
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
