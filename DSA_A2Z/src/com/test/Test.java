package com.test;

public class Test {
	public static void main(String[] args) {

		String s = "my name is shubham";
		System.out.println(reverse(s));

	}

	public static String reverse(String str) {

		String rev = "";
		int f = str.length() - 1;
		int l = str.length() - 1;
		char[] c = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {

			if (str.charAt(i) == ' ' || i == 0) {
				f = (i == 0) ? i : i + 1;
				rev += swap(c, f, l);
				if (i > 0) {
					rev = rev + " ";
				}
				l = i - 1;
			}
		}
		return rev;
	}

	public static String swap(char[] str, int a, int b) {
		String rev = "";
		for (int i = a; i <= b; i++) {
			rev += str[i];
		}
		return rev;
	}

}
