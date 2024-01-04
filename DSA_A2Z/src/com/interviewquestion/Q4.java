package com.interviewquestion;

public class Q4 {
	public static void main(String[] args) {
		String s = "rotator";
		System.out.println(palindromString(s));
		int a = 14521;
		System.out.println(palindromInteger(a));
	}

	public static boolean palindromString(String s) {

		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
	public static boolean palindromInteger(int a) {

		int rem = 0;
		int rev = 0;

		int temp = a;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (a == rev) {
			return true;
		}
		return false;

	}
}
