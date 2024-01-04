package com.stack;

class Stack {
	int size = 1000;
	int[] arr = new int[size];
	int top = -1;

	public void push(int data) {

		top++;
		arr[top] = data;
	}

	public int pop() {
		int data = arr[top];
		top--;
		return data;
	}

	public int peek() {
		return arr[top];
	}

	public int size() {

		return top + 1;
	}

}

public class _3ImplementingStackUsingArray {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(1);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.size());

	}
}
