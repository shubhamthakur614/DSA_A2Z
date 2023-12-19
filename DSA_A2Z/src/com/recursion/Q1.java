package com.recursion;
//Basic All question of recursion

public class Q1 {

	public static void main(String[] args) {

		// print the number in ascending order with n
		printAscending(5);

		// find the n natural number sum =n*(n+1)/2

		System.out.println("sum of natural is: " + naturalNumber(5));

		// find the factorial of number

		System.out.println("Factorial of  " + 5 + " is: " + factorial(5));

		// fibonacci number
		System.out.println("Fibonacci no of " + 10 + " is " + fibo(10));

		// string is palindrome
		char[] c = { 'a', 'b', 'c', 'b', 'a' };
		System.out.println("abcab is is palindrome or not : " + isPalindrome(c, 0, c.length - 1));

		System.out.println("Pow of 2^3 is : " + pow(2, 3));
	}

	public static void printAscending(int n) {

		if (n == 0) {
			return;
		}
		printAscending(n - 1);
		System.out.println(n);
	}

	public static int naturalNumber(int n) {
		if (n == 1) {
			return 1;
		}
		int temp = naturalNumber(n - 1);
		return temp + n;
	}

	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		}

		int temp = factorial(n - 1);
		return temp * n;
	}

	public static int fibo(int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int temp1 = fibo(n - 1);
		int temp2 = fibo(n - 2);
		return temp1 + temp2;
	}

	public static boolean isPalindrome(char[] c, int s, int e) {

		if (s == e) {
			return true;
		}
		if (c[s] == c[e]) {
			boolean flag = isPalindrome(c, s + 1, e - 1);
			return flag;
		} else {
			return false;
		}
	}

	public static int pow(int a, int n) {

		if (n == 1) {
			return a;
		}
		int temp = pow(a, n - 1);
		return temp * a;

	}
}
