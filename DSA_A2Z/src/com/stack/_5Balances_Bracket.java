  package com.stack;

import java.util.Stack;

public class _5Balances_Bracket {
	public static void main(String[] args) {

//		String s = "(()((((()(";
		String s="()";
		System.out.println(isValid(s));

		System.out.println(isValidParenthesis(s));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				if (c == ')' && stack.pop() != '(')
					return false;
				if (c == '}' && stack.pop() != '{')
					return false;
				if (c == ']' && stack.pop() != ']')
					return false;
			}
		}
		return stack.isEmpty();

	}

	public static boolean isValidParenthesis(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isOpening(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if (!isMatching(stack.peek(), c)) {
					return false;
				} else {
					stack.pop();
				}
			}
		}

		return stack.isEmpty();
	}

	public static boolean isOpening(char c) {
		return (c == '{' || c == '(' || c == '[');
	}

	public static boolean isMatching(char topCharacter, char actual) {
		return ((topCharacter == '{' && actual == '}') || (topCharacter == '(' && actual == ')')
				|| (topCharacter == '[' && actual == ']'));
	}
}
