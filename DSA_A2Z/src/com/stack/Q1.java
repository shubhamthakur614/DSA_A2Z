package com.stack;

import java.util.Stack;

/*
 * 155. Min Stack(medium)
 * https://leetcode.com/problems/min-stack/description/
 * implement the statck function with create getMin funtion with o(1) retrival time
 * 
 * i/p =-1,0,-3
 * o/p -3 for get min
 */
public class Q1 {
	static class MyStack {

		static Stack<Integer> s;
		static Stack<Integer> ans;

		public MyStack() {
			s = new Stack<>();
			ans = new Stack<>();
		}

		public static void push(int val) {

			if (ans.isEmpty() || ans.peek() >= val) {
				ans.push(val);
			}
			s.push(val);
		}

		public static void pop() {

			if (ans.peek() == s.peek()) {
				ans.pop();
			}
			s.pop();
		}

		public static int top() {
			return s.peek();
		}

		public static int getMin() {
			return ans.peek();
		}

	}

	public static void main(String[] args) {

		MyStack ms = new MyStack();
		ms.push(-1);
		ms.push(0);
		ms.push(-3);
		ms.push(4);
		System.out.println(ms.getMin());

	}

}
