package com.stack;

import java.util.Stack;

/*
 * Insert the data at the bottom of the stack 
 * i/p=1234
 * o/p=51234
 */
public class _3InsertATBottom {

//	we are using java build in stack

	static Stack<Integer> s = new Stack();

	public static void pushAtBottom(int data, Stack<Integer> s) {

		if (s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data, s);
		s.push(top);

	}

	public static void main(String[] args) {

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		pushAtBottom(5, s);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
